package dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.ITypesDao;
import entity.Types;

@Repository
public class TypesDaoSpringImpl implements ITypesDao {

	
	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public void saveOrUpdate(Types types) {
		int id = types.getId();
		String sql=null;
		if(id==0){
			sql="insert into t_types(types_name)" 
					+"values(?)";
			jt.update(sql,new Object[]{types.getTypesName()});
		}else{
			sql="update t_types set types_name=? where id=?";
			jt.update(sql,new Object[]{types.getTypesName(),types.getId()});
		}
		
	}


	@Override
	public void delete(int id) {
		jt.update("delete from t_types where id=?",new Object[]{id});
		
	}




	@Override
	public void saveTypess(List<Types> typess) {
		String sql="insert into t_types(types_name)" 
				+"values(?)";
		List<Object[]>params=new ArrayList<Object[]>();
		for (Types types : typess) {
			Object[] o=new Object[1];
			o[0]=types.getTypesName();
			
			params.add(o);
		}
		jt.batchUpdate(sql, params);
		
	}



	@Override
	public Types findById(int id) {
		return jt.queryForObject("select * from t_types where id=?",
				new Object[]{id},
				new BeanPropertyRowMapper<Types>(Types.class));
	}

	@Override
	public Types findByTypesName(String typesName) {
		return jt.queryForObject("select * from t_types where types_name=?"
				, new Object[]{typesName},
				new BeanPropertyRowMapper<Types>(Types.class));
	}

	@Override
	public List<Types> findAll() {
		return jt.query("select * from t_types", 
				new BeanPropertyRowMapper<Types>(Types.class));
	}

	@Override
	public List<Types> findPaged(int offset, int pageSize) {
		return jt.query("select * from t_types limit ?,?"
				,new Object[]{offset,pageSize},
				new BeanPropertyRowMapper<Types>(Types.class));
	}
	
	public int totalPages(int pageSize){
		
		return 0;
		
	}

}
