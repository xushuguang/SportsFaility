<%--
  User: 57140
  Date: 2018/3/4
  Time: 19:35
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            background: url("images/bg.jpg") fixed center center no-repeat;
            background-size: cover;
            width: 100%;
        }
    </style>
    <title>用户注册</title>
    <!-- 引入 Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/bootstrap-validator/0.5.3/css/bootstrapValidator.css" rel="stylesheet">

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
        <div class="col-md-4 column" style="background-color: aqua;width: 50%">
            <br>
            <h3 align="center">
               用户注册
            </h3>
            <form role="form">
                <div class="form-group">
                    <label>用户名：</label>
                    <input type="text" class="form-control" id="username" name="username"/>
                </div>
                <div class="form-group">
                    <label>密码：</label>
                    <input type="password" class="form-control" id="password" name="password"/>
                </div>
                <div class="form-group">
                    <label>再次输入密码：</label>
                    <input type="password" class="form-control" id="againPassword" name="againPassword" />
                </div>
                <div class="form-group">
                    <label>手机号码：</label>
                    <input type="text" class="form-control" id="mobile" name="mobile" />
                </div>
                <div class="form-group">
                    <label>验证码：</label>
                    <input type="text" class="form-control" id="code" name="code" />
                    <br>
                    <!--<button type="button" class="btn btn-default" id="getCode" value="点击获取验证码"/>-->
                    <input type="button" class="btn btn-default" id="getCode" value="点击获取验证码" />
                </div>
              <button type="submit" class="btn btn-lg btn-primary btn-block" id="btn-register" onclick="register()">提交</button>
            </form>
        </div>
        <div class="col-md-4 column">
        </div>
    </div>
</div>
</body>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="js/jquery.min.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="js/bootstrap.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
    //表单验证
    $(function () {
        $(function () {
            $('form').bootstrapValidator({
                message: 'This value is not valid',
                feedbackIcons: {
                    valid: 'glyphicon glyphicon-ok',
                    invalid: 'glyphicon glyphicon-remove',
                    validating: 'glyphicon glyphicon-refresh'
                },
                fields: {
                    //用户名
                    username: {
                        message: '用户名验证失败',
                        validators: {
                            notEmpty: {
                                message: '用户名不能为空'
                            },
                            stringLength: {
                                min: 6,
                                max: 18,
                                message: '用户名长度必须在6到18位之间'
                            },
                            regexp: {
                                regexp: /^[a-zA-Z0-9_]+$/,
                                message: '用户名只能包含大写、小写、数字和下划线'
                            },
                            remote: {
                                url: 'register/selectUsername',
                                message: '用户名已被使用,请重新输入',
                                delay :  2000,//设置2秒发送一次ajax
                                type: 'POST'
                            }
                        }
                    },
                    //密码
                    password: {
                        message: '密码验证失败',
                        validators: {
                            notEmpty: {
                                message: '密码不能为空'
                            },
                            regexp: {
                                regexp: /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[^]{8,16}$/ ,
                                message: '密码至少包含大小写字母和数字且长度在8到16位之间'
                            },
                        }
                    },
                    //再次输入密码
                    againPassword: {
                        message: '密码验证失败',
                        validators: {
                            identical: {
                                field: 'password',
                                message: '两次密码输入不一致'
                            },
                        }
                    },
                    //手机号码
                    mobile: {
                        message: '手机号验证失败',
                        validators: {
                            notEmpty: {
                                message: '手机号不能为空'
                            },
                            regexp: {
                                regexp: /^1[3|4|5|7|8][0-9]{9}$/ ,
                                message: '请输入正确的手机号码'
                            },
                            remote: {
                                url: 'register/selectMobile',
                                message: '该手机号已被注册,请重新输入',
                                delay :  2000,//设置2秒发送一次ajax
                                type: 'POST'
                            }
                        }
                    },
                    //验证码
                    code: {
                        message: '验证码验证失败',
                        validators: {
                            notEmpty: {
                                message: '验证码不能为空'
                            },
                            remote: {
                                url: 'register/selectCode',
                                message: '验证码输入错误',
                                delay :  2000,//设置2秒发送一次ajax
                                type: 'POST'
                            }
                        }
                    },
                }
            });
        });
    });
    //点击获取验证码按钮事件
    $(function () {
        $('#getCode').click(function () {
            var count = 30;
            var countdown = setInterval(CountDown, 1000);
            function CountDown() {
                $("#getCode").attr("disabled", true);
                $("#getCode").val( count + " 秒之后重新获取");
                if (count == 0) {
                    $("#getCode").val("点击重新获取").removeAttr("disabled");
                    clearInterval(countdown);
                }
                count--;
            }
            var mobile = $("#mobile").val();
            $.ajax(
                {
                    url: "register/sendSMS/" + mobile,
                    success: function (data) {
                        var str = JSON.parse(data);
                        var result = str.msg[0].result;
                        if (result == 0) {
                            alert("验证码已发送，请与30秒内输入");
                        } else if (result == 1024) {
                            alert("手机号格式有误");
                        } else if (result == 1026) {
                            alert("验证次数超出限制，请于次日再验证");
                        }}}
            )
        })
    });
    //提交表单
    $('form').submit(function () {
        var username = $('#username').val();
        var password = $('#password').val();
        var mobile = $('#mobile').val();
        var formData = new FormData();
        formData.append('username',username);
        formData.append('password',password);
        formData.append('mobile',mobile);
        $.ajax({
            type:'POST',
            url:'register/register',
            data:formData,
            contentType: false,//这里
            processData: false,//这两个一定设置为false
            success:function (flag) {
                if (flag){
                    $.messager.alert('消息', '注册成功！','info' )
                }
            }
        })
    });
</script>
</html>
