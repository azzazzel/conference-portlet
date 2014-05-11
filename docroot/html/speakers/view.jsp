
<%@ include file="../init.jsp" %>

<%

List<Speaker> speakers = SpeakerLocalServiceUtil.getSpeakers(scopeGroupId);
%>

	<aui:nav-bar>
				<aui:nav>
					<portlet:renderURL var="addSpeakerURL">
						<portlet:param name="jspPage" value="/html/speakers/edit.jsp" />
						<portlet:param name="redirect" value="<%= PortalUtil.getCurrentURL(renderRequest) %>" />
					</portlet:renderURL>
			
					<aui:nav-item href="<%= addSpeakerURL %>" iconCssClass="icon-plus" label="add" />
				</aui:nav>
	</aui:nav-bar>


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
