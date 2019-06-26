package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import dao.prototype.IChapterDao;
import entity.Chapter;
import entity.Section;
@Repository
public class ChapterDaoImpl implements IChapterDao{
	@Autowired
	private JdbcTemplate jt;
	@Override
	public void saveOrUpdate(Chapter chapter) {
		if(chapter.getId()==0){
			String sql="insert into t_chapter(chapter_name,"
					+ "book_id) values(?,?);";
			jt.update(sql,new Object[]{chapter.getChapterName(),chapter.getBookId()});
		}else{
			String sql="update t_chapter set chapter_name=?,book_id=? where id=?;";
			jt.update(sql,new Object[]{chapter.getChapterName(),chapter.getBookId(),chapter.getId()});
		}
	}

	@Override
	public void delete(int id) {
		jt.update("delete from t_chapter where id=?;",id);
	}

	@Override
	public Chapter findById(int id) {
		String sql="select * from t_chapter where id=?;";
		RowMapper<Chapter> rowMapper=new BeanPropertyRowMapper<Chapter>(Chapter.class);
		return jt.queryForObject(sql, rowMapper,id);
	}

	@Override
	public Chapter findByName(String chapterName) {
		String sql="select * from t_chapter where chapter_name=?;";
		RowMapper<Chapter> rowMapper=new BeanPropertyRowMapper<Chapter>(Chapter.class);
		return jt.queryForObject(sql, rowMapper,chapterName);
	}

	@Override
	public List<Chapter> findAll() {
		RowMapper<Chapter> rowMapper=new BeanPropertyRowMapper<Chapter>(Chapter.class);
		return jt.query("select * from t_chapter", rowMapper);
	}

	@Override
	public List<Chapter> findByBookId(int bookId) {
		String sql="select * from t_chapter where book_id=?;";
		RowMapper<Chapter> rowMapper=new BeanPropertyRowMapper<Chapter>(Chapter.class);
		return jt.query(sql, new Object[]{bookId}, rowMapper);
	}

}
