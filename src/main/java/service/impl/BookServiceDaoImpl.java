package service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.prototype.IBookDao;
import entity.Book;
import service.prototype.IBookService;

@Service
public class BookServiceDaoImpl implements IBookService{

	/*private IAccountDao actDao=new AccountDaoJdbcImpl();*/
	@Autowired
	private IBookDao bookDao;

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book queryBook(int id) {
		return bookDao.findById(id);
		
	}
	@Override
	public Book findByName(String bookName) {
		return bookDao.findByName(bookName);
	}

	@Override
	public List<Book> queryBooks() {
		List<Book> findAllBooks = bookDao.findAll();
		return findAllBooks;
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> findPaged(int offset, int pageSize) {
		return bookDao.findPaged(offset, pageSize);
	}

	

	
	
	

}
