package dao.prototype;

import java.util.List;

import entity.Section;
import entity.dto.ChapterContent;

public interface ISectionDao {
	void saveOrUpdate(Section section);
	void delete(int id);
	Section findById(int id);
	//通过章id查看它的节内容
	List<Section> findByChapterId(int chapterId);
	List<Section> findAll();
	
	List<ChapterContent> findContent(String bookName,String chapterName);
}
