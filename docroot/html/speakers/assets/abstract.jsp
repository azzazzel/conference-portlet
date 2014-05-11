
<%@ include file="../../init.jsp" %>

<% 
Speaker speaker = (Speaker)request.getAttribute("speaker");
String portletId = themeDisplay.getPortletDisplay().getId();
String viewURL = (String)request.getAttribute("ASSET_PUBLISHER_VIEW_URL");
%>

<div class="speaker-abstract">
	
	
	<img alt="<%= speaker.getName() %>" class="img-circle" src="<%= speaker.getImageURL(themeDisplay) %>"/>
	
	<h3>
		<a href="<%=viewURL %>"><%= speaker.getName() %></a>
	</h3>
	
	
</div>

<style>
	#p_p_id_<%=portletId %>_ .asset-title,
	#p_p_id_<%=portletId %>_ .asset-more,
	#portlet_<%=portletId %> .asset-title, 
	#portlet_<%=portletId %> .asset-more {
		display: none;
	}
	
	.speaker-abstract {
		position: relative; 
		height: 75px;
	}
	
	.speaker-abstract img {
		position: absolute; 
		left: 0; 
		bottom: 0;	
		width: 75px;
		height: 75px;
	}

	.speaker-abstract h3 {
		position: absolute; 
		left: 100px;
		top: 0; 
		bottom: 0;	
	}
	
</style>
