<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>reading</title>
    <link rel="stylesheet" href="../css/reading.css">
    <script>
        window.onload=function(e){
            /*翻页*/
            var contextt = document.querySelectorAll(".contextt");
            var fix1 = document.querySelector(".fix1");
            var fix2 = document.querySelector(".fix2");
            var num=0;

            for (var i = 0; i < contextt.length; i++) {
                contextt[i].style.display = "none";
            }
            contextt[num].style.display = "block";


            fix1.onclick=function(){
                for (var i = 0; i < contextt.length; i++) {
                    contextt[i].style.display = "none";
                }
                num--;
                if (num==-1) {
                    num = contextt.length-1;
                }
                contextt[num].style.display = "block";
                contextt[num].style.zIndex=2

            }

            fix2.onclick=function(){
                for (var i = 0; i < contextt.length; i++) {
                    contextt[i].style.display = "none";
                }
                num++;
                if (num==contextt.length) {
                    num = 0;
                }
                contextt[num].style.display = "block";
                contextt[num].style.zIndex=2
            }

        }
    </script>
</head>
<body>
<div class="reading">
    <div class="reading_box">
        <div class="reading_box_left">
            <div class="reading_box_left_top">
                <a href="book.html">退出阅读</a>
            </div>
            <div class="reading_box_left_bottom">
                <div class="reading_box_left_bottom_one">
                    <div>东宫</div>
                    <img src="../img/reading-img/1.jpg" alt="">
                    <div class="reading_box_left_bottom_one_buy">
                        立即购买
                    </div>
                    <span>原价：￥8.99</span><br>
                    <span>促销价：￥4.50</span>
                </div>
            </div>
        </div>
        <div class="reading_box_right">
            <div class="reading_box_right_context contextt">
                <div class="reading_box_right_context_title">
                    版权信息
                </div>
                <ul>
                    <li><span class="label">书名</span><span>:</span><span class="value">东宫</span></li>
                    <li><span class="label">作者</span><span>:</span><span class="value">匪我思存</span></li>
                    <li><span class="label">出版社</span><span>:</span><span class="value">新世界出版社</span></li>
                    <li><span class="label">ISBN</span><span>:</span><span class="value">9787802288621</span></li>
                </ul>
                <span class="addr" style="margin-top: 120px">太原第四组文化信息咨询有限公司授权</span>
                <span class="addr" style="margin-top: 5px">无限阅读电子版制作</span>
                <span class="addr" style="margin-top: 30px">版权所有·侵权必究</span>
            </div>
            <div class="reading_box_right_context1 contextt">
                <img src="../img/reading-img/pingzhi.jpg" alt="">
            </div>
            <div class="reading_box_right_context2 contextt">
                <div class="reading_box_right_context2_head">
                    <div class="reading_box_right_context2_head_left">平直</div>
                    <div class="reading_box_right_context2_head_right"></div>
                </div>
                <div class="reading_box_right_context2_foot">
                    <p>这是--平直章--的正文</p>
                </div>
            </div>
            <div class="reading_box_right_context2 contextt">
                <div class="reading_box_right_context2_head">
                    <div class="reading_box_right_context2_head_left">平直</div>
                    <div class="reading_box_right_context2_head_right"></div>
                </div>
                <div class="reading_box_right_context2_foot">
                    <p style="font-size: 30px">这里已经是小说的最后一页了</p>
                </div>
            </div>
        </div>
        <div class="fixs">
            <div class="fix_top fix1"><img src="../img/reading-img/3.png" alt=""></div>
            <div class="fix_bottom fix2"><img src="../img/reading-img/2.png" alt=""></div>
        </div>
    </div>
</div>
</body>
</html>