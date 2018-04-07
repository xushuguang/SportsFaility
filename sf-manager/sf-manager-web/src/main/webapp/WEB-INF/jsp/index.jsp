<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>首页</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <link rel="Stylesheet" type="text/css" href="css/loginDialog.css" />

</head>
<body>
<button id="login">登录</button>
<button onclick="register()">注册</button>
<div id="LoginBox">
    <div class="row1">
        体育设施管理系统登录<a href="javascript:void(0)" title="关闭窗口" class="close_btn" id="closeBtn">×</a>
    </div>
    <div class="row">
        用户名: <span class="inputBox">
                <input type="text" id="txtName" placeholder="用户名" />
            </span><a href="javascript:void(0)" title="提示" class="warning" id="warn">*</a>
    </div>
    <div class="row">
        密&nbsp;&nbsp;&nbsp;&nbsp;码: <span class="inputBox">
                <input type="text" id="txtPwd" placeholder="密码" />
            </span><a href="javascript:void(0)" title="提示" class="warning" id="warn2">*</a>
    </div>
    <div class="row">
        <a href="#" id="loginbtn">登录</a>
    </div>
</div>

<script type="text/javascript">
    $(function ($) {
        //弹出登录
        $("#login").hover(function () {
            $(this).stop().animate({
                opacity: '1'
            }, 600);
        }, function () {
            $(this).stop().animate({
                opacity: '0.6'
            }, 1000);
        }).on('click', function () {
            $("body").append("<div id='mask'></div>");
            $("#mask").addClass("mask").fadeIn("slow");
            $("#LoginBox").fadeIn("slow");
        });
        //
        //按钮的透明度
        $("#loginbtn").hover(function () {
            $(this).stop().animate({
                opacity: '1'
            }, 600);
        }, function () {
            $(this).stop().animate({
                opacity: '0.8'
            }, 1000);
        });
        //文本框不允许为空---按钮触发
        $("#loginbtn").on('click', function () {
            var txtName = $("#txtName").val();
            var txtPwd = $("#txtPwd").val();
            var formData = new FormData();
            formData.append('username',txtName);
            formData.append('password',txtPwd);
            $.ajax({
                type:'POST',
                url:'login/login',
                data:formData,
                contentType: false,//这里
                processData: false,//这两个一定设置为false
                success:function (user) {
                    if (user.comment=='admin'){
                        window.location.href='background';
                    }else if (user.comment=='user'){
                        window.location.href='front_desk';
                    }else {
                        alert('用户名或密码错误，请重新输入！')
                    }
                }
            })
        })
        //文本框不允许为空---单个文本触发
        $("#txtName").on('blur', function () {
            var txtName = $("#txtName").val();
            if (txtName == "" || txtName == undefined || txtName == null) {
                $("#warn").css({ display: 'block' });
            }
            else {
                $("#warn").css({ display: 'none' });
            }
        });
        $("#txtName").on('focus', function () {
            $("#warn").css({ display: 'none' });
        });
        //
        $("#txtPwd").on('blur', function () {
            var txtName = $("#txtPwd").val();
            if (txtName == "" || txtName == undefined || txtName == null) {
                $("#warn2").css({ display: 'block' });
            }
            else {
                $("#warn2").css({ display: 'none' });
            }
        });
        $("#txtPwd").on('focus', function () {
            $("#warn2").css({ display: 'none' });
        });
        //关闭
        $(".close_btn").hover(function () { $(this).css({ color: 'black' }) }, function () { $(this).css({ color: '#999' }) }).on('click', function () {
            $("#LoginBox").fadeOut("fast");
            $("#mask").css({ display: 'none' });
        });
    });
    function register() {
        window.location.href='register';
    }
</script>
</body>
</html>