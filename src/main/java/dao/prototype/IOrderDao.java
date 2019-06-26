package dao.prototype;

import java.util.List;

import entity.Order;

public interface IOrderDao {
	void saveOrUpdate(Order order);
	void delete(int id);
	Order findById(int id);
	//根据用户id查找出他的所有订单
	Order findByUserId(int userId);
	List<Order> findAll();
}
