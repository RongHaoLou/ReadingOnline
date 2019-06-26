<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


						<c:if test="${flag==true}">
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
										<span class="reply-icon"></span> 
										<input type="text" class="inputarea" maxlength="1000" tabindex="1"> 
										<a href="javascript:;" class="do-reply-btn">回复</a>
									</div>
								</div>

							</c:forEach>
							
						</c:if>
