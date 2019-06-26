package dao.prototype;

import java.util.List;
import entity.ShoppingCart;

public interface IShoppingCartDao {
	
	void saveOrUpdate(ShoppingCart shoppingCart);
	void delete(int id);
	void delete(int bookId,int userId);
	void saveShoppingCarts(List<ShoppingCart> acts);
	ShoppingCart findById(int id);
	ShoppingCart findByBookId(int bookId);
	ShoppingCart findIsContain(int bookId,int userId);
	List<ShoppingCart> findByUserId(int userId);
	List<ShoppingCart> findAll();
	List<ShoppingCart> findPaged(int offset,int pageSize);
}
