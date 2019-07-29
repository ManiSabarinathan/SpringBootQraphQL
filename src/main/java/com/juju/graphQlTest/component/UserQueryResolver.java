package com.juju.graphQlTest.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.juju.graphQlTest.model.User;
import com.juju.graphQlTest.repository.UserRepository;
import com.juju.graphQlTest.service.UserService;

@Component
public class UserQueryResolver implements GraphQLQueryResolver  {

	@Autowired
	UserService userService;
	
	//users : [User]
	public List<User> users() {
		return userService.findAllUsers();
	}
	
}
