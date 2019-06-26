package dao.prototype;

import java.util.List;

import entity.Chapter;

public interface IChapterDao {
	void saveOrUpdate(Chapter Chapter);
	void delete(int id);
	Chapter findById(int id);
	Chapter findByName(String ChapterName);
	List<Chapter> findAll();
	//根据书的id找到它所对应的章节
	List<Chapter> findByBookId(int bookId);
}
