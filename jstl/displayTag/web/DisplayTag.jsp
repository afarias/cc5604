<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="cl.uchile.dcc.cc5604.jstl.displaytag.CitiesFactory" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="dt" uri="http://displaytag.sf.net" %>

<html>
<head>
    <title>Display Tag Example</title>
</head>

<body>
<%
    request.setAttribute("cities", CitiesFactory.getAllCities());
%>

<h1>My cities</h1>

<dt:table name="cities" />
</body>
</html>
