package reading;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.TestConfig;
import dao.prototype.IOrderDao;
import entity.Order;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestOrder {
	@Autowired
	private IOrderDao orderDao;
	@Test
	public void SaveOrUpdate(){
		Order order = new Order("111",new Date(),2,2);
		order.setId(1);
		orderDao.saveOrUpdate(order);
	}
	@Test
	public void delete(){
		orderDao.delete(1);
	}
	@Test
	public void queryAll(){
		List<Order> list = orderDao.findAll();
		for (Order order : list) {
			System.out.println(order);
		}
	}
	@Test
	public void queryById(){
		Order order2 = orderDao.findById(1);
		System.out.println(order2);
	}
	@Test
	public void queryByName(){
		Order order2 = orderDao.findByUserId(2);
		System.out.println(order2);
	}
	
}
