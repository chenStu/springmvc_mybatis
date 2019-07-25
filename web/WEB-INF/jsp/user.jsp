<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
    <script type="text/javascript">
        function byName() {
            document.submit.action = "findUserByName.action";
            document.submit.submit();
        }
        
        function insert() {
            document.submit.action = "insertUser.action";
            document.submit.submit();
        }
    </script>
</head>
<body>
<form name="submit" method="post">
    <table align="center" border="1" cellspacing="0" cellpadding="1">
        <tr>
            <td colspan="2"><input type="text" name="name"><button type="button" onclick="byName()">查询</button></td>
            <td colspan="2" align="center"><a href="findAllUser.action">查询所有</a></td>
        </tr>
        <tr align="center">
            <td>id</td>
            <td>username</td>
            <td>password</td>
            <td>操作</td>
        </tr>
        <c:forEach var="user" items="${userList}">
            <tr align="center">
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>
                    <a href="findUserById.action?id=${user.id}">修改</a>
                    <a href="deleteUser.action?id=${user.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
        <tr align="center">
            <td></td>
            <td><input type="text" name="username"></td>
            <td><input type="password" name="password"></td>
            <td><button type="button" onclick="insert()">添加</button></td>
        </tr>
    </table>
</form>
</body>
</html>
