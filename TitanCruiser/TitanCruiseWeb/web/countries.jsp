<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: andres
  Date: 11/16/15
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Country Manager</title>
</head>

<body>

<h1>Gestor de paises</h1>

<h2>Lista de paises</h2>
There are ${fn:length(param.countries)}

<h2>Agregar un pais</h2>

<!-- To add new countries -->
<form action="addCountry" method="post">

  <input type="text" name="name" /><br/>
  <button type="submit">Crear!</button>

</form>

</body>
</html>
