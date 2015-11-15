<%--
  Created by IntelliJ IDEA.
  User: andres
  Date: 11/15/15
  Time: 6:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado de la conexión</title>
</head>
<body>

<h1>Resultado de la conexión</h1>

<c:if test="${not empty param.connection}" >
  La conexión ha sido recuperado desde la petición.
</c:if>

<!-- The connection is obtained from the request object -->

</body>
</html>
