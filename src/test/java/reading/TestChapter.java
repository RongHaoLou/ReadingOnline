package reading;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import dao.prototype.IChapterDao;
import entity.Chapter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestChapter {
	@Autowired
	private IChapterDao chapterDao;
	@Test
	public void SaveOrUpdate(){
		Chapter chapter = new Chapter("第六六章",2);
		chapter.setId(11);
		chapterDao.saveOrUpdate(chapter);
	}
	@Test
	public void delete(){
		chapterDao.delete(11);
	}
	@Test
	public void queryAll(){
		List<Chapter> list = chapterDao.findAll();
		for (Chapter chapter : list) {
			System.out.println(chapter);
		}
	}
	@Test
	public void queryById(){
		Chapter chapter2 = chapterDao.findById(11);
		System.out.println(chapter2);
	}
	@Test
	public void queryByName(){
		Chapter chapter2 = chapterDao.findByName("第六六章");
		System.out.println(chapter2);
	}
	@Test
	public void queryByBookId(){
		List<Chapter> list = chapterDao.findByBookId(1);
		for (Chapter chapter : list) {
			System.out.println(chapter);
		}
	}
}
