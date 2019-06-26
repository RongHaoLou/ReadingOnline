package reading.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import dao.prototype.IBookDao;
import entity.Book;
import entity.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestBook {
	@Autowired
	private IBookDao bookDao;
	@Test
	public void SaveOrUpdate(){
		Book book = new Book("aaa",255,"afhsaifh","fihsf",false,2,3,15,25);
		//book.setId(23);
		bookDao.saveOrUpdate(book);
	}
	@Test
	public void delete(){
		bookDao.delete(51);
	}
	@Test
	public void queryAll(){
		List<Book> list = bookDao.findAll();
		for (Book book : list) {
			System.out.println(book);
		}
	}
	@Test
	public void queryById(){
		Book book2 = bookDao.findById(51);
		System.out.println(book2);
	}
	@Test
	public void queryByName(){
		Book book2 = bookDao.findByName("都挺好");
		System.out.println(book2);
	}
	
}
