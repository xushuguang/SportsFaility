<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>首页</title>
    <!-- 引入 Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 Shiv 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
    <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-4 column">
        </div>
        <div class="col-md-4 column">
            <h3 class="text-center">
                欢迎进入SF体育设施管理系统
            </h3>
            <br/><br/><br/><br/>
            <button type="button" class="btn btn-primary btn-lg btn-block" onclick="login()">登陆</button>
            <br/><br/>
            <button type="button" class="btn btn-lg btn-primary btn-block" onclick="register()">注册</button>
        </div>
        <div class="col-md-4 column">
        </div>
    </div>
</div>
</body>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="https://code.jquery.com/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="js/bootstrap.min.js"></script>
<script>
    //点击登陆按钮
   function login() {
       window.location.href = "login";
   }
   //点击注册按钮
   function register() {
       window.location.href = "register";
   }
</script>
</html>