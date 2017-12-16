package xyz.sluggard.thingshub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import xyz.sluggard.thingshub.entity.User;
import xyz.sluggard.thingshub.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("{id}")
	@ResponseBody
	public User getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}
	
}
