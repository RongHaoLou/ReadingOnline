package reading.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import dao.prototype.IPublishDao;
import entity.Publish;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestPublish {
	@Autowired
	private IPublishDao publishDao;
	@Test
	public void SaveOrUpdate(){
		Publish publish = new Publish("李四",68646644l,"人出版社");
		publish.setId(2);
		publishDao.saveOrUpdate(publish);
	}
	@Test
	public void delete(){
		publishDao.delete(2);
	}
	@Test
	public void queryAll(){
		List<Publish> list = publishDao.findAll();
		for (Publish publish : list) {
			System.out.println(publish);
		}
	}
	@Test
	public void queryById(){
		Publish publish2 = publishDao.findById(2);
		System.out.println(publish2);
	}
	@Test
	public void queryByName(){
		Publish publish2 = publishDao.findByName("李四");
		System.out.println(publish2);
	}
	
}
