package com.acn.powerrangers.dayiversary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acn.powerrangers.dayiversary.models.User;

@RestController
public class UserController {
	private List<User> userList = new ArrayList<>();
	
	@GetMapping("/users")
	// @RequestMapping(method = RequestMethod.GET, path = "/users")
	public List<User> readUsers(){
		return userList;
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		user.setId(userList.size()+1L);
		userList.add(user);
		return user;
	}
}
