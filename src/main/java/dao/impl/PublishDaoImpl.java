package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import dao.prototype.IPublishDao;
import entity.Publish;
@Repository
public class PublishDaoImpl implements IPublishDao{
	@Autowired
	private JdbcTemplate jt;
	@Override
	public void saveOrUpdate(Publish publish) {
		if(publish.getId()==0){
			String sql="insert into t_publish(publish_name,"
					+ "publish_ISBN,copyright) values(?,?,?);";
			jt.update(sql,new Object[]{publish.getPublishName(),publish.getpublishNumber(),publish.getCopyright()});
		}else{
			String sql="update t_publish set publish_name=?,publish_ISBN=?,copyright=? where id=?;";
			jt.update(sql,new Object[]{publish.getPublishName(),publish.getpublishNumber(),publish.getCopyright(),publish.getId()});
		}
	}

	@Override
	public void delete(int id) {
		jt.update("delete from t_publish where id=?;",id);
	}

	@Override
	public Publish findById(int id) {
		String sql="select * from t_publish where id=?;";
		RowMapper<Publish> rowMapper=new BeanPropertyRowMapper<Publish>(Publish.class);
		return jt.queryForObject(sql, rowMapper,id);
	}

	@Override
	public Publish findByName(String publishName) {
		String sql="select * from t_publish where publish_name=?;";
		RowMapper<Publish> rowMapper=new BeanPropertyRowMapper<Publish>(Publish.class);
		return jt.queryForObject(sql, rowMapper,publishName);
	}

	@Override
	public List<Publish> findAll() {
		RowMapper<Publish> rowMapper=new BeanPropertyRowMapper<Publish>(Publish.class);
		return jt.query("select * from t_publish", rowMapper);
	}

}
