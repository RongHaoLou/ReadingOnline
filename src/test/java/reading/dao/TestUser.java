package reading.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.AppConfig;
import config.TestConfig;
import dao.prototype.IUserDao;
import entity.User;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestUser {

	@Autowired
	private IUserDao userDao;
	
	@Test
	public void testFindAll(){
		List<User> findAll = userDao.findAll();
		for (User user : findAll) {
			System.out.println(user);
		}
	}
	
	
	/*@Test
	public void saveUsers(){
		List<User> users=new ArrayList<>();
		users.add(new User("王八01","123",new Date(),1,"13011110"));
		users.add(new User("王八02","123",new Date(),1,"13011110"));
		users.add(new User("王八03","123",new Date(),1,"13011110"));
		userDao.saveUsers(users);
	}*/
	/*@Test
	public void findPaged(){
		List<User> findPaged = userDao.findPaged(0, 4);
		for (User user : findPaged) {
			System.out.println(user);
		}
	}*/
	/*@Test
	public void findByActNo(){
		User user = userDao.findByUserName("admin");
			System.out.println(user);
	}*/
	/*@Test
	public void findById(){
		User user = userDao.findById(2);
			System.out.println(user);
	}*/
	@Test
	public void saveOrupdate(){
		User user = new User("王八","123",new Date(),1,"13011110");
		user.setId(5);
		userDao.saveOrUpdate(user);
	}
	/*@Test
	public void testDelete(){
		userDao.delete(8);
	}
	*/
}
