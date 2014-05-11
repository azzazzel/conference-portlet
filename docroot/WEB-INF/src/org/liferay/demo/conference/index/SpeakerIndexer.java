package org.liferay.demo.conference.index;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import javax.portlet.PortletURL;

import org.liferay.demo.conference.ConferenceConstants;
import org.liferay.demo.conference.model.Speaker;
import org.liferay.demo.conference.service.SpeakerLocalServiceUtil;
import org.liferay.demo.conference.service.persistence.SpeakerActionableDynamicQuery;

public class SpeakerIndexer extends BaseIndexer {

	public static final String[] CLASS_NAMES = { Speaker.class.getName() };


	public SpeakerIndexer() {
		setPermissionAware(true);
	}

	@Override
	public void addRelatedEntryFields(Document document, Object obj)
			throws Exception {

		if (obj instanceof DLFileEntry) {
			DLFileEntry dlFileEntry = (DLFileEntry) obj;

			Speaker speaker = SpeakerLocalServiceUtil.getSpeaker(GetterUtil
					.getLong(dlFileEntry.getTitle()));

			document.addKeyword(Field.CLASS_NAME_ID,
					PortalUtil.getClassNameId(Speaker.class.getName()));
			document.addKeyword(Field.CLASS_PK, speaker.getSpeakerId());
			document.addKeyword(Field.RELATED_ENTRY, true);
		}
	}

	@Override
	public String[] getClassNames() {
		return CLASS_NAMES;
	}

	@Override
	public String getPortletId() {
		return ConferenceConstants.SPEAKERS_PORTLET_ID;
	}

	@Override
	public boolean hasPermission(PermissionChecker permissionChecker,
			String entryClassName, long entryClassPK, String actionId)
			throws Exception {

		// return SpeakerPermission.contains(
		// permissionChecker, entryClassPK, ActionKeys.VIEW);

		return true;
	}

	@Override
	public void postProcessContextQuery(BooleanQuery contextQuery,
			SearchContext searchContext) throws Exception {

		addStatus(contextQuery, searchContext);

		int speakerId = GetterUtil.getInteger(searchContext
				.getAttribute("speakerId"));

		if (speakerId != 0) {
			contextQuery.addRequiredTerm("speakerId", speakerId);
		}
	}

	@Override
	public void postProcessSearchQuery(BooleanQuery searchQuery,
			SearchContext searchContext) throws Exception {

		if (searchContext.getAttributes() == null) {
			return;
		}

		addSearchTerm(searchQuery, searchContext, Field.TITLE, true);
		addSearchTerm(searchQuery, searchContext, "bio", true);
	}

	@Override
	protected void doDelete(Object obj) throws Exception {
		Speaker speaker = (Speaker) obj;

		deleteDocument(speaker.getCompanyId(), speaker.getSpeakerId());
	}

	@Override
	protected Document doGetDocument(Object obj) throws Exception {
		Speaker speaker = (Speaker) obj;

		Document document = getBaseModelDocument(ConferenceConstants.SPEAKERS_PORTLET_ID, speaker);

		document.addDate(Field.MODIFIED_DATE, speaker.getModifiedDate());
		document.addText(Field.TITLE, speaker.getName());
		document.addKeyword("speakerId", speaker.getSpeakerId());
		document.addText("bio", speaker.getBio());


		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale,
			String snippet, PortletURL portletURL) {

		Summary summary = createSummary(document);

		summary.setMaxContentLength(200);

		String title = document.get(Field.TITLE);

		String content = snippet;

		if (Validator.isNull(snippet)) {
			content = StringUtil.shorten(document.get("bio"), 200);
		}

		portletURL.setParameter("jspPage", "/html/speakers/speaker.jsp");
		portletURL.setParameter("speakerId", document.get(Field.CLASS_PK));

		return new Summary(title, content, portletURL);
	}

	@Override
	protected void doReindex(Object obj) throws Exception {
		Speaker speaker = (Speaker) obj;

		Document document = getDocument(speaker);

		SearchEngineUtil.updateDocument(getSearchEngineId(),
				speaker.getCompanyId(), document);
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		Speaker speaker = SpeakerLocalServiceUtil.getSpeaker(classPK);

		doReindex(speaker);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		long companyId = GetterUtil.getLong(ids[0]);

		reindexEntries(companyId);
	}

	@Override
	protected String getPortletId(SearchContext searchContext) {
		return ConferenceConstants.SPEAKERS_PORTLET_ID;
	}

	protected void reindexEntries(long companyId) throws PortalException,
			SystemException {

		final Collection<Document> documents = new ArrayList<Document>();

		ActionableDynamicQuery actionableDynamicQuery = new SpeakerActionableDynamicQuery() {

			@Override
			protected void addCriteria(DynamicQuery dynamicQuery) {
			}

			@Override
			protected void performAction(Object object) throws PortalException {
				Speaker speaker = (Speaker) object;

				Document document = getDocument(speaker);

				documents.add(document);
			}

		};

		actionableDynamicQuery.setCompanyId(companyId);

		actionableDynamicQuery.performActions();

		SearchEngineUtil.updateDocuments(getSearchEngineId(), companyId,
				documents);
	}

}
