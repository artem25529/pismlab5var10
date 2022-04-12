<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="<c:url value="/myServlet"/>">
    Enter year: <input type="number" name="year" value="${param.year}"/><br/>
    <input type="submit" value="find">
</form>

<c:if test="${not empty res}">
    <c:out value="Year name: ${res}"/>
</c:if>
</body>
</html>
