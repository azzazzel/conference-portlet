
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

boolean canUpdate = permissionChecker.hasPermission(themeDisplay.getScopeGroupId(), Speaker.class.getName(), speaker.getSpeakerId(), ActionKeys.UPDATE);
boolean canChangePermissions = permissionChecker.hasPermission(themeDisplay.getScopeGroupId(), Speaker.class.getName(), speaker.getSpeakerId(), ActionKeys.PERMISSIONS);
boolean canDelete = permissionChecker.hasPermission(themeDisplay.getScopeGroupId(), Speaker.class.getName(), speaker.getSpeakerId(), ActionKeys.DELETE);


boolean hideHeader = ParamUtil.getBoolean(request, "hideHeader");
boolean showToolbar = !hideHeader && (canUpdate || canDelete || canChangePermissions);

%>

<c:if test="<%=showToolbar %>">
	<aui:nav-bar>
		<aui:nav>
		
			<c:if test="<%=canUpdate  %>">
				<portlet:renderURL var="editURL">
					<portlet:param name="jspPage" value="/html/speakers/edit.jsp" />
					<portlet:param name="speakerId" value="<%= String.valueOf(speaker.getSpeakerId()) %>" />
					<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(liferayPortletRequest) %>" />
				</portlet:renderURL>
	
				<aui:nav-item href="<%= editURL %>" iconCssClass="icon-pencil" label="edit" />
			</c:if>	
	
			<c:if test="<%=canChangePermissions  %>">
				<liferay-security:permissionsURL
					modelResource="<%= Speaker.class.getName() %>"
					modelResourceDescription="<%= speaker.getName() %>"
					resourcePrimKey="<%= String.valueOf(speaker.getSpeakerId()) %>"
					var="permissionsURL"
					windowState="<%= LiferayWindowState.POP_UP.toString() %>"
				/>
		
				<aui:nav-item href="<%= permissionsURL %>" iconCssClass="icon-key" label="permissions" useDialog="<%= true %>" title="permissions" />
			</c:if>
			
			<c:if test="<%=canDelete  %>">
				<portlet:actionURL name="deleteSpeaker" var="deleteURL">
					<portlet:param name="speakerId" value="<%= String.valueOf(speaker.getSpeakerId()) %>" />
					<portlet:param name="redirect" value="<%= redirect %>" />
				</portlet:actionURL>
	
				<aui:nav-item href="<%= deleteURL %>" iconCssClass="icon-remove" label="delete"/>
			</c:if>
				
		</aui:nav>
	</aui:nav-bar>
</c:if>

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

