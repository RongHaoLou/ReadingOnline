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
import dao.prototype.IShoppingCartDao;
import entity.ShoppingCart;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class TestShoppingCart {

	@Autowired
	private IShoppingCartDao shoppingCartDao;
	
	/*@Test
	public void testFindAll(){
		List<ShoppingCart> findAll = shoppingCartDao.findAll();
		for (ShoppingCart shoppingCart : findAll) {
			System.out.println(shoppingCart);
		}
	}*/
	
	
/*	@Test
	public void saveShoppingCarts(){
		List<ShoppingCart> shoppingCarts=new ArrayList<>();
		shoppingCarts.add(new ShoppingCart(8,9));
		shoppingCarts.add(new ShoppingCart(8,10));
		
		shoppingCartDao.saveShoppingCarts(shoppingCarts);
	}*/
	/*@Test
	public void findPaged(){
		List<ShoppingCart> findPaged = shoppingCartDao.findPaged(0, 2);
		for (ShoppingCart shoppingCart : findPaged) {
			System.out.println(shoppingCart);
		}
	}*/
	
	/*@Test
	public void findById(){
		ShoppingCart shoppingCart = shoppingCartDao.findById(2);
			System.out.println(shoppingCart);
	}*/
/*	@Test
	public void saveOrupdate(){
		ShoppingCart shoppingCart = new ShoppingCart(999,1555);
		shoppingCart.setId(8);
		shoppingCartDao.saveOrUpdate(shoppingCart);
	}*/
	@Test
	public void testDelete(){
//		shoppingCartDao.delete(8);
//		ShoppingCart findByBookId = shoppingCartDao.findByBookId(4);
		shoppingCartDao.saveOrUpdate(new ShoppingCart(1,4));
		
	}
	
}
