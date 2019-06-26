package reading;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import dao.prototype.IAuthorDao;
import entity.Author;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestAuthor {
	@Autowired
	private IAuthorDao authorDao;
	@Test
	public void SaveOrUpdate(){
		Author author = new Author("李四","有",10);
		author.setId(23);
		authorDao.saveOrUpdate(author);
	}
	@Test
	public void delete(){
		authorDao.delete(22);
	}
	@Test
	public void queryAll(){
		List<Author> list = authorDao.findAll();
		for (Author author : list) {
			System.out.println(author);
		}
	}
	@Test
	public void queryById(){
		Author author2 = authorDao.findById(23);
		System.out.println(author2);
	}
	@Test
	public void queryByName(){
		Author author2 = authorDao.findByName("李四");
		System.out.println(author2);
	}
	
}
