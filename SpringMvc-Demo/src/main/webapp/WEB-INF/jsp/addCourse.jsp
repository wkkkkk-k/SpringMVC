<%--
  Created by IntelliJ IDEA.
  User: 27598
  Date: 2023/4/6
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增课程</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增课程</small>
                </h1>
            </div>
        </div>
    </div>
</div>
<form action="addCourse" method="post">
    <label for="id">课程id：</label>
    <input type="text" id="id" name="id" class="from-control" required><br>

    <label for="name">课程名称：</label>
    <input type="text" id="name" name="name" class="from-control" required><br>

    <label for="hours">课时：</label>
    <input type="text" id="hours" name="hours" class="from-control" required><br>

    <label for="school">开课学院：</label>
    <input type="text" id="school" name="school" class="from-control" required><br>

    <input type="submit" class="form-control">
    <input type="button" class="form-control" onclick="fanhui()" value="返回">
    <script>
        function fanhui() {
            window.close();
        }

    </script>

</form>
</body>
</html>
