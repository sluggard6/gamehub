package xyz.sluggard.thingshub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import xyz.sluggard.thingshub.dao.UserDao;
import xyz.sluggard.thingshub.entity.User;
import xyz.sluggard.thingshub.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User login(User user) {
		return null;
	}

	@Override
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

}
