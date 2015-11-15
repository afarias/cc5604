<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JDBC Testing</title>
</head>


<body>

<h1>Prueba de conexión</h1>

<p>Esta página le permite establecer una conexión a una BDD PosgreSQL (cuyo driver va incluido en esta aplicación).</p>


<!-- if the DB driver was not loaded successfully, only a warning message is shown -->
<c:if test="${!applicationScope.driverFound}">
    El driver no fue encontrado
</c:if>

<c:if test="${applicationScope.driverFound}">
    <form method="post" action="connectToDB">

        <!-- Input para el Host -->
        <label for="host">
            Host: <input type="text" id="host" name="host">
        </label>

        <!-- Input para el Puerto -->
        <label for="port">
            Port: <input type="text" id="port" name="port">
        </label><br/>

        <!-- Input para el Password -->
        <label for="bdd">
            Base de datos: <input type="text" id="bdd" name="bdd">
        </label><br/>

        <!-- Input para el Usuario -->
        <label for="user">
            User: <input type="text" id="user" name="user">
        </label><br/>

        <!-- Input para el Password -->
        <label for="port">
            Password: <input type="password" id="password" name="password">
        </label><br/>

        <button type="submit">Probar conexión</button>
    </form>
</c:if>
</body>
</html>
