package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import dao.prototype.ISectionDao;
import entity.Section;
import entity.dto.ChapterContent;
@Repository
public class SectionDaoImpl implements ISectionDao{
	@Autowired
	private JdbcTemplate jt;
	@Override
	public void saveOrUpdate(Section section) {
		if(section.getId()==0){
			String sql="insert into t_section(section_content,"
					+ "chapter_id) values(?,?);";
			jt.update(sql,new Object[]{section.getSectionContent(),section.getChapterId()});
		}else{
			String sql="update t_section set section_content=?,chapter_id=? where id=?;";
			jt.update(sql,new Object[]{section.getSectionContent(),section.getChapterId(),section.getId()});
		}
	}

	@Override
	public void delete(int id) {
		jt.update("delete from t_section where id=?;",id);
	}

	@Override
	public Section findById(int id) {
		String sql="select * from t_section where id=?;";
		RowMapper<Section> rowMapper=new BeanPropertyRowMapper<Section>(Section.class);
		return jt.queryForObject(sql, rowMapper,id);
	}

	@Override
	public List<Section> findByChapterId(int chapterId) {
		String sql="select * from t_section where chapter_id=?;";
		RowMapper<Section> rowMapper=new BeanPropertyRowMapper<Section>(Section.class);
		return jt.query(sql, new Object[]{chapterId}, rowMapper);
	}

	@Override
	public List<Section> findAll() {
		RowMapper<Section> rowMapper=new BeanPropertyRowMapper<Section>(Section.class);
		return jt.query("select * from t_section", rowMapper);
	}

	@Override
	public List<ChapterContent> findContent(String bookName, String chapterName) {
		String sql="select t3.book_name as bookName,t2.chapter_name as chapterName,t1.section_content as sectionContent from"
				+ " t_section t1 left join t_chapter t2 on t1.chapter_id=t2.id left join t_book t3 on t2.book_id=t3.id "
				+ "where t3.book_name=? and t2.chapter_name=?;";
		/*String sql="select t3.book_name as bookName,t2.chapter_name as chapterName,t1.section_content as sectionContent from"
				+ " t_section t1 left join t_chapter t2 on t1.chapter_id=t2.id left join t_book t3 on t2.book_id=t3.id ";*/
		RowMapper<ChapterContent> rowMapper=new BeanPropertyRowMapper<ChapterContent>(ChapterContent.class);
		return jt.query(sql,new Object[]{bookName,chapterName},rowMapper);
	}

}
