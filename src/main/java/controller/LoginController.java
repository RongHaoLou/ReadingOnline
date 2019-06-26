package controller;
/** 
 *　　　　　　　   ┏┓　　　 ┏┓+ + 
 *　　　　　　　┏┛┻━━━━━┛┻┓ + + 
 *　　　　　　　┃　　　　　　┃ 　 
 *　　　　　　　┃　　　━　　  ┃ ++ + + + 
 *　　　　　　 ████━████  ┃+ 
 *　　　　　　　┃　　　　　　 ┃ + 
 *　　　　　　　┃　　　┻　　  ┃ 
 *　　　　　　　┃　　　　　　 ┃ + + 
 *　　　　　　　┗━┓　　　┏━━┛ 
 *　　　　　　　　 ┃　　　┃　　　　　　　　　　　 
 *　　　　　　　　 ┃　　　┃ + + + + 
 *　　　　　　　　 ┃　　　┃　　　　		Code is far away from bug with the animal protecting　　　　　　　 
 *　　　　　　　　 ┃　　　┃ + 　　　　	神兽保佑,代码无bug　　 　　　　　　　　　 
 *　　　　　　　　 ┃　 　   ┗━━━┓ + + 
 *　　　　　　　　┃ 　　　　　　　┣┓ 
 *　　　　　　　　┃ 　　　　　　　┏┛ 
 *　　　　　　　　┗┓┓┏━┳┓┏┛ + + + + 
 *　　　　　　　　   ┃┫┫ ┃┫┫ 
 *　　　　　　　　   ┗┻┛ ┗┻┛+ + + + 
 */  
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.prototype.IUserDao;
import entity.User;
import exception.ZEException;
import service.prototype.IUserService;

@Controller
public class LoginController {
	
	@Autowired
	IUserDao userDao;
	
	@Autowired
	IUserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/jsp/loginAndRegister/login");
		return mv;
	}
	@RequestMapping(value= "/loginToIndex",method = RequestMethod.GET)
	public void loginToIndex(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		//-- 从页面获取到用户名和密码
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		//-- 调用业务逻辑层的方法校验登录
		User user = null;
		try {
			user = userService.login(userName, password);	
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
		} catch (ZEException e) {	
			//-- 设置出错信息
			request.setAttribute("errorMessage", e.getMessage());
			//-- 登录失败继续显示login.jsp
			request.getRequestDispatcher("/WEB-INF/jsp/loginAndRegister/login.jsp").forward(request, response);
			//-- 一旦有跳转页面 最好加return 否则后续再跳转就会出错
			return;
		}
		if(userName.equals(user.getUserName())&&password.equals(user.getPassword())){
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write("<script>alert('登录成功！');</script>");
			response.sendRedirect(request.getContextPath()+"/index");
			return;
		}
	}
	@RequestMapping("/judge")
	public ModelAndView judge(){
		return null;
	}
	@RequestMapping("/register")
	public ModelAndView register(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/jsp/loginAndRegister/register");
		return mv;
	}
	@RequestMapping(value= "/registerToLogin",method = RequestMethod.POST)
	public void registerToLogin(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		String username = request.getParameter("username");
		System.out.println(username);
		username = new String(username.getBytes("iso-8859-1") , "utf-8");
		String phoneNumber = request.getParameter("phoneNumber");
		String password = request.getParameter("password");
		String tempRole = request.getParameter("role");
		tempRole = new String(tempRole.getBytes("iso-8859-1") , "utf-8");
		int roleId = 0;
		//-- 注册表单验证
		char[] un = username.toCharArray();
		char[] pn = phoneNumber.toCharArray();
		char[] ps = password.toCharArray();
		try {
			
			if(un.length<4||un.length>10){
				throw new ZEException("用户名长度应在4-10个字符之间!");
			}		
			userService.register(username);
		} catch (ZEException e) {	
			//-- 设置出错信息
			request.setAttribute("errorMessage1", e.getMessage());
			//-- 登录失败继续显示login.jsp
			request.getRequestDispatcher("/WEB-INF/jsp/loginAndRegister/register.jsp").forward(request, response);
			//-- 一旦有跳转页面 最好加return 否则后续再跳转就会出错
			return;
		}
		try {
			if(pn.length != 11){
				throw new ZEException("请输入正确的手机号!");
			}
		} catch (ZEException e) {	
			//-- 设置出错信息
			request.setAttribute("errorMessage2", e.getMessage());
			//-- 登录失败继续显示login.jsp
			request.getRequestDispatcher("/WEB-INF/jsp/loginAndRegister/register.jsp").forward(request, response);
			//-- 一旦有跳转页面 最好加return 否则后续再跳转就会出错
			return;
		}
		try {
			if(ps.length<6||ps.length>12){
				throw new ZEException("密码长度应在6-12个字符之间!");
			}
		} catch (ZEException e) {	
			//-- 设置出错信息
			request.setAttribute("errorMessage3", e.getMessage());
			//-- 登录失败继续显示login.jsp
			request.getRequestDispatcher("/WEB-INF/jsp/loginAndRegister/register.jsp").forward(request, response);
			//-- 一旦有跳转页面 最好加return 否则后续再跳转就会出错
			return;
		}
		if(tempRole.equals("普通用户")){
			roleId=2;
		} else if(tempRole.equals("作者")){
			roleId=1;
		}
		User user = new User();
		user.setUserName(username);
		user.setPhoneNumber(phoneNumber);;
		user.setPassword(password);
		user.setRoleId(roleId);
		user.setCreateDate(new Date());
		System.out.println(user);
		userDao.saveOrUpdate(user);
		request.getRequestDispatcher("/WEB-INF/jsp/loginAndRegister/registerSuccess.jsp").forward(request, response);
		return;	
	}
}
