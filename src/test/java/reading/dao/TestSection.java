package reading.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import dao.prototype.ISectionDao;
import entity.Section;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestSection {
	@Autowired
	private ISectionDao sectionDao;
	@Test
	public void SaveOrUpdate(){
		Section section = new Section("第四四节",7);
		section.setId(13);
		sectionDao.saveOrUpdate(section);
	}
	@Test
	public void delete(){
		sectionDao.delete(13);
	}
	@Test
	public void queryAll(){
		List<Section> list = sectionDao.findAll();
		for (Section section : list) {
			System.out.println(section);
		}
	}
	@Test
	public void queryById(){
		Section section2 = sectionDao.findById(13);
		System.out.println(section2);
	}
	@Test
	public void queryByName(){
		List<Section> list = sectionDao.findByChapterId(6);
		for (Section section : list) {
			System.out.println(section);
		}
	}
	
}
