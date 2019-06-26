package dao.prototype;

import java.util.List;

import entity.Book;
import entity.User;

public interface IBookDao {
	void saveOrUpdate(Book Book);
	void delete(int id);
	Book findById(int id);
	Book findByName(String BookName);
	List<Book> findAll();
	List<Book> findPaged(int offset,int pageSize);
}
