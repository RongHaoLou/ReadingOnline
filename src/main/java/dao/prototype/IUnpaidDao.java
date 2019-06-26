package dao.prototype;

import java.sql.Connection;
import java.util.List;



import entity.Unpaid;

public interface IUnpaidDao {

	void saveOrUpdate(Unpaid unpaid);
	void delete(int id);
	void saveUnpaids(List<Unpaid> acts);
	List<Unpaid> findById(int id);
	List<Unpaid> findAll();
	List<Unpaid> findPaged(int offset,int pageSize);
}
