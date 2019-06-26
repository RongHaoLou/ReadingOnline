package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import dao.prototype.IBookDao;
import entity.Book;
import entity.User;
@Repository
public class BookDaoImpl implements IBookDao{
	@Autowired
	private JdbcTemplate jt;
	@Override
	public void saveOrUpdate(Book book) {
		if(book.getId()==0){
			String sql="insert into t_book(book_name,book_price,book_image,book_description,"
					+ "book_state,author_id,types_id,type_id,publish_id) values(?,?,?,?,?,?,?,?,?);";
			jt.update(sql,new Object[]{book.getBookName(),book.getBookPrice(),book.getBookImage(),book.getBookDescription(),
					book.isState(),book.getAuthorId(),book.getTypesId(),book.getTypeId(),book.getPublishId()});
		}else{
			String sql="update t_book set book_name=?,book_price=?,book_image=?,book_description,book_state,author_id"
					+ "types_id,type_id,publish_id=? where id=?;";
			jt.update(sql,new Object[]{book.getBookName(),book.getBookPrice(),book.getBookImage(),book.getBookDescription(),
					book.isState(),book.getAuthorId(),book.getTypesId(),book.getTypeId(),book.getPublishId(),book.getId()});
		}
	}

	@Override
	public void delete(int id) {
		jt.update("delete from t_book where id=?;",id);
	}

	@Override
	public Book findById(int id) {
		String sql="select * from t_book where id=?;";
		RowMapper<Book> rowMapper=new BeanPropertyRowMapper<Book>(Book.class);
		return jt.queryForObject(sql, rowMapper,id);
	}

	@Override
	public Book findByName(String bookName) {
		try {
			String sql="select * from t_book where book_name=?;";
			RowMapper<Book> rowMapper=new BeanPropertyRowMapper<Book>(Book.class);
			return jt.queryForObject(sql, rowMapper,bookName);
		} catch (DataAccessException e) {
			return null;
		}
	}

	@Override
	public List<Book> findAll() {
		RowMapper<Book> rowMapper=new BeanPropertyRowMapper<Book>(Book.class);
		return jt.query("select * from t_book", rowMapper);
	}
	@Override
	public List<Book> findPaged(int offset, int pageSize) {
		return jt.query("select * from t_book"
				+ " limit ?,?"
				,new Object[]{offset,pageSize},
				new BeanPropertyRowMapper<Book>(Book.class));
	}

}
