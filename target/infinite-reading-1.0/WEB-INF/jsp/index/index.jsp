<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>无限阅读网-首页</title>
<link rel="stylesheet" href="../css/index.css">
    <script>
        window.onload=function(ev){
            var banner = document.querySelectorAll(".banner")
            var btns = document.querySelectorAll(".btn")
            var num=0
            setInterval(function () {
                if (num == 4) {
                    num = 0;
                }
                for (var i = 0; i < banner.length; i++) {
                    banner[i].style.display = "none"
                    btns[i].style.background="#000"
                }
                banner[num].style.display = "block";
                btns[num].style.background="orange"
                num++
            },3000)
                var name=document.querySelectorAll(".press-main-left-part a")
                var content=document.querySelectorAll(".press-main-right-part")
                for(var i=0;i<name.length;i++){
                    name[i].index=i;
                    name[i].onmouseover=function () {
                        for(var j=0;j<name.length;j++){
                            content[j].style.display="none"
                        }
                        content[this.index].style.display="block"
                    }
                }
        }
    </script>
</head>
<body>
	<!-------top------->
    <div class="top">
        <div class="top-logo"><img src="../img/index-img/top/readLogo.jpg" alt="" style="width:200px;height:50px;"></div>
        <div class="top-search">
            <input type="search" value placeholder="数十万册图书中搜索" id="text">
            <input type="submit" value="搜索图书" id="submit">
            <a href="">暗黑者四部曲</a><a href="">如果可以这样爱</a>
            <a href="">都挺好</a><a href="">墨菲定律</a>
            <a href="">人性的弱点</a><a href="">东宫</a>
            <a href="">鬼吹灯</a>
        </div>
        <div class="top-right">
            <a href="../html/login.html">登录</a>|
            <a href="../html/register.html">注册</a>|
            <a href="../html/car.html">购物车</a>|
            <a href="">意见反馈</a>
        </div>
    </div>
<!-------导航------->
    <div class="daohang">
        <div class="daohang-con">
            <a href="">首页</a>
            <a href="">分类</a>
            <a href="">榜单</a>
            <a href="">独家作品</a>
            <a href="">机构专区</a>
            <a href="">客户端</a>
        </div>
        <div class="daohang-bookshelf">
            <div class="daohang-bookshelf-tu"></div>
            <div class="daohang-bookshelf-info"><a href="">我的书架</a></div>
        </div>
    </div>
    <hr id="daohang">
<!--------轮播----------->
    <div class="wheel">
        <div class="wheel-left">
            <div class="wheel-left-num">
                <span>3</span>
                <span>1</span>
                <span>1</span>
                <span>9</span>
                <span>2</span>
            </div>
            <div class="wheel-left-get"></div>
        </div>
        <div class="wheel-right">
            <a href=""><div class="banner banner1"></div></a>
            <a href=""><div class="banner banner2"></div></a>
            <a href=""><div class="banner banner3"></div></a>
            <a href=""><div class="banner banner4"></div></a>
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
        <input type="checkbox" id="dianji" style="display: none">
        <label for="dianji">更多<span>&nbsp;&nbsp;&nbsp;&nbsp;</span></label>
        <div class="type-con">
            <div class="type-con-left">分类</div>
            <div class="type-con-main">
                <a href="">成功学</a><a href="">投资理财</a><a href="">人基础是</a>
                <a href="">计算机</a><a href="">人物传记</a><a href="">言情小说</a>
                <a href="">随笔散文</a><a href="">悬疑推理</a><a href="">市场营销</a>
            </div>
            <div class="type-con-more">
                <a href="">健康养生</a><a href="">演讲口才</a><a href="">现当代小说</a>
                <a href="">宗教哲学</a><a href="">企业管理</a><a href="">心理学</a>
                <a href="">教育考试</a><a href="">历史小说</a><a href="">两性感情</a>
            </div>
        </div>
    </div>
<!-----------图片分类------------->
    <div class="img-type">
        <a href=""><img src="../img/index-img/img-type/1.jpg" alt=""></a>
        <a href=""><img src="../img/index-img/img-type/2.jpg" alt=""></a>
        <a href=""><img src="../img/index-img/img-type/3.jpg" alt=""></a>
    </div>
<!-----------背景色--------->
    <div class="background">
        <!---------热门推荐---------->
        <div class="hot">
            <div class="hot-top">
                <span>热门推荐</span>
                <a href="">更多&nbsp;></a>
            </div>
            <div class="hot-con">
                <a href="../html/book.html"><div class="hot-con-part">
                    <div class="hot-con-part-main"><img src="../img/index-img/hot-img/hot-1.jpg" alt=""></div>
                    <div class="hot-con-part-info">熊镇</div>
                    <div class="hot-con-part-price">￥12.99</div>
                </div></a>
                <div class="hot-con-part">
                    <div class="hot-con-part-main"></div>
                    <div class="hot-con-part-info"></div>
                    <div class="hot-con-part-price"></div>
                </div>
                <div class="hot-con-part">
                    <div class="hot-con-part-main"></div>
                    <div class="hot-con-part-info"></div>
                    <div class="hot-con-part-price"></div>
                </div>
                <div class="hot-con-part">
                    <div class="hot-con-part-main"></div>
                    <div class="hot-con-part-info"></div>
                    <div class="hot-con-part-price"></div>
                </div>
                <div class="hot-con-part">
                    <div class="hot-con-part-main"></div>
                    <div class="hot-con-part-info"></div>
                    <div class="hot-con-part-price"></div>
                </div>
                <div class="hot-con-part">
                    <div class="hot-con-part-main"></div>
                    <div class="hot-con-part-info"></div>
                    <div class="hot-con-part-price"></div>
                </div>
            </div>
            <div class="hot-con">
                <div class="hot-con-part">
                    <div class="hot-con-part-main"></div>
                    <div class="hot-con-part-info"></div>
                    <div class="hot-con-part-price"></div>
                </div>
                <div class="hot-con-part">
                    <div class="hot-con-part-main"></div>
                    <div class="hot-con-part-info"></div>
                    <div class="hot-con-part-price"></div>
                </div>
                <div class="hot-con-part">
                    <div class="hot-con-part-main"></div>
                    <div class="hot-con-part-info"></div>
                    <div class="hot-con-part-price"></div>
                </div>
                <div class="hot-con-part">
                    <div class="hot-con-part-main"></div>
                    <div class="hot-con-part-info"></div>
                    <div class="hot-con-part-price"></div>
                </div>
                <div class="hot-con-part">
                    <div class="hot-con-part-main"></div>
                    <div class="hot-con-part-info"></div>
                    <div class="hot-con-part-price"></div>
                </div>
                <div class="hot-con-part">
                    <div class="hot-con-part-main"></div>
                    <div class="hot-con-part-info"></div>
                    <div class="hot-con-part-price"></div>
                </div>
            </div>
        </div>
        <!---------新书上线---------->
        <div class="new">
            <div class="new-top">
                <span>新书上线</span>
                <a href="">更多&nbsp;></a>
            </div>
            <div class="new-con">
                <div class="new-con-part">
                    <div class="new-con-part-main"></div>
                    <div class="new-con-part-info"></div>
                    <div class="new-con-part-price"></div>
                </div>
                <div class="new-con-part"></div>
                <div class="new-con-part"></div>
                <div class="new-con-part"></div>
                <div class="new-con-part"></div>
                <div class="new-con-part"></div>
            </div>
            <div class="new-con">
                <div class="new-con-part"></div>
                <div class="new-con-part"></div>
                <div class="new-con-part"></div>
                <div class="new-con-part"></div>
                <div class="new-con-part"></div>
                <div class="new-con-part"></div>
            </div>
        </div>
        <!---------最受好评----------->
        <div class="love">
            <div class="love-top">
                <span>最受好评</span>
            </div>
            <div class="love-con">
                <div class="love-con-part">
                    <div class="love-con-part-main"></div>
                    <div class="love-con-part-info"></div>
                    <div class="love-con-part-price"></div>
                </div>
                <div class="love-con-part"></div>
                <div class="love-con-part"></div>
                <div class="love-con-part"></div>
                <div class="love-con-part"></div>
                <div class="love-con-part"></div>
            </div>
            <div class="love-con">
                <div class="love-con-part"></div>
                <div class="love-con-part"></div>
                <div class="love-con-part"></div>
                <div class="love-con-part"></div>
                <div class="love-con-part"></div>
                <div class="love-con-part"></div>
            </div>
        </div>
        <!---------经典推荐----------->
        <div class="recommend">
            <div class="recommend-top">
                <span>经典推荐</span>
                <a href="">更多&nbsp;></a>
            </div>
            <div class="recommend-con">
                <div class="recommend-con-part">
                    <div class="recommend-con-part-main"></div>
                    <div class="recommend-con-part-info"></div>
                    <div class="recommend-con-part-price"></div>
                </div>
                <div class="recommend-con-part"></div>
                <div class="recommend-con-part"></div>
                <div class="recommend-con-part"></div>
                <div class="recommend-con-part"></div>
                <div class="recommend-con-part"></div>
            </div>
            <div class="recommend-con">
                <div class="recommend-con-part"></div>
                <div class="recommend-con-part"></div>
                <div class="recommend-con-part"></div>
                <div class="recommend-con-part"></div>
                <div class="recommend-con-part"></div>
                <div class="recommend-con-part"></div>
            </div>
        </div>
    </div>
<!----------出版社------->
    <div class="press-background">
        <div class="press">
            <div class="press-top">出版社</div>
            <div class="press-main">
                <div class="press-main-left">
                    <div class="press-main-left-part">
                        <a href="javascript:;"><img src="../img/index-img/press/press-left-1.jpg" alt=""></a>
                    </div>
                    <div class="press-main-left-part">
                        <a href="javascript:;"><img src="../img/index-img/press/press-left-2.png" alt=""></a>
                    </div>
                    <div class="press-main-left-part">
                        <a href="javascript:;"><img src="../img/index-img/press/press-left-3.png" alt=""></a>
                    </div>
                    <div class="press-main-left-part">
                        <a href="javascript:;"><img src="../img/index-img/press/press-left-4.png" alt=""></a>
                    </div>
                    <div class="press-main-left-part">
                        <a href="javascript:;"><img src="../img/index-img/press/press-left-5.jpg" alt=""></a>
                    </div>
                    <div class="press-main-left-part">
                        <a href="javascript:;"><img src="../img/index-img/press/press-left-6.jpg" alt=""></a>
                    </div>
                    <div class="press-main-left-part">
                        <a href="javascript:;"><img src="../img/index-img/press/press-left-7.jpg" alt=""></a>
                    </div>
                    <div class="press-main-left-part">
                        <a href="javascript:;"><img src="../img/index-img/press/press-left-8.jpg" alt=""></a>
                    </div>
                    <div class="press-main-left-part">
                        <a href="javascript:;"><img src="../img/index-img/press/press-left-9.jpg" alt=""></a>
                    </div>
                </div>
                <div class="press-main-right">
                    <div class="press-main-right-part press-main-right-part1" style="z-index:2">
                        <div class="press-main-right-part-top">
                            <div class="press-main-right-part-top-tu"></div>
                            <div class="press-main-right-part-top-info">上海读客</div>
                        </div>
                        <div class="press-main-right-part-main">
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="../img/index-img/press/shu1.jpg" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info">人类简史</div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                        </div>
                    </div>
                    <div class="press-main-right-part press-main-right-part2">
                        <div class="press-main-right-part-top">
                            <div class="press-main-right-part-top-tu"></div>
                            <div class="press-main-right-part-top-info">中信出版社</div>
                        </div>
                        <div class="press-main-right-part-main">
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                        </div>
                    </div>
                    <div class="press-main-right-part press-main-right-part3">
                        <div class="press-main-right-part-top">
                            <div class="press-main-right-part-top-tu"></div>
                            <div class="press-main-right-part-top-info">华章数字媒体</div>
                        </div>
                        <div class="press-main-right-part-main">
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                        </div>
                    </div>
                    <div class="press-main-right-part press-main-right-part4">
                        <div class="press-main-right-part-top">
                            <div class="press-main-right-part-top-tu"></div>
                            <div class="press-main-right-part-top-info">北京磨铁数盟信息技术有限公司</div>
                        </div>
                        <div class="press-main-right-part-main">
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                        </div>
                    </div>
                    <div class="press-main-right-part press-main-right-part5">
                        <div class="press-main-right-part-top">
                            <div class="press-main-right-part-top-tu"></div>
                            <div class="press-main-right-part-top-info">湖北长江新世纪</div>
                        </div>
                        <div class="press-main-right-part-main">
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                        </div>
                    </div>
                    <div class="press-main-right-part press-main-right-part6">
                        <div class="press-main-right-part-top">
                            <div class="press-main-right-part-top-tu"></div>
                            <div class="press-main-right-part-top-info">新星出版社</div>
                        </div>
                        <div class="press-main-right-part-main">
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                        </div>
                    </div>
                    <div class="press-main-right-part press-main-right-part7">
                        <div class="press-main-right-part-top">
                            <div class="press-main-right-part-top-tu"></div>
                            <div class="press-main-right-part-top-info">中南博集天卷</div>
                        </div>
                        <div class="press-main-right-part-main">
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                        </div>
                    </div>
                    <div class="press-main-right-part press-main-right-part8">
                        <div class="press-main-right-part-top">
                            <div class="press-main-right-part-top-tu"></div>
                            <div class="press-main-right-part-top-info">果麦文化</div>
                        </div>
                        <div class="press-main-right-part-main">
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                        </div>
                    </div>
                    <div class="press-main-right-part press-main-right-part9">
                        <div class="press-main-right-part-top">
                            <div class="press-main-right-part-top-tu"></div>
                            <div class="press-main-right-part-top-info">理想国</div>
                        </div>
                        <div class="press-main-right-part-main">
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                            <div class="press-main-right-part-main-shu">
                                <div class="press-main-right-part-main-shu-tu">
                                    <img src="" alt="">
                                </div>
                                <div class="press-main-right-part-main-shu-info"></div>
                            </div>
                        </div>
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
                    <a href="">如何购买图书</a><br>
                    <a href="">常见问题</a><br>
                    <a href="">支付方式</a><br>
                </div>
            </div>
            <div class="foot-middel-part">
                <div class="foot-middel-part-info">平台入驻</div>
                <div class="foot-middel-part-con">
                    <a href="">机构专区</a><br>
                    <a href="">个人作者专区</a><br>
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
            如有问题欢迎联系<a href="">投诉反馈</a><br>
            <span>京ICP证030173号&nbsp;京网文[2017]2863-327号&nbsp;©2019 Baidu&nbsp;
                <a href="">使用百度前必读</a>|<a href="">平台协议</a>|<a href="">企业文库</a>|
                <a href="">广告服务</a>|<a href="">百度教育商业服务平台</a></span>
        </div>
    </div>
</body>
</html>