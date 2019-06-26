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
import dao.prototype.ITypeDao;
import entity.Type;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestType {

	@Autowired
	private ITypeDao typeDao;
	
	/*@Test
	public void testFindAll(){
		List<Type> findAll = typeDao.findAll();
		for (Type type : findAll) {
			System.out.println(type);
		}
	}*/
	
	
	/*@Test
	public void saveTypes(){
		List<Type> types=new ArrayList<>();
		types.add(new Type("aa",8));
		types.add(new Type("aaa",8));
		typeDao.saveTypes(types);
	}*/
	/*@Test
	public void findPaged(){
		List<Type> findPaged = typeDao.findPaged(0, 4);
		for (Type type : findPaged) {
			System.out.println(type);
		}
	}*/
	/*@Test
	public void findByActNo(){
		Type type = typeDao.findByTypeName("aa");
			System.out.println(type);
	}*/
	/*@Test
	public void findById(){
		Type type = typeDao.findById(2);
			System.out.println(type);
	}*/
/*	@Test
	public void saveOrupdate(){
		Type type = new Type("dd",11);
		type.setId(20);
		typeDao.saveOrUpdate(type);
	}*/
	@Test
	public void testDelete(){
		typeDao.delete(17);
		typeDao.delete(18);
		typeDao.delete(19);
		typeDao.delete(20);
	}
	
}
