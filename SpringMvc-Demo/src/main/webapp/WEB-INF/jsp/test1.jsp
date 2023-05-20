<%--
  Created by IntelliJ IDEA.
  User: 27598
  Date: 2023/3/30
  Time: 8:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script type="text/javascript" src="./app/javascript/lib/jquery-3.4.1.js"></script>
<style type="text/css">
    .redStyle {
        background: rgba(8, 62, 196, 0.26);
    }
    .yellowStyle {
        background: rgba(166, 167, 168, 0.26);
    }
    .greenStyle {
        background: rgba(166, 167, 168, 0.26);
    }
</style>
<script type="text/javascript">
    var color = "";
    window.onload = function () {
        var trNodes = document.getElementsByTagName("tr");
        for (var index = 1; index < trNodes.length; index++) {
            trNodes[index].className = "redStyle";
            trNodes[index].onmouseover = function () {
                color = this.className;
                this.className = "greenStyle";
            }
            trNodes[index].onmouseout = function () {
                this.className = color;
            }
        }
    }
</script>
<html>
<head>
    <title>test1</title>
</head>
<body>
<h1>Hello,MVC</h1>
<input type="button" id="addCourse" value="新增课程" onclick="addData()">
<script>
   function addData(){
       window.open("addCoursecommit","window","height=70,wigth=100,toolbar=no,menubar=no,scrollbars=no,resizable=no, location=no,status=no");
   }
</script>
<table border="courses" width="500">
        <thead>
        <tr>
            <td height="75" width="100" bgcolor="#ba55d3">name</td>
            <td height="75" width="100" bgcolor="#ba55d3">hours</td>
            <td height="75" width="100" bgcolor="#ba55d3">school</td>
            <td height="75" width="100" bgcolor="#ba55d3">操作</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="course" items="${list}">
            <tr>
                <td height="75"><c:out value="${course.name}"></c:out></td>
                <td height="75"><c:out value="${course.hours}"></c:out></td>
                <td height="75"><c:out value="${course.school}"></c:out></td>
                <td height="75"><a href="/hello/delete/${course.id}" onclick="return confirm('确定要删除吗');">删除</a> <a href="/hello/toupdate/${course.id}">编辑</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
