/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-25 13:48:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.car;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.User;

public final class car_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fstep_005fitems_005fend_005fbegin;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fstep_005fitems_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fstep_005fitems_005fend_005fbegin.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>购物车_正版电子书免费在线阅读_无限阅读</title>\r\n");
      out.write("<link rel=\"icon\" href=\"/reading/assets/img/index-img/top/min-logo.jpg\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/reading/assets/css/car.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-------top------->\r\n");
      out.write("\t<div class=\"top\">\r\n");
      out.write("\t\t<div class=\"top-logo\">\r\n");
      out.write("\t\t\t<img src=\"/reading/assets/img/car-img/readLogo.jpg\" alt=\"\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 200px; height: 50px;\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"top-search\">\r\n");
      out.write("\t\t\t<input type=\"search\" value placeholder=\"数十万册图书中搜索\" id=\"text\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"搜索图书\" id=\"submit\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"top-right\">\r\n");
      out.write("\t\t\t<a href=\"/reading/login\">\r\n");
      out.write("\t\t\t");
      out.print(
				session.getAttribute("user")==null?"登录":
				session.getAttribute("user").toString().split(",")[1].split("=")[1]
			);
      out.write("\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t| <a href=\"/reading/register\">注册</a>|\r\n");
      out.write("\t\t\t<a href=\"/reading/car\">购物车</a>| <a href=\"\">意见反馈</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr color=\"#58bd5a\" size=\"3\" width=\"1200px\">\r\n");
      out.write("\t<div class=\"car\">\r\n");
      out.write("\t\t<div class=\"car-top\">\r\n");
      out.write("\t\t\t<div class=\"book-info\">电子书信息</div>\r\n");
      out.write("\t\t\t<div class=\"book-price\">电子书价格（元）</div>\r\n");
      out.write("\t\t\t<div class=\"book-action\">操作</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"car-middle\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t");
int num=0;
			int end=0;
			
      out.write("\r\n");
      out.write("\t\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/jsp/car/car.jsp(52,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/car/car.jsp(52,3) '${cars }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${cars }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/jsp/car/car.jsp(52,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("car");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t<td><input type=\"checkbox\" id=\"list1\"\r\n");
            out.write("\t\t\t\t\t\tstyle=\"width: 15px; height: 15px; position: absolute; left: 5px; top: 60px;\" onclick=\"total();\">\r\n");
            out.write("\t\t\t\t\t\t<div class=\"car-middle-list\">\r\n");
            out.write("\t\t\t\t\t\t\t<div class=\"car-middle-list-left\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"car-middle-list-left-part1\"></div>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"car-middle-list-left-part2\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.bookImage }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\" alt=\"\"\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 80px; height: 104px;\">\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"car-middle-list-left-part3\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div class=\"car-middle-list-left-part3-top\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.bookName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div class=\"car-middle-list-left-part3-bottom\">作者：\r\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fstep_005fitems_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
            _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
            // /WEB-INF/jsp/car/car.jsp(66,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/car/car.jsp(66,9) '${authors }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${authors }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
            // /WEB-INF/jsp/car/car.jsp(66,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setVar("author");
            // /WEB-INF/jsp/car/car.jsp(66,9) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setBegin(num );
            // /WEB-INF/jsp/car/car.jsp(66,9) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setEnd(end );
            // /WEB-INF/jsp/car/car.jsp(66,9) name = step type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setStep(1);
            int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
              if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author.authorName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_c_005fforEach_005f1.doFinally();
              _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fstep_005fitems_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f1);
            }
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t");

									num += 1;
									end+=1;
										
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t<div class=\"car-middle-list-center\">￥<span>\r\n");
            out.write("\t\t\t\t\t\t\t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.bookPrice }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t</span></div>\r\n");
            out.write("\t\t\t\t\t\t\t<div class=\"car-middle-list-right\">\r\n");
            out.write("\t\t\t\t\t\t\t<a href=\"/reading/deleteCar?bookId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\">删除</a>\r\n");
            out.write("\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"car-bottom\">\r\n");
      out.write("\t\t\t<div class=\"car-bottom-option1\">\r\n");
      out.write("\t\t\t\t<div class=\"car-bottom-option1-icon\">\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" id=\"cb_quanxuan\" onclick=\"quanxuan()\" style=\"width: 15px; height: 15px;\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<span>全选</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"car-bottom-option2\">\r\n");
      out.write("\t\t\t\t<a>删除选中图书</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"car-bottom-option3\">\r\n");
      out.write("\t\t\t\t已选<span>0</span>本电子书\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"car-bottom-option4\">\r\n");
      out.write("\t\t\t\t<div class=\"car-bottom-option4-top\">\r\n");
      out.write("\t\t\t\t\t合计：￥<span>0.00</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"car-bottom-option4-bottom\">\r\n");
      out.write("\t\t\t\t\t共优惠：<span>￥0.00</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tfunction quanxuan() {\r\n");
      out.write("\t\t\t\t\tvar lists=document.querySelectorAll(\"#list1\")\r\n");
      out.write("\t\t\t\t\tvar span=document.querySelector(\".car-bottom-option3 span\");\r\n");
      out.write("\t\t\t\t\tif (document.getElementById(\"cb_quanxuan\").checked) {\r\n");
      out.write("\t\t\t\t\t\t\tfor(var i=0;i<lists.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\tlists[i].checked=true;\r\n");
      out.write("\t\t\t\t\t\t\t\tspan.innerHTML=lists.length;\t\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tfor(var i=0;i<lists.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\tlists[i].checked=false;\r\n");
      out.write("\t\t\t\t\t\t\t\tspan.innerHTML=0;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar price=document.querySelector(\".car-bottom-option4-top span\");\r\n");
      out.write("\t\t\t\t\tvar totalPrice=0;\r\n");
      out.write("\t\t\t\t\tvar singlePrice;\r\n");
      out.write("\t\t\t\t\tif (document.getElementById(\"cb_quanxuan\").checked) {\r\n");
      out.write("\t\t\t\t\t\tfor(var i=0;i<lists.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\tlists[i].checked=true;\r\n");
      out.write("\t\t\t\t\t\t\tsinglePrice=document.querySelectorAll(\".car-middle-list-center span\");\r\n");
      out.write("\t\t\t\t\t\t\tfor(var i=0;i<singlePrice.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\tvar sss=singlePrice[i].innerText;\r\n");
      out.write("\t\t\t\t\t\t\t\ttotalPrice=totalPrice+Number(sss);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tprice.innerHTML=totalPrice;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tfor(var i=0;i<lists.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\tlists[i].checked=false;\r\n");
      out.write("\t\t\t\t\t\t\tprice.innerHTML=\"0.00\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\tfunction total() {\r\n");
      out.write("\t\t\t\t\t\tvar lists=document.querySelectorAll(\"#list1\");\r\n");
      out.write("\t\t\t\t\t\tvar bookNum=0;\r\n");
      out.write("\t\t\t\t\t\tvar span=document.querySelector(\".car-bottom-option3 span\");\r\n");
      out.write("\t\t\t\t\t\tfor(var i=0;i<lists.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\tif(lists[i].checked==true){\r\n");
      out.write("\t\t\t\t\t\t\t\tbookNum++;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tspan.innerHTML=bookNum;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar price=document.querySelector(\".car-bottom-option4-top span\");\r\n");
      out.write("\t\t\t\t\t\tvar totalPrice=0.00;\r\n");
      out.write("\t\t\t\t\t\tvar singlePrice;\r\n");
      out.write("\t\t\t\t\t\tfor(var i=0;i<lists.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\tif(lists[i].checked==true){\r\n");
      out.write("\t\t\t\t\t\t\t\tsinglePrice=document.querySelectorAll(\".car-middle-list-center span\");\r\n");
      out.write("\t\t\t\t\t\t\t\tvar sss=singlePrice[i].innerText;\r\n");
      out.write("\t\t\t\t\t\t\t\ttotalPrice=totalPrice+Number(sss);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tprice.innerHTML=totalPrice.toFixed(2);\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\t\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t<div class=\"car-bottom-option5\">去支付</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr color=\"#ececec\" size=\"0.5\">\r\n");
      out.write("\t<!-------底部--------->\r\n");
      out.write("\t<div class=\"foot\">\r\n");
      out.write("\t\t<div class=\"foot-top\">\r\n");
      out.write("\t\t\t<div class=\"foot-top-part\">\r\n");
      out.write("\t\t\t\t<div class=\"foot-top-part-img foot-top-part-img1\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"foot-top-part-info\">正版电子书</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"foot-top-part\">\r\n");
      out.write("\t\t\t\t<div class=\"foot-top-part-img foot-top-part-img2\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"foot-top-part-info\">多平台阅读</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"foot-top-part\">\r\n");
      out.write("\t\t\t\t<div class=\"foot-top-part-img foot-top-part-img3\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"foot-top-part-info\">海量图书阅读</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"foot-top-part\">\r\n");
      out.write("\t\t\t\t<div class=\"foot-top-part-img foot-top-part-img4\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"foot-top-part-info\">优质阅读体验</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"foot-middel\">\r\n");
      out.write("\t\t\t<div class=\"foot-middel-part\">\r\n");
      out.write("\t\t\t\t<div class=\"foot-middel-part-info\">帮助</div>\r\n");
      out.write("\t\t\t\t<div class=\"foot-middel-part-con\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\">如何购买图书</a><br> <a href=\"\">常见问题</a><br> <a\r\n");
      out.write("\t\t\t\t\t\thref=\"\">支付方式</a><br>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"foot-middel-part\">\r\n");
      out.write("\t\t\t\t<div class=\"foot-middel-part-info\">平台入驻</div>\r\n");
      out.write("\t\t\t\t<div class=\"foot-middel-part-con\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\">机构专区</a><br> <a href=\"\">个人作者专区</a><br>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"foot-middel-part\">\r\n");
      out.write("\t\t\t\t<div class=\"foot-middel-part-info\">投诉与建议</div>\r\n");
      out.write("\t\t\t\t<div class=\"foot-middel-part-con\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\">问题反馈</a><br>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"foot-middel-part\">\r\n");
      out.write("\t\t\t\t<div class=\"foot-middel-part-info\">扫描下载客户端</div>\r\n");
      out.write("\t\t\t\t<div class=\"foot-middel-part-img\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"foot-bottom\">\r\n");
      out.write("\t\t\t如有问题欢迎联系<a href=\"\">投诉反馈</a><br> <span>京ICP证190619号&nbsp;京网文[2017]2863-327号&nbsp;©2019\r\n");
      out.write("\t\t\t\tWuxian&nbsp; <a href=\"\">使用无限前必读</a>|<a href=\"\">平台协议</a>|<a href=\"\">企业文库</a>|\r\n");
      out.write("\t\t\t\t<a href=\"\">广告服务</a>|<a href=\"\">无限教育商业服务平台</a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
