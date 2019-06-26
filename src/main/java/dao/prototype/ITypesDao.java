package dao.prototype;

import java.sql.Connection;
import java.util.List;



import entity.Types;

public interface ITypesDao {

	void saveOrUpdate(Types types);
	void delete(int id);
	void saveTypess(List<Types> acts);
	Types findById(int id);
	Types findByTypesName(String typesName);
	List<Types> findAll();
	List<Types> findPaged(int offset,int pageSize);
}
