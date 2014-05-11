
<%@ include file="../init.jsp" %>

<%

long speakerId = ParamUtil.getLong(request, "speakerId");
Speaker speaker;

if (speakerId > 0) {
	speaker = SpeakerLocalServiceUtil.getSpeaker(speakerId);
}
else {
	speaker = (Speaker)request.getAttribute("speaker");
}
String redirect = ParamUtil.getString(request, "redirect");

%>

	<aui:nav-bar>
		<aui:nav>
		
				<portlet:renderURL var="editURL">
					<portlet:param name="jspPage" value="/html/speakers/edit.jsp" />
					<portlet:param name="speakerId" value="<%= String.valueOf(speaker.getSpeakerId()) %>" />
					<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(liferayPortletRequest) %>" />
				</portlet:renderURL>
	
				<aui:nav-item href="<%= editURL %>" iconCssClass="icon-pencil" label="edit" />
				
				<portlet:actionURL name="deleteSpeaker" var="deleteURL">
					<portlet:param name="speakerId" value="<%= String.valueOf(speaker.getSpeakerId()) %>" />
					<portlet:param name="redirect" value="<%= redirect %>" />
				</portlet:actionURL>
	
				<aui:nav-item href="<%= deleteURL %>" iconCssClass="icon-remove" label="delete"/>
				
		</aui:nav>
	</aui:nav-bar>

<div class="speaker-panel" style="width: 65%; float:left">
	
	<div class="speaker-image-box">
		<img alt="<%= speaker.getName() %>" class="speaker-image img-circle" src="<%= speaker.getImageURL(themeDisplay) %>"/>
	</div>

	<h3 class="speaker-name">
		<%= speaker.getName() %>
	</h3>
	

	<div class="speaker-data-box">
		<%= speaker.getBio() %>
	</div>
	
</div>


<div style="width:100%; text-align: center; clear: both;">

	<a class="icon-circle-arrow-left previous-level" title="Back" href="<%=redirect %>"></a>
</div>

