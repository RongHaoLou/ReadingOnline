<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无限阅读用户登录界面</title>
    <link rel="stylesheet" href="/reading/assets/css/loginAndRegister.css">
    <script src="/reading/assets/js/jquery.validate.min.js"></script>
    <script src="/reading/assets/js/messages.js"></script>
    <script>
        $.validator.setDefaults({
            submitHandler: function() {
                alert("提交事件!");
            }
        });
        $().ready(function() {
            $("#commentForm").validate();
        });
    </script>
    <style>
        .error{
            color:red;
        }
    </style>
</head>
<body>
	<div class="background">
        <div class="background-login">
            <div class="background-login-exit"><a href=""></a></div>
            <div class="background-login-top"></div>
            <div class="background-login-bottom">
                <form action="/reading/loginToIndex" class="form-login" method="get" id="commentForm">
                    <p class="p-logo">-&nbsp;&nbsp;用户名密码登录</p>
                    <span style="font-size:12px;color:#FC4343">${errorMessage}</span>
                    <input name="username" class="username" value placeholder="手机/邮箱/用户名" required>
                    <input name="password" class="password" type="password" value placeholder="密码" required>
                    <input name="autoLogin" class="autoLogin" type="checkbox">
                    <span class="login-lable">下次自动登录</span>
                    <input class="login-button" type="submit" value="登录">
                    <a href="" class="wangjimima">忘记密码?</a>
                    <a href="" class="messige-login">短信快捷登录</a>
                </form>
                <div class="background-login-bottom-bottom">
                    <a href="" class="saoma-login">扫码登录</a>
                    <a href="" class="fenge">|</a>
                    <div class="bottom-logos">
<!--                        <div class="bottom-logos-one"></div>-->
<!--                        <div class="bottom-logos-two"></div>-->
<!--                        <div class="bottom-logos-three"></div>-->
                    </div>
                    <a href="/reading/register" class="zhuce-now">立即注册</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>