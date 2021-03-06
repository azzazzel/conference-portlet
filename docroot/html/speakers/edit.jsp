
<%@ include file="../init.jsp" %>

<%
String redirect = ParamUtil.getString(request, "redirect");

long speakerId = ParamUtil.getLong(request, "speakerId");

Speaker speaker = null;

if (speakerId > 0) {
	speaker = SpeakerLocalServiceUtil.getSpeaker(speakerId);
}
%>

<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= (speaker != null) ? speaker.getName() : "new-speaker" %>'
/>


<portlet:actionURL name="saveSpeaker" var="addSpeakerURL" />

<aui:form action="<%= addSpeakerURL %>" enctype="multipart/form-data" method="post" name="fm">
	<aui:model-context bean="<%= speaker %>" model="<%= Speaker.class %>" />

	<aui:input name="speakerId" type="hidden" value="<%= speakerId %>" />
	<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

	<aui:input name="name" label="speaker-name"/>

	<aui:input type="textarea" name="bio" />

	<aui:input name="file" type="file" label="photo"/>
	
	<liferay-ui:custom-attributes-available className="<%= Speaker.class.getName() %>">
		<liferay-ui:custom-attribute-list
			className="<%= Speaker.class.getName() %>"
			classPK="<%= (speaker != null) ? speaker.getSpeakerId() : 0 %>"
			editable="<%= true %>"
			label="<%= true %>"
		/>
	</liferay-ui:custom-attributes-available>

	<c:if test="<%= (speaker == null) %>">
		<aui:field-wrapper label="permissions">
			<liferay-ui:input-permissions
				modelName="<%= Speaker.class.getName() %>"
				/>
		</aui:field-wrapper>
	</c:if>
		
	<liferay-ui:panel defaultState="closed" extended="<%= false %>" id="speakerCategorizationPanel" persistState="<%= true %>" title="categorization">
		<aui:fieldset>
			<aui:input name="categories" type="assetCategories" />

			<aui:input name="tags" type="assetTags" />
		</aui:fieldset>
	</liferay-ui:panel>
	
	<liferay-ui:panel defaultState="closed" extended="<%= false %>" id="speakerAssetLinksPanel" persistState="<%= true %>" title="related-assets">
		<aui:fieldset>
			<liferay-ui:input-asset-links
				className="<%= Speaker.class.getName() %>"
				classPK="<%= speakerId %>"
			/>
		</aui:fieldset>
	</liferay-ui:panel>

	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>
