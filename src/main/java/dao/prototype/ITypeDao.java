package dao.prototype;

import java.sql.Connection;
import java.util.List;



import entity.Type;

public interface ITypeDao {

	void saveOrUpdate(Type type);
	void delete(int id);
	void saveTypes(List<Type> acts);
	Type findById(int id);
	Type findByTypeName(String typeName);
	List<Type> findAll();
	List<Type> findPaged(int offset,int pageSize);
}
