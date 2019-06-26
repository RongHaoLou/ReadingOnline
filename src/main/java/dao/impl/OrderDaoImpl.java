package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import dao.prototype.IOrderDao;
import entity.Order;
@Repository
public class OrderDaoImpl implements IOrderDao{
	@Autowired
	private JdbcTemplate jt;
	@Override
	public void saveOrUpdate(Order order) {
		if(order.getId()==0){
			String sql="insert into t_order(order_number,buy_time,"
					+ "book_id,user_id) values(?,?,?,?);";
			jt.update(sql,new Object[]{order.getOrderNumber(),order.getBuyTime(),order.getBookId(),order.getUserId()});
		}else{
			String sql="update t_order set order_number=?,buy_time=?,book_id=?,user_id=? where id=?;";
			jt.update(sql,new Object[]{order.getOrderNumber(),order.getBuyTime(),order.getBookId(),order.getUserId(),order.getId()});
		}
	}

	@Override
	public void delete(int id) {
		jt.update("delete from t_order where id=?;",id);
	}

	@Override
	public Order findById(int id) {
		String sql="select * from t_order where id=?;";
		RowMapper<Order> rowMapper=new BeanPropertyRowMapper<Order>(Order.class);
		return jt.queryForObject(sql, rowMapper,id);
	}

	@Override
	public Order findByUserId(int userId) {
		String sql="select * from t_order where user_id=?;";
		RowMapper<Order> rowMapper=new BeanPropertyRowMapper<Order>(Order.class);
		return jt.queryForObject(sql, rowMapper,userId);
	}

	@Override
	public List<Order> findAll() {
		RowMapper<Order> rowMapper=new BeanPropertyRowMapper<Order>(Order.class);
		return jt.query("select * from t_order", rowMapper);
	}

}
