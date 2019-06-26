<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册成功!即将跳转回登录页面....</title>
    <style>
        .message{
            width: 300px;height: 170px;border: 1px solid #3F89EC;
            margin:200px auto;
        }
        .title{
            width: 300px;height: 30px;background-color: #3F89EC;
            line-height: 30px;font-size: 20px;text-align: center;
            color: #FFFFFF;
        }
        .con{
            width: 300px;height: 100px;line-height: 20px;
            text-align: center;padding-top: 40px;
        }
        .con a{
            color: #3F89EC;
        }
        span{
            color: red;font-weight: bold;
        }
    </style>
</head>
<body>
<div class="message">
    <div class="title">注册成功！</div>
    <div class="con">
        请等待<span>3</span>秒钟<br>
        页面自动跳转。如果没有跳转<br>
        请点击<a href="login.html">这里</a>
    </div>
</div>
<script>
    var num=3
    var span = document.querySelector("span")
    setInterval(function () {
        num--
        if(num<1){
            clearInterval()
            location.href="login.html"
        }else{
            span.innerHTML=num
        }
    },1000)
</script>
</body>
</html>