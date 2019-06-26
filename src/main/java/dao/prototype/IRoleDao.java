package dao.prototype;

import java.util.List;

import entity.Role;

public interface IRoleDao {
	void saveOrUpdate(Role role);
	void delete(int id);
	Role findById(int id);
	Role findByName(String roleName);
	List<Role> findAll();
}
