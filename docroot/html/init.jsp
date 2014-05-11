

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>

<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>

<%@page import="com.liferay.portal.security.permission.ResourceActionsUtil"%>
<%@page import="com.liferay.portal.security.permission.ActionKeys"%>

<%@page import="com.liferay.portal.util.PortalUtil"%>

<%@page import="com.liferay.portlet.ratings.service.RatingsEntryLocalServiceUtil"%>
<%@page import="com.liferay.portlet.ratings.model.RatingsEntry"%>

<%@page import="java.util.List"%>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.WindowState"%>

<%@page import="org.liferay.demo.conference.ConferenceConstants"%>
<%@page import="org.liferay.demo.conference.model.Speaker"%>
<%@page import="org.liferay.demo.conference.service.SpeakerLocalServiceUtil"%>

<portlet:defineObjects />

<liferay-theme:defineObjects />