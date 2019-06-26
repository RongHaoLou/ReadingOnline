package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import dao.prototype.IAuthorDao;
import entity.Author;
@Repository
public class AuthorDaoImpl implements IAuthorDao{
	@Autowired
	private JdbcTemplate jt;
	@Override
	public void saveOrUpdate(Author author) {
		if(author.getId()==0){
			String sql="insert into t_author(author_name,"
					+ "author_info,author_books) values(?,?,?);";
			jt.update(sql,new Object[]{author.getAuthorName(),author.getAuthorInfo(),author.getAuthorBooks()});
		}else{
			String sql="update t_author set author_name=?,author_info=?,author_books=? where id=?;";
			jt.update(sql,new Object[]{author.getAuthorName(),author.getAuthorInfo(),author.getAuthorBooks(),author.getId()});
		}
	}

	@Override
	public void delete(int id) {
		jt.update("delete from t_author where id=?;",id);
	}

	@Override
	public Author findById(int id) {
		String sql="select * from t_author where id=?;";
		RowMapper<Author> rowMapper=new BeanPropertyRowMapper<Author>(Author.class);
		return jt.queryForObject(sql, rowMapper,id);
	}

	@Override
	public Author findByName(String authorName) {
		String sql="select * from t_author where author_name=?;";
		RowMapper<Author> rowMapper=new BeanPropertyRowMapper<Author>(Author.class);
		return jt.queryForObject(sql, rowMapper,authorName);
	}

	@Override
	public List<Author> findAll() {
		RowMapper<Author> rowMapper=new BeanPropertyRowMapper<Author>(Author.class);
		return jt.query("select * from t_author", rowMapper);
	}

}
