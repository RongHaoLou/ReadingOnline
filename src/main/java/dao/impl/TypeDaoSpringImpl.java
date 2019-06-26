package dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.ITypeDao;
import entity.Type;

@Repository
public class TypeDaoSpringImpl implements ITypeDao {

	
	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public void saveOrUpdate(Type type) {
		int id = type.getId();
		String sql=null;
		if(id==0){
			sql="insert into t_type(type_name,types_id)" 
					+"values(?,?)";
			jt.update(sql,new Object[]{type.getTypeName(),type.getTypesId()});
		}else{
			sql="update t_type set type_name=?,types_id=? where id=?";
			jt.update(sql,new Object[]{type.getTypeName(),type.getTypesId(),type.getId()});
		}
		
	}


	@Override
	public void delete(int id) {
		jt.update("delete from t_type where id=?",new Object[]{id});
		
	}




	@Override
	public void saveTypes(List<Type> types) {
		String sql="insert into t_type(type_name,types_id)" 
				+"values(?,?)";
		List<Object[]>params=new ArrayList<Object[]>();
		for (Type type : types) {
			Object[] o=new Object[2];
			o[0]=type.getTypeName();
			o[1]=type.getTypesId();
			params.add(o);
		}
		jt.batchUpdate(sql, params);
		
	}



	@Override
	public Type findById(int id) {
		return jt.queryForObject("select * from t_type where id=?",
				new Object[]{id},
				new BeanPropertyRowMapper<Type>(Type.class));
	}

	@Override
	public Type findByTypeName(String typeName) {
		return jt.queryForObject("select * from t_type where type_name=?"
				, new Object[]{typeName},
				new BeanPropertyRowMapper<Type>(Type.class));
	}

	@Override
	public List<Type> findAll() {
		return jt.query("select * from t_type", 
				new BeanPropertyRowMapper<Type>(Type.class));
	}

	@Override
	public List<Type> findPaged(int offset, int pageSize) {
		return jt.query("select * from t_type limit ?,?"
				,new Object[]{offset,pageSize},
				new BeanPropertyRowMapper<Type>(Type.class));
	}
	
	public int totalPages(int pageSize){
		
		return 0;
		
	}

}
