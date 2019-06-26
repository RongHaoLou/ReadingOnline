package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import dao.prototype.ICommentDao;
import entity.Book;
import entity.Comment;
import util.DateUtil;
@Repository
public class CommentDaoImpl implements ICommentDao{
	@Autowired
	private JdbcTemplate jt;
	@Override
	public void saveOrUpdate(Comment comment) {
		if(comment.getId()==0){
			String sql="insert into t_comment(comment_info,comment_time,"
					+ "user_id,book_id) values(?,?,?,?);";
			jt.update(sql,new Object[]{comment.getCommentInfo(),DateUtil.formateDate(comment.getCommentTime(), "yyyy-MM-dd HH:mm:ss"),comment.getUserId(),comment.getBookId()});
		}else{
			String sql="update t_comment set comment_info=?,comment_time=?,user_id=?,book_id=? where id=?;";
			jt.update(sql,new Object[]{comment.getCommentInfo(),DateUtil.formateDate(comment.getCommentTime(), "yyyy-MM-dd HH:mm:ss"),comment.getUserId(),comment.getBookId(),comment.getId()});
		}
	}

	@Override
	public void delete(int id) {
		jt.update("delete from t_comment where id=?;",id);
	}

	@Override
	public Comment findById(int id) {
		String sql="select * from t_comment where id=?;";
		RowMapper<Comment> rowMapper=new BeanPropertyRowMapper<Comment>(Comment.class);
		return jt.queryForObject(sql, rowMapper,id);
	}

	@Override
	public List<Comment> findByBookId(int bookId) {
		String sql="select * from t_comment where book_id=?;";
		RowMapper<Comment> rowMapper=new BeanPropertyRowMapper<Comment>(Comment.class);
		
		return jt.query(sql, new Object[]{bookId}, rowMapper);
	}

	@Override
	public List<Comment> findAll() {
		RowMapper<Comment> rowMapper=new BeanPropertyRowMapper<Comment>(Comment.class);
		return jt.query("select * from t_comment", rowMapper);
	}

	@Override
	public int pageNum(int bookId, int num) {
		List<Comment> nums=jt.query("select * from t_comment"
				+ " where book_id=?"
				,new Object[]{bookId},
				new BeanPropertyRowMapper<Comment>(Comment.class));
		
		return nums.size()%num==0?(nums.size()/num):((nums.size()/num)+1);
	}

	@Override
	public List<Comment> findPaged(int bookId, int offset, int pageSize) {
		return jt.query("select * from t_comment"
				+ " where book_id=? limit ?,?"
				,new Object[]{bookId,offset,pageSize},
				new BeanPropertyRowMapper<Comment>(Comment.class));
	}

}
