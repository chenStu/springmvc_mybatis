<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户更新</title>
</head>
<body>
<form action="updateUser.action?id=${user.id}" method="post">
    <table align="center" border="1" cellspacing="0" cellpadding="1">
        <tr>
            <td>id</td>
            <td>${user.id}</td>
        </tr>
        <tr>
            <td>username</td>
            <td><input type="text" name="username" value="${user.username}"></td>
        </tr>
        <tr>
            <td>password</td>
            <td><input type="password" name="password" value="${user.password}"></td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" value="submit">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
