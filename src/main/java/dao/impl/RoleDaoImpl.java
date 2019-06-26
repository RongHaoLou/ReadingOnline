package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import dao.prototype.IRoleDao;
import entity.Role;
@Repository
public class RoleDaoImpl implements IRoleDao{
	@Autowired
	private JdbcTemplate jt;
	@Override
	public void saveOrUpdate(Role role) {
		if(role.getId()==0){
			String sql="insert into t_role(role_name) values(?);";
			jt.update(sql,new Object[]{role.getRoleName()});
		}else{
			String sql="update t_role set role_name=? where id=?;";
			jt.update(sql,new Object[]{role.getRoleName(),role.getId()});
		}
	}

	@Override
	public void delete(int id) {
		jt.update("delete from t_role where id=?;",id);
	}

	@Override
	public Role findById(int id) {
		String sql="select * from t_role where id=?;";
		RowMapper<Role> rowMapper=new BeanPropertyRowMapper<Role>(Role.class);
		return jt.queryForObject(sql, rowMapper,id);
	}

	@Override
	public Role findByName(String roleName) {
		String sql="select * from t_role where role_name=?;";
		RowMapper<Role> rowMapper=new BeanPropertyRowMapper<Role>(Role.class);
		return jt.queryForObject(sql, rowMapper,roleName);
	}

	@Override
	public List<Role> findAll() {
		RowMapper<Role> rowMapper=new BeanPropertyRowMapper<Role>(Role.class);
		return jt.query("select * from t_role", rowMapper);
	}

}
