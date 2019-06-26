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
import dao.prototype.IUnpaidDao;
import entity.Unpaid;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestUnpaid {

	@Autowired
	private IUnpaidDao unpaidDao;
	
	/*@Test
	public void testFindAll(){
		List<Unpaid> findAll = unpaidDao.findAll();
		for (Unpaid unpaid : findAll) {
			System.out.println(unpaid);
		}
	}*/
	
	
	@Test
	public void saveUnpaids(){
		List<Unpaid> unpaids=new ArrayList<>();
		unpaids.add(new Unpaid(8,9));
		unpaids.add(new Unpaid(88,99));
		unpaidDao.saveUnpaids(unpaids);
	}
	/*@Test
	public void findPaged(){
		List<Unpaid> findPaged = unpaidDao.findPaged(0, 4);
		for (Unpaid unpaid : findPaged) {
			System.out.println(unpaid);
		}
	}*/
	
/*	@Test
	public void findById(){
		 List<Unpaid> unpaids = unpaidDao.findById(2);
			for (Unpaid unpaid : unpaids) {
				System.out.println(unpaid);
			}
	}*/
	/*@Test
	public void saveOrupdate(){
		Unpaid unpaid = new Unpaid(31,2);
		unpaid.setId(5);
		unpaidDao.saveOrUpdate(unpaid);
	}*/
	/*@Test
	public void testDelete(){
		unpaidDao.delete(2);
	}
	*/
}
