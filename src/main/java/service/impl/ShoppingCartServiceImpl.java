package service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.IAuthorDao;
import dao.prototype.IBookDao;
import dao.prototype.IShoppingCartDao;
import entity.Author;
import entity.Book;
import entity.ShoppingCart;
import service.prototype.IShoppingCartService;
@Service
public class ShoppingCartServiceImpl implements IShoppingCartService{
	@Autowired
	private IShoppingCartDao shoppingCartDao;
	@Autowired 
	private IBookDao bookDao;
	@Autowired
	private IAuthorDao authorDao;
	@Override
	public List<Book> findByUserId(int userId) {
		List<Book> books=new ArrayList<Book>();
		List<ShoppingCart> shoppingCarts = shoppingCartDao.findByUserId(userId);
		for (ShoppingCart shoppingCart : shoppingCarts) {
			Book book=bookDao.findById(shoppingCart.getBook_id());
			books.add(book);
		}
		return books;
	}
	@Override
	public Author findByAuthorId(int authorId) {
		return authorDao.findById(authorId);
	}
	@Override
	public void delete(int bookId, int userId) {
		shoppingCartDao.delete(bookId, userId);
	}
	@Override
	public ShoppingCart findIsContain(int bookId, int userId) {	
		return shoppingCartDao.findIsContain(bookId, userId);
	}
	@Override
	public void saveOrUpdate(ShoppingCart shoppingCart) {
		shoppingCartDao.saveOrUpdate(shoppingCart);
		
	}
	

}
