package dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.IUnpaidDao;
import entity.Unpaid;

@Repository
public class UnpaidDaoSpringImpl implements IUnpaidDao {

	
	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public void saveOrUpdate(Unpaid unpaid) {
		int id = unpaid.getId();
		String sql=null;
		if(id==0){
			sql="insert into t_unpaid(unpaid,book_id)" 
					+"values(?,?)";
			jt.update(sql,new Object[]{unpaid.getUnpaid(),unpaid.getBookId()
					});
		}else{
			sql="update t_unpaid set unpaid=?,book_id=? where id=?";
			jt.update(sql,new Object[]{unpaid.getUnpaid(),unpaid.getBookId(),unpaid.getId()});
		}
		
	}


	@Override
	public void delete(int id) {
		jt.update("delete from t_unpaid where id=?",new Object[]{id});
		
	}


	@Override
	public void saveUnpaids(List<Unpaid> unpaids) {
		String sql="insert into t_unpaid(unpaid,book_id)" 
				+"values(?,?)";
		List<Object[]>params=new ArrayList<Object[]>();
		for (Unpaid unpaid : unpaids) {
			Object[] o=new Object[2];
			o[0]=unpaid.getUnpaid();
			o[1]=unpaid.getBookId();
			params.add(o);
		}
		jt.batchUpdate(sql, params);
		
	}



	@Override
	public List<Unpaid> findById(int id) {
		return  jt.query("select * from t_unpaid where id=?",
				new Object[]{id},
				new BeanPropertyRowMapper<Unpaid>(Unpaid.class));
	}


	@Override
	public List<Unpaid> findAll() {
		return jt.query("select * from t_unpaid", 
				new BeanPropertyRowMapper<Unpaid>(Unpaid.class));
	}

	@Override
	public List<Unpaid> findPaged(int offset, int pageSize) {
		return jt.query("select * from t_unpaid limit ?,?"
				,new Object[]{offset,pageSize},
				new BeanPropertyRowMapper<Unpaid>(Unpaid.class));
	}
	
	public int totalPages(int pageSize){
		
		return 0;
		
	}

}
