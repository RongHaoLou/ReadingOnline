/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-19 04:04:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.loginAndRegister;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>无限阅读用户注册界面</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/reading/assets/css/loginAndRegister.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"register\">\r\n");
      out.write("        <div class=\"register-content\">\r\n");
      out.write("            <div class=\"register-content-top\">\r\n");
      out.write("                <div class=\"register-content-top-logo\"></div>\r\n");
      out.write("                <span>|</span>\r\n");
      out.write("                <div class=\"register-content-top-title\">注册无限阅读账号</div>\r\n");
      out.write("                <div class=\"register-content-top-right\">\r\n");
      out.write("                    <span>我已注册，现在就</span>\r\n");
      out.write("                    <a href=\"login.html\"><button class=\"login-btn\">登录</button></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"register-content-fenge\"></div>\r\n");
      out.write("            <form action=\"\" class=\"register-form\">\r\n");
      out.write("                <span style=\"width: 720px;height: 40px\"></span>\r\n");
      out.write("                <p class=\"common\">\r\n");
      out.write("                    <lable class=\"register-lable\">用户名</lable>\r\n");
      out.write("                    <input class=\"register-form-username\" value placeholder=\"请设置用户名\">\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"common\">\r\n");
      out.write("                    <lable class=\"register-lable\">手机号</lable>\r\n");
      out.write("                    <input class=\"register-form-username\" value placeholder=\"可用于登录和找回密码\">\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"common\">\r\n");
      out.write("                    <lable class=\"register-lable\">密码</lable>\r\n");
      out.write("                    <input class=\"register-form-password\" type=\"password\" value placeholder=\"设置登录密码密码\">\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"common\">\r\n");
      out.write("                    <lable class=\"register-lable\">身份类型</lable>\r\n");
      out.write("                    <select name=\"\" id=\"register-form-type\">\r\n");
      out.write("                        <option value=\"\">普通用户</option>\r\n");
      out.write("                        <option value=\"\">作者</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"common\">\r\n");
      out.write("                    <lable class=\"register-lable\">验证码</lable>\r\n");
      out.write("                    <input class=\"register-form-code\" value placeholder=\"请输入验证码\">\r\n");
      out.write("                    <canvas id=\"canvas\" width=\"120px\" height=\"40px\" onclick=\"drawPic()\"></canvas>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"overRead\">\r\n");
      out.write("                    <input class=\"overRead-check\" type=\"checkbox\">\r\n");
      out.write("                    <label>我已经阅读并接受</label>\r\n");
      out.write("                    <a href=\"\" style=\"text-decoration: none;color: #1B66C7\">《无限阅读用户协议》</a>\r\n");
      out.write("                    <label>及</label>\r\n");
      out.write("                    <a href=\"\" style=\"text-decoration: none;color: #1B66C7\">《用户隐私权保护声明》</a>\r\n");
      out.write("                </p>\r\n");
      out.write("                <a href=\"registerSuccess.html\"><input type=\"submit\" value=\"注册\" class=\"register-btn\"></a>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"register-bottom\">2019©Wuxian</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        //生成随机数\r\n");
      out.write("        function randomNum(min,max){\r\n");
      out.write("            return Math.floor(Math.random()*(max-min)+min);\r\n");
      out.write("        }\r\n");
      out.write("        //生成随机颜色RGB分量\r\n");
      out.write("        function randomColor(min,max){\r\n");
      out.write("            var _r = randomNum(min,max);\r\n");
      out.write("            var _g = randomNum(min,max);\r\n");
      out.write("            var _b = randomNum(min,max);\r\n");
      out.write("            return \"rgb(\"+_r+\",\"+_g+\",\"+_b+\")\";\r\n");
      out.write("        }\r\n");
      out.write("        function drawPic(){\r\n");
      out.write("            //获取到元素canvas\r\n");
      out.write("            var $canvas = document.getElementById(\"canvas\");\r\n");
      out.write("            var _str = \"0123456789\";//设置随机数库\r\n");
      out.write("            var _picTxt = \"\";//随机数\r\n");
      out.write("            var _num = 4;//4个随机数字\r\n");
      out.write("            var _width = $canvas.width;\r\n");
      out.write("            var _height = $canvas.height;\r\n");
      out.write("            var ctx = $canvas.getContext(\"2d\");//获取 context 对象\r\n");
      out.write("            ctx.textBaseline = \"bottom\";//文字上下对齐方式--底部对齐\r\n");
      out.write("            ctx.fillStyle = randomColor(180,240);//填充画布颜色\r\n");
      out.write("            ctx.fillRect(0,0,_width,_height);//填充矩形--画画\r\n");
      out.write("            for(var i=0; i<_num; i++){\r\n");
      out.write("                var x = (_width-10)/_num*i+10;\r\n");
      out.write("                var y = randomNum(_height/2,_height);\r\n");
      out.write("                var deg = randomNum(-45,45);\r\n");
      out.write("                var txt = _str[randomNum(0,_str.length)];\r\n");
      out.write("                _picTxt += txt;//获取一个随机数\r\n");
      out.write("                ctx.fillStyle = randomColor(10,100);//填充随机颜色\r\n");
      out.write("                ctx.font = randomNum(16,40)+\"px SimHei\";//设置随机数大小，字体为SimHei\r\n");
      out.write("                ctx.translate(x,y);//将当前xy坐标作为原始坐标\r\n");
      out.write("                ctx.rotate(deg*Math.PI/180);//旋转随机角度\r\n");
      out.write("                ctx.fillText(txt, 0,0);//绘制填色的文本\r\n");
      out.write("                ctx.rotate(-deg*Math.PI/180);\r\n");
      out.write("                ctx.translate(-x,-y);\r\n");
      out.write("            }\r\n");
      out.write("            for(var i=0; i<_num; i++){\r\n");
      out.write("                //定义笔触颜色\r\n");
      out.write("                ctx.strokeStyle = randomColor(90,180);\r\n");
      out.write("                ctx.beginPath();\r\n");
      out.write("                //随机划线--4条路径\r\n");
      out.write("                ctx.moveTo(randomNum(0,_width), randomNum(0,_height));\r\n");
      out.write("                ctx.lineTo(randomNum(0,_width), randomNum(0,_height));\r\n");
      out.write("                ctx.stroke();\r\n");
      out.write("            }\r\n");
      out.write("            for(var i=0; i<_num*10; i++){\r\n");
      out.write("                ctx.fillStyle = randomColor(0,255);\r\n");
      out.write("                ctx.beginPath();\r\n");
      out.write("                //随机画原，填充颜色\r\n");
      out.write("                ctx.arc(randomNum(0,_width),randomNum(0,_height), 1, 0, 2*Math.PI);\r\n");
      out.write("                ctx.fill();\r\n");
      out.write("            }\r\n");
      out.write("            return _picTxt;//返回随机数字符串\r\n");
      out.write("        }\r\n");
      out.write("        drawPic();\r\n");
      out.write("    </script>\r\n");
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
