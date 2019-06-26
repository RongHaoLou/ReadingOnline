package service.prototype;

import java.util.List;

import entity.Author;
import entity.Book;
import entity.ShoppingCart;

public interface IShoppingCartService {
	void saveOrUpdate(ShoppingCart shoppingCart);
	List<Book> findByUserId(int userId);
	Author findByAuthorId(int authorId);
	void delete(int bookId,int userId);
	ShoppingCart findIsContain(int bookId,int userId);
}
