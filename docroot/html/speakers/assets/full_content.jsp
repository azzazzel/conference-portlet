
<%@ include file="../../init.jsp" %>

<liferay-util:include page="/html/speakers/speaker.jsp" servletContext="<%= application %>">
	<liferay-util:param name="hideHeader" value="<%= String.valueOf(true) %>" />
</liferay-util:include>
