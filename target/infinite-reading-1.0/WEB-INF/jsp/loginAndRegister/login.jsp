<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无限阅读用户登录界面</title>
    <link rel="stylesheet" href="../css/loginAndRegister.css">
</head>
<body>
	<div class="background">
        <div class="background-login">
            <div class="background-login-exit"><a href=""></a></div>
            <div class="background-login-top"></div>
            <div class="background-login-bottom">
                <form action="../html/index-success.html" class="form-login">
                    <p class="p-logo">-&nbsp;&nbsp;用户名密码登录</p>
                    <input class="username" value placeholder="手机/邮箱/用户名">
                    <input class="password" type="password" value placeholder="密码">
                    <input class="autoLogin" type="checkbox">
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
                    <a href="register.html" class="zhuce-now">立即注册</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>