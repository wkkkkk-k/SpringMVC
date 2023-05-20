<%--
  Created by IntelliJ IDEA.
  User: 27598
  Date: 2023/4/13
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="login" method="post" align="center">
    <label for="name">邮箱：</label>
    <input type="text" id="name" name="name"><br>
    <label for="passward">密码：</label>
    <input type="text" id="passward" name="passward"><br>
    <img id="cap" src="/captcha" style="width: 100px" onclick="refresh()" >
    <input type="text" id="captcha" name="captcha">
    <br>
    <input type="submit" value="提交">
    <input type="button" value="注册" onclick="window.location.href='/hello/toregister'">
</form>

<script>
    function refresh(){
     var img=document.getElementById("cap");
     img.src="/captcha?"+new Date().getTime();
    }
</script>
</body>
</html>
