package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import dao.prototype.IBookDao;
import dao.prototype.IPublishDao;
import entity.Book;
import entity.Publish;


@Controller
public class IndexContrller {
	
	@Autowired 
	IBookDao bookDao;
	@Autowired 
	IPublishDao pubDao;
	
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response){	

		ModelAndView mv=new ModelAndView();
		
		List<Book> lists1 = bookDao.findPaged(0, 6);	//hot第一行
		List<Book> lists2 = bookDao.findPaged(6, 6);	//hot第二行
		List<Book> lists3 = bookDao.findPaged(12, 6);	//new第一行
		List<Book> lists4 = bookDao.findPaged(18, 6);	//new第二行
		List<Book> lists5 = bookDao.findPaged(24, 6);	//love第一行
		List<Book> lists6 = bookDao.findPaged(30, 6);	//love第二行
		List<Book> lists7 = bookDao.findPaged(36, 6);	//recommend第一行
		List<Book> lists8 = bookDao.findPaged(42, 6);	//recommend第二行
		List<Book> list01 = bookDao.findAll();			//press--book
		
		List<Publish> list02 = pubDao.findAll();		//press--publish
		
		List<String> arr=new ArrayList<>();
		for(int i=0;i<list01.size();i++){
			
			arr.add("'"+list01.get(i).getBookName()+"'");
		}
		System.out.println(arr);
		
		List<List<Book>> listss1=new ArrayList<>();		//hot
		List<List<Book>> listss2=new ArrayList<>();		//new
		List<List<Book>> listss3=new ArrayList<>();		//love
		List<List<Book>> listss4=new ArrayList<>();		//recommend
		
		listss1.add(lists1);
		listss1.add(lists2);
		listss2.add(lists3);
		listss2.add(lists4);			//添加数据
		listss3.add(lists5);
		listss3.add(lists6);
		listss4.add(lists7);
		listss4.add(lists8);
		
		request.setAttribute("listss1",listss1);		//发送给JSP.hot
		request.setAttribute("listss2",listss2);		//发送给JSP.new
		request.setAttribute("listss3",listss3);		//发送给JSP.love
		request.setAttribute("listss4",listss4);		//发送给JSP.new

		request.setAttribute("list01",list01);			//发送给JSP.press--book
		request.setAttribute("list02",list02);			//发送给JSP.press--publish
		
		request.setAttribute("arr",arr);
		
		mv.setViewName("/jsp/index/index");		//设置转向地址
		
		return mv;
	
	}
	
	
}
