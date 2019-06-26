<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="entity.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>${book.bookName}${typesName},全文免费阅读_无限阅读</title>
<link rel="icon" href="/reading/assets/img/index-img/top/min-logo.jpg"/>
<link rel="stylesheet" href="/reading/assets/css/book.css">
<link rel="stylesheet" href="/reading/assets/css/index1.css">
<script src="/reading/assets/js/jquery-3.4.1.js"></script>

</head>
<body>
	<!-------top------->
	<div class="top">
		<div class="top-logo">
			<img src="/reading/assets/img/book-img/readLogo.jpg" alt=""
				style="width: 200px; height: 50px;">
		</div>
		<div class="top-search">
			<input type="search" value placeholder="数十万册图书中搜索" id="text">
			<input type="submit" value="搜索图书" id="submit"><a
				href="/reading/book?bookName=如果东京不快乐 " target="_blank">如果东京不快乐</a> <a
				href="/reading/book?bookName=如果可以这样爱 " target="_blank">如果可以这样爱</a> <a
				href="/reading/book?bookName=都挺好 " target="_blank">都挺好</a> <a
				href="/reading/book?bookName=墨菲定律 " target="_blank">墨菲定律</a> <a
				href="/reading/book?bookName=人性的弱点 " target="_blank">人性的弱点</a> <a
				href="/reading/book?bookName=东宫 " target="_blank">东宫</a> <a
				href="/reading/book?bookName=熊镇 " target="_blank">熊镇</a>
		</div>
		<div class="top-right">
			<a href="/reading/login">
			<%=
				session.getAttribute("user")==null?"登录":
				session.getAttribute("user").toString().split(",")[1].split("=")[1]
			%>
			</a>
			| <a href="/reading/register">注册</a>|
			<a href="/reading/car" target="_blank">购物车</a>| <a href="">意见反馈</a>
		</div>
	</div>

	<!-------导航------->
	<div class="daohang">
		<div class="daohang-con">
			<a href="/reading/index">首页</a> <a href="">分类</a> <a href="">榜单</a> <a href="">独家作品</a>
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
	<div class="box">
		<div class="book">
			<div class="book-left">
				<div class="book-info">

					<div class="info-left">
						<a href="/reading/reading?bookName=${book.bookName}" class="left-top" target="_blank"> <img src="${book.bookImage}"
							alt="">
							<div class="img"></div>
							<div class="img2"></div>
						</a>

						<div class="left-btommon">
							<div class="logo1">
								<div class="icon-favo"></div>
							</div>
							<span class="split"></span>
							<div class="logo1">
								<div class="icon-favo2"></div>
							</div>
							<span class="split"></span>
							<div class="logo1">
								<div class="icon-favo3"></div>
							</div>
						</div>
					</div>
					<div class="info-right">
						<div class="book-title">
							<h1 class="book-title-name">${book.bookName}</h1>
							<span class="ebook-tips">电子书</span>
						</div>
						<div class="book-info-score">
							<div class="star">
								<div class="star-on"></div>
								<div class="star-on"></div>
								<div class="star-on"></div>
								<div class="star-on"></div>
								<div class="star-half"></div>
							</div>
							<div class="value">9.6</div>
							<a href="">(10000评论)</a> <span class="split1"></span>
							<div class="count">1000000人在读</div>
						</div>
						<div class="book-info-org">
							<div class="author">
								<span class="author-1">作者:</span> <a href="" class="author-2">${autorName}</a>
							</div>
							<div class="publiCation">
								<span class="publiCation-1">版权方:</span> <a href=""
									class="publiCation-2">${publishName}</a>
							</div>
						</div>
						<div class="book-info-price">
							<div class="promotion-status">
								<span class="kouhao">全网最低</span> <span class="kouhao2">无限阅读已为您全网比价</span>
							</div>
							<div class="price-info">
								<span class="price-info1"> <span class="info1-price">价格:</span>
									<span class="info1-fu">￥</span> <span class="info1-mon">${book.bookPrice}</span>
								</span> <span class="price-info2">原价:￥${bookPrice} </span> <span
									class="price-info3">（5.0折)</span>
							</div>
							<div class="price-youhui">
								<div class="youhui-left">
									<span class="youhui-left1">手机专享价</span> <span
										class="youhui-left2">¥0</span> <span class="youhui-left3">扫码免费下载该书，再送</span>
									<span class="youhui-left4">20元代金券</span>
								</div>
								<div class="youhui-right">
									<div class="erweima">
										<div class="erweima-txt">仅限新用户</div>
										<div class="erweima-img">
											<img src="/reading/assets/img/book-img/erweima.png" alt=""
												class="img-1"> <img
												src="/reading/assets/img/book-img/book1.jpg" alt=""
												class="img-2">
										</div>
									</div>
								</div>

							</div>
							<div class="daoliu-icon">
								<a href="/reading/buyBook?bookName=${book.bookName}" class="buy"> 购买全本 </a> <a
									href="/reading/reading?bookName=${book.bookName}" class="read" target="_blank">
									开始阅读 </a> <a href="/reading/toCar?bookName=${book.bookName}" class="shop">
									<div class="shop1"></div>
									<div class="shop2">加入购物车</div>
								</a>
							</div>
						</div>
					</div>


				</div>
				<div class="yindao">
					<a href="" class="yindao1">
						<div class="yindao-left"></div>
						<div class="yindao-right">
							<li class="roll-title">正版全本无错字</li>
							<li class="roll-txt">183175个字，4个章节</li>
						</div>
					</a> <a href="" class="yindao1">
						<div class="yindao-left2"></div>
						<div class="yindao-right">
							<li class="roll-title">舒适不累的阅读体验</li>
							<li class="roll-txt">随时做书摘笔记</li>
						</div>
					</a> <a href="" class="yindao1">
						<div class="yindao-left3"></div>
						<div class="yindao-right">
							<li class="roll-title">多个设备同步阅读</li>
							<li class="roll-txt">已支持电脑、手机、iPad等设备</li>
						</div>
					</a>
				</div>
				<div class="jianjie-daohang">
					<a href="" class="daohang1 current">简介</a> <a href=""
						class="daohang1 current1">目录</a> <a href=""
						class="daohang1 current2">评论</a>
				</div>
				<div class="book-jianjie">
					<div class="book-jianjie-title">
						<div class="title-icon"></div>
						<div class="title-txt">图书简介</div>
					</div>
					<div class="book-jianjie-content">
						${book.bookDescription}
					</div>

				</div>
				<div class="base">
					<div class="base-info">
						<div class="title-icon"></div>
						<div class="title-txt">基本信息</div>
					</div>
					<div class="base-content">
						<li class="l1"><span class="sp1"> 作 <span class="sp2">者:</span>
						</span> <a href="" class="sp3"> ${autorName} </a></li>
						<li class="l1"><span class="sp1"> 出版时间: </span> <span
							class="sp4"> 2010-06-01 </span></li>
						<li><span class="sp1"> <span class="sp7">出</span> <span
								class="sp6">版</span> <span class="sp6">社:</span>
						</span> <span class="sp4"> ${publishName} </span></li>
						<li><span class="sp1"> 纸书定价: </span> <span class="sp4">
								28.00元 </span></li>
						<li><span class="sp1"> <span class="sp7">版</span> <span
								class="sp6">权</span> <span class="sp6">方:</span>
						</span> <a href="" class="sp5"> ${Copyright} </a></li>
						<li><span class="sp1"> 分 <span class="sp2">类:</span>
						</span> <a href="" class="sp4"> ${typesName} > ${typeName} </a></li>
					</div>
				</div>
				<div class="mulu">
					<span class="daohang1 mulu-title">目录 (共4章)</span>
					<div class="mulu-content">
						<!-- 
						<li class="l2">
							<div class="title-icon align1"></div>
							<a href="" class="title-txt align2">平直</a>

						</li>
						<li></li>
						<li>
							<div class="title-icon align1"></div>
							<div class="title-txt align2">
								<span class="mulu-name">春容</span> <a href="" class="align3"></a>

							</div>

						</li>
						<li></li>
						<li>
							<div class="title-icon align1"></div>
							<div class="title-txt align2">
								<span class="mulu-name">变化</span> <a href="" class="align3"></a>
							</div>
						</li>
						<li></li>
						<li>
							<div class="title-icon align1"></div>
							<div class="title-txt align2">
								<span class="mulu-name">渊水</span> <a href="" class="align3"></a>
							</div>
						</li>
						<li></li> -->
						<c:forEach items="${chapters}" var="chapter">
						<li>
							<div class="title-icon align1"></div>
							<div class="title-txt align2">
								<span class="mulu-name">${chapter.chapterName}</span> <a href="" class="align3"></a>

							</div>

						</li>
						<li></li>
						</c:forEach>
					</div>
				</div>
				<div class="comment">
					<div class="daohang1 mulu-title comment-title">图片评论</div>
					<div class="book-score-content">
						<div class="over-score ">
							<div class="over-score-inner">
								<span class="inner-txt">综合评分</span>
								<div class="star inner-star">
									<div class="star-on"></div>
									<div class="star-on"></div>
									<div class="star-on"></div>
									<div class="star-on"></div>
									<div class="star-half"></div>
								</div>
								<span class="inner-score">9.6</span>
							</div>
						</div>
						<div class="site-score">
							<div class="site-score-1">
								<div class="grade">5星</div>
								<div class="star site-star">
									<div class="ic-star-on"></div>
									<div class="ic-star-on"></div>
									<div class="ic-star-on"></div>
									<div class="ic-star-on"></div>
									<div class="ic-star-on"></div>

								</div>
								<div class="numbers">3556人</div>
							</div>
							<div class="site-score-1">
								<div class="grade">4星</div>
								<div class="star site-star">
									<div class="ic-star-on"></div>
									<div class="ic-star-on"></div>
									<div class="ic-star-on"></div>
									<div class="ic-star-on"></div>
									<div class="ic-star-off"></div>

								</div>
								<div class="numbers">3556人</div>
							</div>
							<div class="site-score-1">
								<div class="grade">3星</div>
								<div class="star site-star">
									<div class="ic-star-on"></div>
									<div class="ic-star-on"></div>
									<div class="ic-star-on"></div>
									<div class="ic-star-off"></div>
									<div class="ic-star-off"></div>

								</div>
								<div class="numbers">3556人</div>
							</div>
							<div class="site-score-1">
								<div class="grade">2星</div>
								<div class="star site-star">
									<div class="ic-star-on"></div>
									<div class="ic-star-on"></div>
									<div class="ic-star-off"></div>
									<div class="ic-star-off"></div>
									<div class="ic-star-off"></div>

								</div>
								<div class="numbers">3556人</div>

							</div>
							<div class="site-score-1">
								<div class="grade">1星</div>
								<div class="star site-star">
									<div class="ic-star-on"></div>
									<div class="ic-star-off"></div>
									<div class="ic-star-off"></div>
									<div class="ic-star-off"></div>
									<div class="ic-star-off"></div>

								</div>
								<div class="numbers">3556人</div>
							</div>
						</div>
					</div>

				</div>
				<!--以下是comment-content  -->
				<div class="comment-content">
					<!--以下是content-title  -->
					<div class="content-title">
						<span> 共有${allComments}条评论 </span>
						<div class="sort">
							<a href="" class="new1">最新排序</a> <a href="" class="hot">最热排序</a>
						</div>
					</div>
					<!--以上是content-title  -->
					<!--以下是content-user  -->

					<div class="content-user">
						<%-- <c:if test="${flag==true}">
							<div class="nocomment">暂无评论</div>
						</c:if>
						<c:if test="${flag==false}">
						
							<c:forEach items="${comments}" var="Comment">
								<div class="user1">
									<div class="user-img">
										<img src="/reading/assets/img/book-img/img1.jpg" alt="">
									</div>
									<div class="user-info">
										<span class="user-name"> ${Comment.userId} </span> <span
											class="user-style"> 【购买用户】 </span> <span class="user-core">
											<div class="ic-star-on"></div>
											<div class="ic-star-on"></div>
											<div class="ic-star-on"></div>
											<div class="ic-star-on"></div>
											<div class="ic-star-on"></div>
										</span> <span class="user-num"> 10 </span> <span class="user-time">
											2019-06-16 19:59:54 </span> <span class="user-from"> 来自无限阅读 </span>
									</div>
									<div class="user-comment">
										<p class="user-comment-content">${Comment.commentInfo}</p>
									</div>
									<div class="user-reply">
										<div class="reply-over">
											<div class="reply-logo"></div>
											<div class="reply-num">2</div>
										</div>
										<div class="reply-txt">回复:</div>


									</div>
									<div class="textarea">
										<span class="reply-icon"></span> <input type="text"
											class="inputarea" maxlength="1000" tabindex="1"> <a
											href="javascript:;" class="do-reply-btn">回复</a>
									</div>
								</div>

							</c:forEach>
							
						</c:if> --%>
					</div>
					<!--以上是content-user  -->
					<div class="user-page">

						<%  
							int pageNumbers=(Integer)request.getAttribute("pageNum");
							if(pageNumbers>1){
							for(int i=1;i<=pageNumbers;i++){ %>
						<a href="javascript:" class="num1"><%=i%></a>
						<%
                        		
							}} 
						%>
						<%if(pageNumbers>1){ %>
						<a href="javascript:;" class="up">下一页</a>
						<%} %>
						<%if(pageNumbers>2){ %>
						<a href="javascript:;" class="down">尾页</a>
						<%} %>
					</div>
				</div>
				<!--以上设计comment-content  -->
			</div>
			<!--以下是book-right  -->
			<div class="book-right">
				<div class="right-title">
					<div class="title-icon"></div>
					<div class="title-txt right-txt">小说热门榜单</div>
				</div>
				<%
					int num = 0;
				%>
				<div class="hotSort">
					<c:forEach items="${findPaged}" var="book">
						<div class="hotBook2">
							<div class="hot-num"><%=++num%></div>
							<div class="hotBook-img">
								<img src="${book.bookImage}" alt="">
							</div>
							<div class="hot-name">
								<div class="hot-name-1">${book.bookName}</div>
								<div class="hot-name-2">${book.bookName}</div>
								<div class="hot-name-3">手机APP免费 244398人在读</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
			<!--以上是book-right  -->
		</div>
	</div>
	<!--以上是中间层  -->
	<!-------底部--------->
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
			如有问题欢迎联系<a href="">投诉反馈</a><br> <span>京ICP证030173号&nbsp;京网文[2017]2863-327号&nbsp;©2019
				Baidu&nbsp; <a href="">使用百度前必读</a>|<a href="">平台协议</a>|<a href="">企业文库</a>|
				<a href="">广告服务</a>|<a href="">百度教育商业服务平台</a>
			</span>
		</div>
	</div>
	<script type="text/javascript">
		var hotbs=$(".hotBook2");
		var hotImgs=$(".hotBook-img");
		var hotNames=$(".hot-name");
		hotImgs[0].style.display="block";
		hotNames[0].style.marginLeft="35px";
		hotbs[0].style.height="86px";
		for (var i = 0; i < hotbs.length; i++) {
			hotbs[i].index=i;
			hotbs.mouseenter(function(){
				for (var i = 0; i < hotbs.length; i++) {
					hotImgs[i].style.display="none";
					hotNames[i].style.marginLeft="0px";
					hotbs[i].style.height="36px";
				}
				hotImgs[this.index].style.display="block";
				hotNames[this.index].style.marginLeft="35px";
				hotbs[this.index].style.height="86px";
			});
		}
		window.onload=function(){
			/* 程序一开始就去运行加载一遍 */
			/* 
			console.log($(".book-title-name")[0].innerText);
			console.log($(".book-title-name").text());
			*/
			
			$.get(
					"http://localhost:8080/reading/Bookcomment",
					{pageSize:1,bookName:$(".book-title-name").text()},
					function(data){
						/* 映射 */
						$(".content-user").html(data);
						chushiDiv();
						/* 点击回复 */
						controlDiv();
						replys();
						
						
					}
			);
			fanye();
		};
		/* 
		这里输出的是想要获得的div的宽度
		console.log(parseInt($(".box").css("height")));
		console.log(parseInt($(".comment-content").css("height")));
		console.log(parseInt($(".content-user").css("height"))); 
		*/
		/* 初始化宽度 */
		var  chushiDiv=function (){
			var user=$(".content-user .user1");
			/* alert($(".content-user .user1").length); */
			if (user.length === 0) {
				$(".user-page").css("display", "none");
				$(".box").css("height", "1450px");
				$(".comment-content").css("height", "177px");
				$(".content-user").css("height", "55px");
			} else {
				var newboxH = 1450 + (user.length * 108.8) + "px";
				var newccH = 177 + (user.length * 108.8) - 75 + "px";
				var newcuH = 55 + (user.length * 108.8) - 75 + "px";
				console.log(parseInt($(".box").css("height")));
				console.log(parseInt($(".comment-content").css("height")));
				console.log(parseInt($(".content-user").css("height")));
				$(".box").css("height", newboxH);
				$(".comment-content").css("height", newccH);
				$(".content-user").css("height", newcuH);
			}
		}
		/* 初始化宽度 */
		/*控制div的方法  */
		var controlDiv=function(){
			var flag = true;
			var newBoxH = 0;
			var newccH = 0;
			var newcuH = 0;
			var newu1H = 0;
			//alert(txts.length)
			var leng = $(".reply-txt");
			var over = $(".reply-over");
			/* 遍历js */
			for (var i = 0; i < leng.length; i++) {
				leng[i].index = i;
				/* 回复js */
				leng[i].onclick = function() {
					if (parseInt($(".user1")[this.index].getBoundingClientRect().height) == 108) {
						console.log(parseInt($(".user1")[this.index]
								.getBoundingClientRect().height));
						newBoxH = parseInt($(".box").css("height")) + 75 + "px";
						newccH = parseInt($(".comment-content").css("height")) + 75
								+ "px";
						newcuH = parseInt($(".content-user").css("height")) + 75
								+ "px";
						newu1H = 78.8 + 75 + "px";
						console.log(newBoxH + "," + newccH + "," + newcuH + ","
								+ newu1H);
						$(".box").css("height", newBoxH);
						$(".comment-content").css("height", newccH);
						$(".content-user").css("height", newcuH);
						$(".user1")[this.index].style.height = newu1H;
						$(".textarea")[this.index].style.display = "block";
						$(".reply-txt")[this.index].innerHTML = "收起回复";
						console.log(parseInt($(".user1")[this.index]
								.getBoundingClientRect().height));
					} else if (parseInt($(".user1")[this.index]
							.getBoundingClientRect().height) == 183) {
						console.log(parseInt($(".user1")[this.index]
								.getBoundingClientRect().height));
						newBoxH = parseInt($(".box").css("height")) - 75 + "px";
						newccH = parseInt($(".comment-content").css("height")) - 75
								+ "px";
						newcuH = parseInt($(".content-user").css("height")) - 75
								+ "px";
						newu1H = 153.8 - 75 + "px";
						console.log(newBoxH + "," + newccH + "," + newcuH + ","
								+ newu1H);
						$(".box").css("height", newBoxH);
						$(".comment-content").css("height", newccH);
						$(".content-user").css("height", newcuH);
						$(".user1")[this.index].style.height = newu1H;
						$(".textarea")[this.index].style.display = "none";
						$(".reply-txt")[this.index].innerHTML = "回复";
						console.log(parseInt($(".user1")[this.index]
								.getBoundingClientRect().height));
						}
					
					};
					/* 回复js */
					/* 点赞js */
					over[i].index=i;
					over[i].onclick =function onclick(indexs){
						var user="<%=
							session.getAttribute("user")==null?0:
							session.getAttribute("user").toString().split(",")[0].split("=")[1]
						%>"	
						var comment=$(".inputarea").eq(this.index).val();
						if(user==0){
							alert("请登录")
						}else{
							if (flag!=this.index) {
								var num = parseInt($(".reply-num")[this.index].innerHTML);
								num = num + 1
								$(".reply-num")[this.index].innerHTML = num;						
								flag =this.index;
							}
						}
					}
					/* 点赞js */
			}
			/* 遍历js */
		}
		/*控制div的方法  */
		
		/* 翻页js */
		var fanye=function(){
			var xunhuan=1;
			var pageSize;
			var fenyeNums=$(".num1");
			/* alert(fenyeNums.length) */
			var contentUser=$(".content-user");
			/* 翻页js */

				for(var i=0;i<fenyeNums.length;i++){
					fenyeNums[0].style.background= "#53b856";
					fenyeNums[0].style.color= "#fff";
					fenyeNums[i].index=i;			
					fenyeNums[i].onclick= function(){	
						for(var i=0;i<fenyeNums.length;i++){
							fenyeNums[i].style.background= "#fff";
							fenyeNums[i].style.color= "#555";
						}
						fenyeNums[this.index].style.background= "#53b856";
						fenyeNums[this.index].style.color= "#fff";
						var pageSizes=(this.index+1);
						$.get(
								"http://localhost:8080/reading/Bookcomment",
								{pageSize:pageSizes,bookName:$(".book-title-name").text()},
								function(data){
									$(".content-user").html(data);
									chushiDiv();
								}		
						);
					}				
				}
		}
		/* 点赞 */
		/*回复消息的js  */
		var replys=function(){

			var btns=$(".do-reply-btn")
			for(var d=0;d<btns.length;d++){
				var bookId=${bookId}
				btns[d].index=d;
				$(".do-reply-btn").eq(d).click(function(){
					var user="<%=
						session.getAttribute("user")==null?0:
						session.getAttribute("user").toString().split(",")[0].split("=")[1]
					%>"
					
					var comment=$(".inputarea").eq(this.index).val();
					if(user==0){
						alert("请登录")
					}else{
						console.log(comment+","+new Date()+","+user+","+bookId);
						$.get(
								"/reading/insertComment",
								{commentInfo:comment,
								 commentTime:new Date(),
								 userId:user,
								 bookId:bookId
								},
								function(data){
									if(data=="true"){
										alert("回复成功")
									}else{
										alert("回复失败")
									}
								}
						);
					}
					
				});	
			}
		
		}
		/*回复消息的js  */
	</script>
</body>
</html>