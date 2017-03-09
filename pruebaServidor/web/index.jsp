<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Tictum
  Date: 08/03/2017
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
Shell

<form method="post" action="/greet.do" enctype="multipart/form-data">
    <table>
        <tr>
            <td>Selecciona fichero:</td>
            <td><input type="file" name="fichero"></td>
        </tr>
        <tr>

        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Subir fichero"></td>
        </tr>
    </table>
</form>
<form method="post" action="greet" enctype="multipart/form-data">
    <table>
        <tr>
            <td>Selecciona fichero:</td>
            <td><input type="file" name="fichero"></td>
        </tr>
        <tr>

        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Subir fichero"></td>
        </tr>
    </table>
</form>
<form:form method="post" action="/greet" enctype="multipart/form-data" commandName="fileFormBean">
    <table>
        <tr>
            <td>Selecciona fichero: </td>
            <td><input type="file" name="fichero" /></td>
        </tr>
        <tr>

        </tr>
        <tr><td colspan="2" align="center">
            <input type="submit" value="Subir fichero"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
