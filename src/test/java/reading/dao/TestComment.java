package reading.dao;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import dao.prototype.ICommentDao;
import entity.Comment;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestComment {
	@Autowired
	private ICommentDao commentDao;
	@Test
	public void SaveOrUpdate(){
		Comment comment = new Comment("李四",new Date(),10,20);
		comment.setId(2);
		commentDao.saveOrUpdate(comment);
	}
	@Test
	public void delete(){
		commentDao.delete(2);
	}
	@Test
	public void queryAll(){
		List<Comment> list = commentDao.findAll();
		for (Comment comment : list) {
			System.out.println(comment);
		}
	}
	@Test
	public void queryById(){
		Comment comment2 = commentDao.findById(2);
		System.out.println(comment2);
	}
	@Test
	public void queryByName(){
		List<Comment> comment2 = commentDao.findByBookId(20);
		System.out.println(comment2);
	}
	
}
