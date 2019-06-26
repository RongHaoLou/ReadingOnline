package dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import dao.prototype.IShoppingCartDao;
import entity.Comment;
import entity.ShoppingCart;

@Repository
public class ShoppingCartDaoSpringImpl implements IShoppingCartDao {

	
	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public void saveOrUpdate(ShoppingCart shoppingCart) {
		int id = shoppingCart.getId();
		String sql=null;
		if(id==0){
			sql="insert into t_shopping_cart(user_id,book_id)" 
					+"values(?,?)";
			jt.update(sql,new Object[]{shoppingCart.getUserId(),shoppingCart.getBook_id()});
		}else{
			sql="update t_shopping_cart set user_id=?,book_id=? where id=?";
			jt.update(sql,new Object[]{shoppingCart.getUserId(),shoppingCart.getBook_id(),shoppingCart.getId()});
		}
		
	}


	@Override
	public void delete(int id) {
		jt.update("delete from t_shopping_cart where id=?",new Object[]{id});
		
	}

	@Override
	public void saveShoppingCarts(List<ShoppingCart> shoppingCarts) {
		String sql="insert into t_shopping_cart(user_id,book_id)" 
				+"values(?,?)";
		List<Object[]>params=new ArrayList<Object[]>();
		for (ShoppingCart shoppingCart : shoppingCarts) {
			Object[] o=new Object[2];
			o[0]=shoppingCart.getUserId();
			o[1]=shoppingCart.getBook_id();
			params.add(o);
		}
		jt.batchUpdate(sql, params);
		
	}



	@Override
	public ShoppingCart findById(int id) {
		return jt.queryForObject("select * from t_shopping_cart where id=?",
				new Object[]{id},
				new BeanPropertyRowMapper<ShoppingCart>(ShoppingCart.class));
	}


	@Override
	public List<ShoppingCart> findAll() {
		return jt.query("select * from t_shopping_cart", 
				new BeanPropertyRowMapper<ShoppingCart>(ShoppingCart.class));
	}

	@Override
	public List<ShoppingCart> findPaged(int offset, int pageSize) {
		return jt.query("select * from t_shopping_cart limit ?,?"
				,new Object[]{offset,pageSize},
				new BeanPropertyRowMapper<ShoppingCart>(ShoppingCart.class));
	}
	
	public int totalPages(int pageSize){
		
		return 0;
		
	}


	@Override
	public List<ShoppingCart> findByUserId(int userId) {
		String sql="select * from t_shopping_cart where user_id=?";
		RowMapper<ShoppingCart> rowMapper=new BeanPropertyRowMapper<ShoppingCart>(ShoppingCart.class);
		return jt.query(sql, new Object[]{userId}, rowMapper);
	}


	@Override
	public void delete(int bookId, int userId) {
		jt.update("delete from t_shopping_cart where book_id=? and user_id=?",new Object[]{bookId,userId});
	}
	@Override
	public ShoppingCart findByBookId(int bookId) {
		try {
			return jt.queryForObject("select * from t_shopping_cart where book_id=?",
					new Object[]{bookId},
					new BeanPropertyRowMapper<ShoppingCart>(ShoppingCart.class));
		} catch (DataAccessException e) {
			return null;
		}
	}


	@Override
	public ShoppingCart findIsContain(int bookId, int userId) {
		try {
			return jt.queryForObject("select * from t_shopping_cart where book_id=? and user_id=?;",
					new Object[]{bookId,userId},
					new BeanPropertyRowMapper<ShoppingCart>(ShoppingCart.class));
		} catch (DataAccessException e) {
			return null;
		}
	}
}
