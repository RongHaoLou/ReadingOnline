package dao.prototype;

import java.util.List;

import entity.Author;

public interface IAuthorDao {
	void saveOrUpdate(Author author);
	void delete(int id);
	Author findById(int id);
	Author findByName(String authorName);
	List<Author> findAll();
}
