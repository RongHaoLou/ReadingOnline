package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.IUserDao;
import entity.User;
import util.JdbcUtil;

@Repository
public class UserDaoSpringImpl implements IUserDao {

	
	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public void saveOrUpdate(User user) {
		int id = user.getId();
		String sql=null;
		if(id==0){
			sql="insert into t_user(user_name,password,createDate,phoneNumber,role_id)" 
					+"values(?,?,?,?,?)";
			jt.update(sql,new Object[]{user.getUserName(),user.getPassword(),
					user.getCreateDate(),user.getPhoneNumber(),
					user.getRoleId()});
		}else{
			sql="update t_user set user_name=?,password=?,createDate=?"
					+ ",phoneNumber=?,role_id=? where id=?";
			jt.update(sql,new Object[]{user.getUserName(),user.getPassword(),
					user.getCreateDate(),user.getPhoneNumber(),user.getRoleId(),user.getId()});
		}
		
	}


	@Override
	public void delete(int id) {
		jt.update("delete from t_user where id=?",new Object[]{id});
		
	}




	@Override
	public void saveUsers(List<User> users) {
		String sql="insert into t_user(user_name,password,createDate,phoneNumber,role_id)" 
				+"values(?,?,?,?,?)";
		List<Object[]>params=new ArrayList<Object[]>();
		for (User user : users) {
			Object[] o=new Object[5];
			o[0]=user.getUserName();
			o[1]=user.getPassword();
			o[2]=user.getCreateDate();
			o[3]=user.getPhoneNumber();
			o[4]=user.getRoleId();
			params.add(o);
		}
		jt.batchUpdate(sql, params);
		
	}



	@Override
	public User findById(int id) {
		return jt.queryForObject("select * from t_user where id=?",
				new Object[]{id},
				new BeanPropertyRowMapper<User>(User.class));
	}

	@Override
	public User findByUserName(String userName) {
//		return jt.queryForObject("select * from t_user where user_name=?"
//				, new Object[]{userName},
//				new BeanPropertyRowMapper<User>(User.class));
		User user = null;

		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;

		try {
			conn = (Connection) JdbcUtil.getConnection();
			stat = conn.createStatement();
			String sql = "select * from t_user where user_name='" +userName +"'";
			rs = stat.executeQuery(sql);
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("user_name"));
				user.setPassword(rs.getString("password"));
				user.setCreateDate(rs.getDate("createDate"));
				user.setPhoneNumber(rs.getString("phoneNumber"));
				user.setRoleId(rs.getInt("role_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, stat, conn);
		}

		return user;

	}

	@Override
	public List<User> findAll() {
		return jt.query("select * from t_user", 
				new BeanPropertyRowMapper<User>(User.class));
	}

	@Override
	public List<User> findPaged(int offset, int pageSize) {
		return jt.query("select * from t_user limit ?,?"
				,new Object[]{offset,pageSize},
				new BeanPropertyRowMapper<User>(User.class));
	}
	
	public int totalPages(int pageSize){
		
		return 0;
		
	}

}
