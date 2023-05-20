<%--
  Created by IntelliJ IDEA.
  User: 27598
  Date: 2023/4/14
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="register" method="post">
    <label for="name">邮箱：</label>
    <input type="text" name="name" id="name"><br>
    <label for="passward1">密码：</label>
    <input type="text" id="passward1" name="passward1"><br>
    <label for="passward2">请再次输入密码：</label>
    <input type="text" id="passward2" name="passward2"><br>
    <input type="submit" value="提交">
    <input type="button" value="返回" onclick="window.location.href='/hello/login'">
    <script>
        function fanhui(){
            window.close();
            window.open("login","window","toolbar=no,menubar=no,scrollbars=no,resizable=no, location=no,status=no");

        }
    </script>
</form>
</body>
</html>
