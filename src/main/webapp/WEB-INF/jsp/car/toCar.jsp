<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车_正版电子书免费在线阅读_无限阅读</title>
<link rel="icon" href="/reading/assets/img/index-img/top/min-logo.jpg"/>

<link rel="stylesheet" href="/reading/assets/css/car.css">
</head>
<body>
	<!-------top------->
	<div class="top">
		<div class="top-logo">
			<img src="/reading/assets/img/car-img/readLogo.jpg" alt=""
				style="width: 200px; height: 50px;">
		</div>
		<div class="top-search">
			<input type="search" value placeholder="数十万册图书中搜索" id="text">
			<input type="submit" value="搜索图书" id="submit">
		</div>
		<div class="top-right">
			<a href="/reading/login">登录</a>| <a href="/reading/register">注册</a>|
			<a href="/reading/car">购物车</a>| <a href="">意见反馈</a>
		</div>
	</div>
	<hr color="#58bd5a" size="3" width="1200px">
	<div class="car">
		<div class="car-top">
			<div class="book-info">电子书信息</div>
			<div class="book-price">电子书价格（元）</div>
			<div class="book-action">操作</div>
		</div>
		<div class="car-middle">
			<table>
			<c:forEach items="${books}" var="bookUpdate">
				<tr>
					<td><input type="checkbox" class="list1"
						style="width: 15px; height: 15px; position: absolute; left: 5px; top: 60px;">
						<div class="car-middle-list">
							<div class="car-middle-list-left">
								<div class="car-middle-list-left-part1"></div>
								<div class="car-middle-list-left-part2">
									<img src="${bookUpdate.bookImage}" alt=""
										style="width: 80px; height: 104px;">
								</div>
								<div class="car-middle-list-left-part3">
									<div class="car-middle-list-left-part3-top">${bookUpdate.bookName}</div>
									<div class="car-middle-list-left-part3-bottom">作者：${bookUpdate.authorName}</div>
								</div>
							</div>
							<div class="car-middle-list-center">￥<span>${bookUpdate.bookPrice}</span></div>
							<div class="car-middle-list-right">删除</div>
						</div>
					</td>
				</tr>
			</c:forEach>
			</table>
			
			
		</div>
		<div class="car-bottom">
			<div class="car-bottom-option1">
				<div class="car-bottom-option1-icon">
					<input type="checkbox" id="cb_quanxuan"  style="width: 15px; height: 15px;">
				</div>
				<span>全选</span>
			</div>
			<div class="car-bottom-option2">
				<a>删除选中图书</a>
			</div>
			<div class="car-bottom-option3">
				已选<span>0</span>本电子书
			</div>
			<div class="car-bottom-option4">
				<div class="car-bottom-option4-top">
					合计：￥<span>0.00</span>
				</div>
				<div class="car-bottom-option4-bottom">
					共优惠：<span>￥0.00</span>
				</div>
			</div>
			<div class="car-bottom-option5">去支付</div>
		</div>
	</div>
	<hr color="#ececec" size="0.5">
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
			如有问题欢迎联系<a href="">投诉反馈</a><br> <span>京ICP证190619号&nbsp;京网文[2017]2863-327号&nbsp;©2019
				Wuxian&nbsp; <a href="">使用无限前必读</a>|<a href="">平台协议</a>|<a href="">企业文库</a>|
				<a href="">广告服务</a>|<a href="">无限教育商业服务平台</a>
			</span>
		</div>
	</div>
</body>
<script type="text/javascript" src="/reading/assets/js/jquery-3.4.1.js+-"></script>
<script>

    var quanxuanflg=0;
    for(var i=0;i<$(".list1").length;i++){
        var flag=0;
        $(".list1")[i].index=i;
        $(".list1")[i].onclick=function () {
            flag=$(".list1").eq(this.index).is(':checked');
            if(flag){
                var one=$(".car-middle-list-center span")[this.index].innerHTML;
                one=one*1;
                var sum=$(".car-bottom-option4-top span").text();
                sum=sum*1;
                sum+=one;
                $(".car-bottom-option4-top span").text(sum);
                quanxuanflg++;
                console.log(quanxuanflg)
                if(quanxuanflg==($(".list1").length)){
                    $("#cb_quanxuan").attr("checked",true);
                    quanxuanflg=0;
                }else {
                    $("#cb_quanxuan").attr("checked",false);
                }
            }else{
                var one=$(".car-middle-list-center span")[this.index].innerHTML;
                one=one*1;
                var sum=$(".car-bottom-option4-top span").text();
                sum=sum*1;
                sum=sum-one;
                $(".car-bottom-option4-top span").text(sum);
                quanxuanflg--;
                console.log(quanxuanflg)
                if(quanxuanflg==($(".list1").length)){
                    $("#cb_quanxuan").attr("checked",true);
                    quanxuanflg=0;
                }else {
                    $("#cb_quanxuan").attr("checked",false);
                }
            }

        }


    }



    var numFlag=0;
    $("#cb_quanxuan").click(function () {
        numFlag=$("#cb_quanxuan").is(':checked');
        if(numFlag){
            var sums=0;
            for(var i=0;i<$(".list1").length;i++){
                sums+=($(".car-middle-list-center span")[i].innerHTML)*1;
            }
            $("input:checkbox").prop("checked","true");
            $(".car-bottom-option4-top span").text(sums);
        }else{

            $("input:checkbox").prop("checked",false);
            console.log($("#cb_quanxuan").is(':checked'));
            $(".car-bottom-option4-top span").text(0.00);
            //取消选中

        }
    })


</script>

</html>