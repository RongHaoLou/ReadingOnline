package dao.prototype;

import java.util.List;

import entity.Book;
import entity.Comment;

public interface ICommentDao {
	void saveOrUpdate(Comment comment);
	void delete(int id);
	Comment findById(int id);
	
	//根据书的id查找这本书的全部内容
	List<Comment> findByBookId(int bookId);
	List<Comment> findAll();
	int pageNum(int bookId,int num);
	
	List<Comment> findPaged(int bookId,int offset, int pageSize);
	
}
