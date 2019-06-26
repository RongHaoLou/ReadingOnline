package dao.prototype;

import java.sql.Connection;
import java.util.List;



import entity.User;

public interface IUserDao {

	void saveOrUpdate(User user);
	void delete(int id);
	void saveUsers(List<User> acts);
	User findById(int id);
	User findByUserName(String userName);
	List<User> findAll();
	List<User> findPaged(int offset,int pageSize);
}
