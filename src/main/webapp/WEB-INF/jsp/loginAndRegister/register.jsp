<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无限阅读用户注册界面</title>
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
<div class="register">
        <div class="register-content">
            <div class="register-content-top">
                <div class="register-content-top-logo"></div>
                <span>|</span>
                <div class="register-content-top-title">注册无限阅读账号</div>
                <div class="register-content-top-right">
                    <span>我已注册，现在就</span>
                    <a href="/reading/login"><button class="login-btn">登录</button></a>
                </div>
            </div>
            <div class="register-content-fenge"></div>
            <form action="/reading/registerToLogin" class="register-form" method="post" id="commentForm">
                <span style="width: 720px;height: 40px"></span>
                <p class="common">
                    <lable class="register-lable">用户名</lable>
                    <input name="username" class="register-form-username" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')" value placeholder="请设置用户名(只能是英文和数字)" required>
                    <span style="font-size:14px;color:#FC4343">${errorMessage1}</span>
                </p>
                <p class="common">
                    <lable class="register-lable">手机号</lable>
                    <input name="phoneNumber" class="register-form-username" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')" value placeholder="可用于登录和找回密码" required>
                    <span style="font-size:14px;color:#FC4343">${errorMessage2}</span>
                </p>
                <p class="common">
                    <lable class="register-lable">密码</lable>
                    <input name="password" class="register-form-password" type="password" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')" value placeholder="设置登录密码密码(只能是英文和数字)" required>
                    <span style="font-size:14px;color:#FC4343">${errorMessage3}</span>
                </p>
                <p class="common">
                    <lable class="register-lable">身份类型</lable>
                    <select name="role" id="register-form-type">
                        <option name="role" value="普通用户">普通用户</option>
                        <option name="role" value="作者">作者</option>
                    </select>
                </p>
                <p class="common">
                    <lable class="register-lable">验证码</lable>
                    <input class="register-form-code" value placeholder="请输入验证码" required>
                    <canvas id="canvas" width="120px" height="40px" onclick="drawPic()"></canvas>
                </p>
                <p class="overRead">
                    <input class="overRead-check" type="checkbox">
                    <label>我已经阅读并接受</label>
                    <a href="javascript:;" style="text-decoration: none;color: #1B66C7">《无限阅读用户协议》</a>
                    <label>及</label>
                    <a href="javascript:;" style="text-decoration: none;color: #1B66C7">《用户隐私权保护声明》</a>
                </p>
                <a href="registerSuccess.html"><input type="submit" value="注册" class="register-btn"></a>
            </form>
            <div class="register-bottom">2019©Wuxian</div>
        </div>
    </div>
    <script>
        //生成随机数
        function randomNum(min,max){
            return Math.floor(Math.random()*(max-min)+min);
        }
        //生成随机颜色RGB分量
        function randomColor(min,max){
            var _r = randomNum(min,max);
            var _g = randomNum(min,max);
            var _b = randomNum(min,max);
            return "rgb("+_r+","+_g+","+_b+")";
        }
        function drawPic(){
            //获取到元素canvas
            var $canvas = document.getElementById("canvas");
            var _str = "0123456789";//设置随机数库
            var _picTxt = "";//随机数
            var _num = 4;//4个随机数字
            var _width = $canvas.width;
            var _height = $canvas.height;
            var ctx = $canvas.getContext("2d");//获取 context 对象
            ctx.textBaseline = "bottom";//文字上下对齐方式--底部对齐
            ctx.fillStyle = randomColor(180,240);//填充画布颜色
            ctx.fillRect(0,0,_width,_height);//填充矩形--画画
            for(var i=0; i<_num; i++){
                var x = (_width-10)/_num*i+10;
                var y = randomNum(_height/2,_height);
                var deg = randomNum(-45,45);
                var txt = _str[randomNum(0,_str.length)];
                _picTxt += txt;//获取一个随机数
                ctx.fillStyle = randomColor(10,100);//填充随机颜色
                ctx.font = randomNum(16,40)+"px SimHei";//设置随机数大小，字体为SimHei
                ctx.translate(x,y);
             	ctx.rotate(deg*Math.PI/180);
                ctx.fillText(txt, 0,0);
                ctx.rotate(-deg*Math.PI/180);
                ctx.translate(-x,-y);
            }
            for(var i=0; i<_num; i++){
                //定义笔触颜色
                ctx.strokeStyle = randomColor(90,180);
                ctx.beginPath();
                //随机划线--4条路径
                ctx.moveTo(randomNum(0,_width), randomNum(0,_height));
                ctx.lineTo(randomNum(0,_width), randomNum(0,_height));
                ctx.stroke();
            }
            for(var i=0; i<_num*10; i++){
                ctx.fillStyle = randomColor(0,255);
                ctx.beginPath();
                //随机画原，填充颜色
                ctx.arc(randomNum(0,_width),randomNum(0,_height), 1, 0, 2*Math.PI);
                ctx.fill();
            }
            return _picTxt;//返回随机数字符串
        }
        drawPic();
    </script>
</body>
</html>