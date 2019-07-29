package com.juju.graphQlTest.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.juju.graphQlTest.model.User;
import com.juju.graphQlTest.service.UserService;

@Component
public class UserMutationResolver implements GraphQLMutationResolver{

	@Autowired
	UserService userService;
	
	//createUser(username: String!, departmentname: String!): User	
	public User createUser(String username, String departmentname) {
		return userService.createUser(username, departmentname);
	}
}
