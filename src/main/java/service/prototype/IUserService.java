package service.prototype;

import entity.User;

public interface IUserService {
	User login(String username, String password);
	void register(String username);
}
