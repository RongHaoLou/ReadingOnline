package service.prototype;
/**
 * 业务接口
 * @author ZhenLi
 *
 */

import java.util.List;

import entity.Book;

public interface IBookService {
	//1上传一本书
	void saveBook(Book book);
	//2.查询一本书
	Book queryBook(int id);
	Book findByName(String bookName);
	//3.查询所有的本书
	List<Book> queryBooks();
	//4.修改一本书
	void updateBook(Book book);
	//5.按分页取一排书
	List<Book> findPaged(int offset,int pageSize);

	
}
