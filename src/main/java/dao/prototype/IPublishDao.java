package dao.prototype;

import java.util.List;

import entity.Publish;

public interface IPublishDao {
	void saveOrUpdate(Publish publish);
	void delete(int id);
	Publish findById(int id);
	Publish findByName(String publishName);
	List<Publish> findAll();
}
