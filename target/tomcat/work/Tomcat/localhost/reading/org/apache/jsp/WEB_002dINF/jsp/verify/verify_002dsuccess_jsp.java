/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-25 04:03:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.verify;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verify_002dsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul, ol {\r\n");
      out.write("            list-style: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: \"Helvetica Neue\", Helvetica, Arial, \"Lucida Grande\",\r\n");
      out.write("            sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .tab-head {\r\n");
      out.write("            margin-left: 48%;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        h2 {\r\n");
      out.write("            border-bottom: solid #02aaf1 2px;\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            height: 25px;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            float: left;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .selected {\r\n");
      out.write("            color: #FFFFFF;\r\n");
      out.write("            background-color: #02aaf1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .show {\r\n");
      out.write("            clear: left;\r\n");
      out.write("            display: block;\r\n");
      out.write("            margin-left: 30%;\r\n");
      out.write("            width: 50%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .new-btn-login-sp {\r\n");
      out.write("            padding: 1px;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            width: 75%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .new-btn-login {\r\n");
      out.write("            background-color: #02aaf1;\r\n");
      out.write("            color: #FFFFFF;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            border: none;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #main {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .content {\r\n");
      out.write("            margin-top: 5px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .content dt {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("            color: #666;\r\n");
      out.write("            font-size: 13px;\r\n");
      out.write("            margin-top: 8px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .content dd {\r\n");
      out.write("            margin-left: 120px;\r\n");
      out.write("            margin-bottom: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .content dd input {\r\n");
      out.write("            width: 85%;\r\n");
      out.write("            height: 28px;\r\n");
      out.write("            border: 0;\r\n");
      out.write("            -webkit-border-radius: 0;\r\n");
      out.write("            -webkit-appearance: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .foot-ul li {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: #666;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .note-help {\r\n");
      out.write("            color: #999999;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            line-height: 130%;\r\n");
      out.write("            margin-top: 5px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #btn-dd {\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .one_line {\r\n");
      out.write("            display: block;\r\n");
      out.write("            height: 1px;\r\n");
      out.write("            border: 0;\r\n");
      out.write("            border-top: 1px solid #eeeeee;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .am-header h1 {\r\n");
      out.write("            -webkit-box-flex: 1;\r\n");
      out.write("            -ms-flex: 1;\r\n");
      out.write("            box-flex: 1;\r\n");
      out.write("            line-height: 18px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            font-weight: 300;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("    <div id=\"tabhead\" class=\"tab-head\">\r\n");
      out.write("        <h2 id=\"tab1\" class=\"selected\" name=\"tab\">交易结果</h2>\r\n");
      out.write("    </div>\r\n");
      out.write("    <form name=alipayment action=\"/reading/index\" method=get\r\n");
      out.write("          target=\"_blank\">\r\n");
      out.write("        <div id=\"body1\" class=\"show\" name=\"divcontent\">\r\n");
      out.write("            <dl class=\"content\">\r\n");
      out.write("                <dt>商户订单号 ：</dt>\r\n");
      out.write("                <dd>\r\n");
      out.write("                    <input id=\"WIDout_trade_no\" name=\"WIDout_trade_no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${out_trade_no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("                </dd>\r\n");
      out.write("                <hr class=\"one_line\">\r\n");
      out.write("                <dt>支付宝交易号 ：</dt>\r\n");
      out.write("                <dd>\r\n");
      out.write("                    <input id=\"WIDsubject\" name=\"WIDsubject\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trade_no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                </dd>\r\n");
      out.write("                <hr class=\"one_line\">\r\n");
      out.write("                <dt>付款金额 ：</dt>\r\n");
      out.write("                <dd>\r\n");
      out.write("                    <input id=\"WIDtotal_amount\" name=\"WIDtotal_amount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${total_amount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                </dd>\r\n");
      out.write("                <hr class=\"one_line\">\r\n");
      out.write("                <dt></dt>\r\n");
      out.write("                <dd id=\"btn-dd\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"new-btn-login-sp\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"new-btn-login\" type=\"submit\"\r\n");
      out.write("                                    style=\"text-align: center;\" onclick=\"click()\">确定</button>\r\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"note-help\">如果您点击“确定”按钮，即表示您同意该次的执行操作。</span>\r\n");
      out.write("                </dd>\r\n");
      out.write("            </dl>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
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
