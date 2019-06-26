package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.IUserDao;
import entity.User;
import exception.ZEException;
import service.prototype.IUserService;

@Service
public class UserServiceDaoImpl implements IUserService{
	
	@Autowired
	IUserDao userDao;

	@Override
	public User login(String username, String password) {
		
		User user = userDao.findByUserName(username);
		
		if(user == null)
		{
			throw new ZEException("用户名不存在!");
		}
		
		if(!password.equals(user.getPassword()))
		{
			throw new ZEException("密码错误!");
		}
		
		return user;	
	}

	@Override
	public void register(String username) {
		
		User user = userDao.findByUserName(username);
		if(user != null){
			throw new ZEException("用户名已存在!");
		}
		
	}
	
}
