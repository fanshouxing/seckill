<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>秒杀详情页</title>
    <%@include file="common/header.jsp"%>
</head>
<body>
    <div class="container">
        <div class="panel panel-default text-center">
            <div class="panel-heading">
                <h2>${seckill.name}</h2>
            </div>
        </div>
        <div class="panel-body">
            <h2 class="text-danger">
                <span class="glyphicon glyphicon-time"></span>
                <span class="glyphicon" id="seckill-box"></span>
            </h2>
        </div>
    </div>





<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>
