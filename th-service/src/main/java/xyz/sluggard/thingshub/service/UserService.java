package xyz.sluggard.thingshub.service;

import xyz.sluggard.thingshub.entity.User;

public interface UserService {
	
	User login(User user);
	
	User getUserById(Integer id);

}
