package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.prototype.IAuthorDao;
import dao.prototype.IBookDao;
import dao.prototype.IShoppingCartDao;
import entity.Author;
import entity.Book;
import entity.BookUpdate;
import entity.ShoppingCart;
import entity.User;
import service.prototype.IBookService;
import service.prototype.IShoppingCartService;

@Controller
public class CarController {
	BookUpdate newbu=new BookUpdate();
	@Autowired
	private IShoppingCartDao shopDao;
	@Autowired
	private IBookDao bookDao;
	@Autowired IAuthorDao authorDao;
	@Autowired
	private IShoppingCartService shoppingCartService;
	@RequestMapping("/car")
	public ModelAndView car(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView();
		User user=(User)request.getSession().getAttribute("user");
		if(user!=null){
			List<Book> cars = shoppingCartService.findByUserId(user.getId());
			request.setAttribute("cars", cars);
			List<Author> authors=new ArrayList<Author>();
			for(Book book:cars){
				Author author = shoppingCartService.findByAuthorId(book.getAuthorId());
				authors.add(author);
			}
			request.setAttribute("authors", authors);
			mv.setViewName("/jsp/car/car");
		}else{
			mv.setViewName("/jsp/loginAndRegister/login");
		}
		return mv;
	}
	@RequestMapping("/toCar")
	public void toCar(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		Object attribute = request.getSession().getAttribute("user");
		User user=(User)attribute;
		if(user!=null){
			String newBookName = request.getParameter("bookName");
			newBookName=new String(newBookName.getBytes("iso-8859-1"),"utf-8");	
			System.out.println(newBookName);
			//获取书的信息
			Book newBook = bookDao.findByName(newBookName);
			int addbookId=newBook.getId();
			System.out.println(addbookId);
			ShoppingCart addBook = shoppingCartService.findIsContain(addbookId, user.getId());
			if(addBook==null){
				shoppingCartService.saveOrUpdate(new ShoppingCart(user.getId(),addbookId));
			}else{
				shoppingCartService.delete(addbookId, user.getId());
			}
			try {
				response.sendRedirect(request.getContextPath()+"/car");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				response.sendRedirect(request.getContextPath()+"/login");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@RequestMapping("/deleteCar")
	public void deleteCar(HttpServletRequest request,HttpServletResponse response){
		String bookIdd = request.getParameter("bookId");
		int bookId=Integer.parseInt(bookIdd);
		System.out.println(bookId);
		User user=(User)request.getSession().getAttribute("user");
		int userId=user.getId();
		shoppingCartService.delete(bookId, userId);
		try {
			response.sendRedirect(request.getContextPath()+"/car");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
