<%@page import="java.util.Arrays"%>
<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>无限阅读网-首页</title>
<link rel="icon" href="/reading/assets/img/index-img/top/min-logo.jpg" />
<link rel="stylesheet" href="/reading/assets/css/index.css">
<link rel="stylesheet"
	href="/reading/assets/css/jquery-ui.css"
	rel="external nofollow" rel="external nofollow">
<script src="/reading/assets/js/jquery-3.4.1.js"></script>
<script src="/reading/assets/js/jquery-ui.js"></script>
<script>
	window.onload = function(ev) {
		var banner = document.querySelectorAll(".banner")
		var btns = document.querySelectorAll(".btn")
		var num = 0
		setInterval(function() {
			if (num == 4) {
				num = 0;
			}
			for (var i = 0; i < banner.length; i++) {
				banner[i].style.display = "none";
				btns[i].style.background = "#000";
			}
			banner[num].style.display = "block";
			btns[num].style.background = "orange";
			num++
		}, 3000)
		var name = document.querySelectorAll(".press-main-left-part a")
		var content = document.querySelectorAll(".press-main-right-part")
		for (var i = 0; i < name.length; i++) {
			name[i].index = i;
			name[i].onmouseover = function() {
				for (var j = 0; j < name.length; j++) {
					content[j].style.display = "none";
				}
				content[this.index].style.display = "block";
			}
		}
	};
	window.addEventListener("load",function() {
        var btn = document.getElementById("toTop");
        var side = document.querySelector(".side");
        btn.addEventListener("mouseover",moveIn, false);
        btn.addEventListener("mouseout", moveOut, false);

        function moveIn() {
            btn.style.textIndent = "0em";
        }
        function moveOut() {
            btn.style.textIndent = "-9999em";
        }
        function goTop(acceleration, time) { //修改参数可调整返回顶部的速度
            acceleration = acceleration || 0.1;
            time = time || 10;
            var speed = 1 + acceleration;
            function getScrollTop() { //取得滚动条的竖直距离
                return document.documentElement.scrollTop || document.body.scrollTop;
            }
            function setScrollTop(value) { //设置滚动条的竖直距离,实现效果的关键就是在很短的间隔时间内不断地修改滚动条的竖直距离,以实现滚动效果
                document.documentElement.scrollTop = value;
                document.body.scrollTop = value;
            }
            window.onscroll = function() {
                var scrollTop = getScrollTop();
                if (scrollTop > 300) { //判断滚动条距离窗口顶部多远时显示出来，这里是100px
                    side.style.display = "block";
                } else {
                    side.style.display = "none";
                }
            };
            btn.onclick = function () {
                var timer = setInterval(function() {
                    setScrollTop(Math.floor(getScrollTop() / speed)); 
                    if (getScrollTop() == 0)
                        clearInterval(timer);
                }, time);
            };
        }
        goTop(0.2, 20);
    }, false);
</script>
</head>
<body>
	<!---------侧面---------->
	<div class="side">
		<div class="side-toTop" id="toTop"></div>
		<div class="side-WeChat">
			<div class="side-WeChat-text">
				关注<br>微信
			</div>
		</div>
		<div class="side-microblog">
			<div class="side-microblog-text">
				关注<br>微博
			</div>
		</div>
		<div class="side-idea">
			意见<br>反馈
		</div>
	</div>
	<!-------top------->
	<div class="top">
		<div class="top-logo">
			<img src="/reading/assets/img/index-img/top/readLogo.jpg" alt=""
				style="width: 200px; height: 50px;">
		</div>
		<div class="top-search">
			
			<lable for="text"></lable>
			
			<input type="search"  placeholder="数十万册图书中搜索" id="text" >
			<input type="submit" value="搜索图书" id="submit" onclick="search()">
			<span style="color:red;font-size:13px;line-height:33px;margin-left:5px">${reply }</span>
			
			<input id="result" type="hidden" value="${arr}"> 
			<div>
				<a href="/reading/book?bookName=如果东京不快乐 " target="_blank">如果东京不快乐</a> 
				<a href="/reading/book?bookName=如果可以这样爱 " target="_blank">如果可以这样爱</a>
				<a href="/reading/book?bookName=都挺好 " target="_blank">都挺好</a>
				<a href="/reading/book?bookName=墨菲定律 " target="_blank">墨菲定律</a>
				<a href="/reading/book?bookName=人性的弱点 " target="_blank">人性的弱点</a>
				<a href="/reading/book?bookName=东宫 " target="_blank">东宫</a>
				<a href="/reading/book?bookName=熊镇 " target="_blank">熊镇</a>
			</div>
		</div>
		
		<script>
		function search(){
			if($("#text").val()===""){
				alert("请输入您要查找的文字")
			}else{
				var bookName=$("#text").val();
				$.get(
						"http://localhost:8080/reading/book",
						{bookName:bookName},
						function(data){
							
							$("body").html(data);
						}
				);
			}
			
		}
		$( function() {
			
			
			var shuzu=${arr};
		
		    $( "#text" ).autocomplete({//调用补全功能
		        source: shuzu
		    });
		} );
		</script>
		<div class="top-right">
			<a href="/reading/login"> <%=session.getAttribute("user") == null ? "登录"
					: session.getAttribute("user").toString().split(",")[1].split("=")[1]%>
			</a> | <a href="/reading/register">注册</a>| <a href="/reading/car"
				target="_blank">购物车</a>| <a href="">意见反馈</a>
		</div>
	</div>
	<!-------导航------->
	<div class="daohang">
		<div class="daohang-con">
			<a href="">首页</a> <a href="">分类</a> <a href="">榜单</a> <a href="">独家作品</a>
			<a href="">机构专区</a> <a href="">客户端</a>
		</div>
		<div class="daohang-bookshelf">
			<div class="daohang-bookshelf-tu"></div>
			<div class="daohang-bookshelf-info">
				<a href="">我的书架</a>
			</div>
		</div>
	</div>
	<hr id="daohang">
	<!--------轮播----------->
	<div class="wheel">
		<div class="wheel-left">
			<div class="wheel-left-num">
				<span>3</span> <span>1</span> <span>1</span> <span>9</span> <span>2</span>
			</div>
			<div class="wheel-left-get"></div>
		</div>
		<div class="wheel-right">
			<a href="/reading/book?bookName=如果可以这样爱" target="_blank"><div
					class="banner banner1"></div></a> <a href="/reading/book?bookName=逻辑思维"
				target="_blank"><div class="banner banner2"></div></a> <a
				href="/reading/book?bookName=伯纳黛特,你要去哪" target="_blank"><div
					class="banner banner3"></div></a> <a
				href="/reading/book?bookName=法医秦明:天谴者" target="_blank"><div
					class="banner banner4"></div></a>
			<div class="bots">
				<div class="btn btn1 select"></div>
				<div class="btn btn2"></div>
				<div class="btn btn3"></div>
				<div class="btn btn4"></div>
			</div>
		</div>
	</div>
	<!----------分类------------>
	<div class="type">
		<input type="checkbox" id="dianji" style="display: none"> <label
			for="dianji">更多<span>&nbsp;&nbsp;&nbsp;&nbsp;</span></label>
		<div class="type-con">
			<div class="type-con-left">分类</div>
			<div class="type-con-main">
				<a href="">成功学</a><a href="">投资理财</a><a href="">人际处事</a> <a href="">计算机</a><a
					href="">人物传记</a><a href="">言情小说</a> <a href="">随笔散文</a><a href="">悬疑推理</a><a
					href="">市场营销</a>
			</div>
			<div class="type-con-more">
				<a href="">健康养生</a><a href="">演讲口才</a><a href="">现当代小说</a> <a
					href="">宗教哲学</a><a href="">企业管理</a><a href="">心理学</a> <a href="">教育考试</a><a
					href="">历史小说</a><a href="">两性感情</a>
			</div>
		</div>
	</div>
	<!-----------图片分类------------->
	<div class="img-type">
		<a href="javascript:;"><img
			src="/reading/assets/img/index-img/img-type/1.jpg" alt=""></a> <a
			href="javascript:;"><img
			src="/reading/assets/img/index-img/img-type/2.jpg" alt=""></a> <a
			href="javascript:;"><img
			src="/reading/assets/img/index-img/img-type/3.jpg" alt=""></a>
	</div>
	<!-----------背景色--------->
	<div class="background">

		<!---------热门推荐---------->
		<div class="hot">
			<div class="hot-top">
				<span>热门推荐</span> <a href="">更多&nbsp;></a>
			</div>
			<c:forEach items="${listss1 }" var="lists">
				<div class="hot-con">
					<c:forEach items="${lists}" var="list">
						<a
							href="<%=request.getContextPath() %>/book?bookName=${list.bookName }"
							target="_blank">
							<div class="hot-con-part">
								<div class="hot-con-part-main">
									<img src="${list.bookImage }" alt="">
								</div>
								<div class="hot-con-part-info">${list.bookName }</div>
								<div class="hot-con-part-price">￥${list.bookPrice }</div>
							</div>
						</a>
					</c:forEach>
				</div>
			</c:forEach>
		</div>
		<!---------新书上线---------->
		<div class="new">
			<div class="new-top">
				<span>新书上线</span> <a href="">更多&nbsp;></a>
			</div>
			<c:forEach items="${listss2 }" var="lists">
				<div class="new-con">
					<c:forEach items="${lists}" var="list">
						<a
							href="<%=request.getContextPath() %>/book?bookName=${list.bookName }"
							target="_blank">
							<div class="new-con-part">
								<div class="new-con-part-main">
									<img src="${list.bookImage }" alt="">
								</div>
								<div class="new-con-part-info">${list.bookName }</div>
								<div class="new-con-part-price">￥${list.bookPrice }</div>
							</div>
						</a>
					</c:forEach>
				</div>
			</c:forEach>
		</div>
		<!---------最受好评----------->
		<div class="love">
			<div class="love-top">
				<span>最受好评</span>
			</div>
			<c:forEach items="${listss3 }" var="lists">
				<div class="love-con">
					<c:forEach items="${lists}" var="list">
						<a
							href="<%=request.getContextPath() %>/book?bookName=${list.bookName }"
							target="_blank">
							<div class="love-con-part">
								<div class="love-con-part-main">
									<img src="${list.bookImage }" alt="">
								</div>
								<div class="love-con-part-info">${list.bookName }</div>
								<div class="love-con-part-price">￥${list.bookPrice }</div>
							</div>
						</a>
					</c:forEach>
				</div>
			</c:forEach>
		</div>
		<!---------经典推荐----------->
		<div class="recommend">
			<div class="recommend-top">
				<span>经典推荐</span> <a href="">更多&nbsp;></a>
			</div>
			<c:forEach items="${listss4 }" var="lists">
				<div class="recommend-con">
					<c:forEach items="${lists}" var="list">
						<a
							href="<%=request.getContextPath() %>/book?bookName=${list.bookName }"
							target="_blank">
							<div class="recommend-con-part">
								<div class="recommend-con-part-main">
									<img src="${list.bookImage }" alt="">
								</div>
								<div class="recommend-con-part-info">${list.bookName }</div>
								<div class="recommend-con-part-price">￥${list.bookPrice }</div>
							</div>
						</a>
					</c:forEach>
				</div>
			</c:forEach>
		</div>
	</div>
	<!----------出版社------->
	<div class="press-background">
		<div class="press">
			<div class="press-top">出版社</div>
			<div class="press-main">
				<div class="press-main-left">
					<div class="press-main-left-part">
						<a href="javascript:;"><img
							src="/reading/assets/img/index-img/press/press-left-1.jpg" alt=""></a>
					</div>
					<div class="press-main-left-part">
						<a href="javascript:;"><img
							src="/reading/assets/img/index-img/press/press-left-2.png" alt=""></a>
					</div>
					<div class="press-main-left-part">
						<a href="javascript:;"><img
							src="/reading/assets/img/index-img/press/press-left-3.png" alt=""></a>
					</div>
					<div class="press-main-left-part">
						<a href="javascript:;"><img
							src="/reading/assets/img/index-img/press/press-left-4.png" alt=""></a>
					</div>
					<div class="press-main-left-part">
						<a href="javascript:;"><img
							src="/reading/assets/img/index-img/press/press-left-5.jpg" alt=""></a>
					</div>
					<div class="press-main-left-part">
						<a href="javascript:;"><img
							src="/reading/assets/img/index-img/press/press-left-6.jpg" alt=""></a>
					</div>
					<div class="press-main-left-part">
						<a href="javascript:;"><img
							src="/reading/assets/img/index-img/press/press-left-7.jpg" alt=""></a>
					</div>
					<div class="press-main-left-part">
						<a href="javascript:;"><img
							src="/reading/assets/img/index-img/press/press-left-8.jpg" alt=""></a>
					</div>
					<div class="press-main-left-part">
						<a href="javascript:;"><img
							src="/reading/assets/img/index-img/press/press-left-9.jpg" alt=""></a>
					</div>
				</div>
				<div class="press-main-right">
					<%
						int num = 0;
						int end = 3;
					%>
					<c:forEach items="${list02 }" var="publishList">
						<div class="press-main-right-part">
							<div class="press-main-right-part-top">
								<div class="press-main-right-part-top-tu"></div>
								<div class="press-main-right-part-top-info">${publishList.publishName }</div>
							</div>
							<div class="press-main-right-part-main">

								<c:forEach items="${list01}" var="bookList" begin="<%=num %>"
									end="<%=end %>" step="1">
									<a
										href="<%=request.getContextPath() %>/book?bookName=${bookList.bookName } "
										target="_blank">
										<div class="press-main-right-part-main-shu">
											<div class="press-main-right-part-main-shu-tu">
												<img src="${bookList.bookImage }" alt="">
											</div>
											<div class="press-main-right-part-main-shu-info">${bookList.bookName }</div>
										</div>
									</a>
								</c:forEach>
								<%
									num += 4;
										end += 4;
								%>
							</div>
						</div>
					</c:forEach>

				</div>
			</div>
		</div>
	</div>
	</div>
	<!----------底部--------->
	<div class="foot">
		<div class="foot-top">
			<div class="foot-top-part">
				<div class="foot-top-part-img foot-top-part-img1"></div>
				<div class="foot-top-part-info">正版电子书</div>
			</div>
			<div class="foot-top-part">
				<div class="foot-top-part-img foot-top-part-img2"></div>
				<div class="foot-top-part-info">多平台阅读</div>
			</div>
			<div class="foot-top-part">
				<div class="foot-top-part-img foot-top-part-img3"></div>
				<div class="foot-top-part-info">海量图书阅读</div>
			</div>
			<div class="foot-top-part">
				<div class="foot-top-part-img foot-top-part-img4"></div>
				<div class="foot-top-part-info">优质阅读体验</div>
			</div>
		</div>
		<div class="foot-middel">
			<div class="foot-middel-part">
				<div class="foot-middel-part-info">帮助</div>
				<div class="foot-middel-part-con">
					<a href="">如何购买图书</a><br> <a href="">常见问题</a><br> <a
						href="">支付方式</a><br>
				</div>
			</div>
			<div class="foot-middel-part">
				<div class="foot-middel-part-info">平台入驻</div>
				<div class="foot-middel-part-con">
					<a href="">机构专区</a><br> <a href="">个人作者专区</a><br>
				</div>
			</div>
			<div class="foot-middel-part">
				<div class="foot-middel-part-info">投诉与建议</div>
				<div class="foot-middel-part-con">
					<a href="">问题反馈</a><br>
				</div>
			</div>
			<div class="foot-middel-part">
				<div class="foot-middel-part-info">扫描下载客户端</div>
				<div class="foot-middel-part-img"></div>
			</div>
		</div>
		<div class="foot-bottom">
			如有问题欢迎联系<a href="">投诉反馈</a><br> <span>京ICP证190619号&nbsp;京网文[2017]2863-327号&nbsp;©2019
				Wuxian&nbsp; <a href="">使用无限前必读</a>|<a href="">平台协议</a>|<a href="">企业文库</a>|
				<a href="">广告服务</a>|<a href="">无限教育商业服务平台</a>
			</span>
		</div>
	</div>
</body>
</html>