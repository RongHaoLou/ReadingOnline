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
import dao.prototype.ITypesDao;
import entity.Types;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestTypes {

	@Autowired
	private ITypesDao typesDao;
	
/*	@Test
	public void testFindAll(){
		List<Types> findAll = typesDao.findAll();
		for (Types types : findAll) {
			System.out.println(types);
		}
	}*/
	
	
	@Test
	public void saveTypess(){
		List<Types> typess=new ArrayList<>();
		typess.add(new Types("aaa"));
		typess.add(new Types("bbb"));
		typesDao.saveTypess(typess);
	}
	/*@Test
	public void findPaged(){
		List<Types> findPaged = typesDao.findPaged(0, 4);
		for (Types types : findPaged) {
			System.out.println(types);
		}
	}*/
	/*@Test
	public void findByActNo(){
		Types types = typesDao.findByTypesName("admin");
			System.out.println(types);
	}*/
	/*@Test
	public void findById(){
		Types types = typesDao.findById(2);
			System.out.println(types);
	}*/
	/*@Test
	public void saveOrupdate(){
		Types types = new Types("a");
		types.setId(9);
		typesDao.saveOrUpdate(types);
	}*/
	/*@Test
	public void testDelete(){
		typesDao.delete(8);
	}
	*/
}
