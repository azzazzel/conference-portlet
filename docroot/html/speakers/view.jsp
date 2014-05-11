
<%@ include file="../init.jsp" %>

<%

List<Speaker> speakers = SpeakerLocalServiceUtil.getSpeakers(scopeGroupId);

boolean canAdd = permissionChecker.hasPermission(themeDisplay.getScopeGroupId(), ConferenceConstants.MODEL_PACKAGE, themeDisplay.getScopeGroupId(), "ADD_SPEAKER");

boolean showToolbar = canAdd;
%>

<c:if test="<%=showToolbar %>">
	<aui:nav-bar>
			<c:if test="<%=canAdd %>">
				<aui:nav>
					<portlet:renderURL var="addSpeakerURL">
						<portlet:param name="jspPage" value="/html/speakers/edit.jsp" />
						<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(renderRequest) %>" />
					</portlet:renderURL>
			
					<aui:nav-item href="<%= addSpeakerURL %>" iconCssClass="icon-plus" label="add" />
				</aui:nav>
			</c:if>
	</aui:nav-bar>
</c:if>


<ul class="speakers-list unstyled">

	<%
	for (Speaker speaker : speakers) {
	%>

	<li class="speaker">

		<portlet:renderURL var="viewURL">
			<portlet:param name="jspPage" value="/html/speakers/speaker.jsp" />
			<portlet:param name="speakerId" value="<%= String.valueOf(speaker.getSpeakerId()) %>" />
			<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(liferayPortletRequest) %>" />
		</portlet:renderURL>

		<a href="<%=viewURL %>">
			<img alt="<%= speaker.getName() %>" class="speaker-image img-circle" src="<%= speaker.getImageURL(themeDisplay) %>" />
		</a>
	
		<h3 class="speaker-name">
			<a href="<%=viewURL %>"><%= speaker.getName() %></a>
			<small>
				<% 
					RatingsEntry ratingsEntry = RatingsEntryLocalServiceUtil.fetchEntry(themeDisplay.getUserId(), Speaker.class.getName(), speaker.getSpeakerId()); 
				%>
				<liferay-ui:ratings-score score="<%=ratingsEntry == null ? 0 : ratingsEntry.getScore() %>" />
				
			</small>
		</h3>
		
		<div class="speaker-bio">	
			<%= speaker.getBio() %>
			<div class="fadeout"></div>
		</div>
		
	</li>

	<%
	}
	%>

</ul>
