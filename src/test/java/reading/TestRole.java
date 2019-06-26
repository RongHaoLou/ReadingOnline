package reading;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import dao.prototype.IRoleDao;
import entity.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestRole {
	@Autowired
	private IRoleDao roleDao;
	@Test
	public void SaveOrUpdate(){
		Role role = new Role("admin");
		role.setId(3);
		roleDao.saveOrUpdate(role);
	}
	@Test
	public void delete(){
		roleDao.delete(3);
	}
	@Test
	public void queryAll(){
		List<Role> list = roleDao.findAll();
		for (Role role : list) {
			System.out.println(role);
		}
	}
	@Test
	public void queryById(){
		Role role2 = roleDao.findById(2);
		System.out.println(role2);
	}
	@Test
	public void queryByName(){
		Role role2 = roleDao.findByName("admin");
		System.out.println(role2);
	}
	
}
