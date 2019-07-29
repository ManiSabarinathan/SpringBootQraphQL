package com.juju.graphQlTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juju.graphQlTest.model.User;
import com.juju.graphQlTest.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	public User createUser(String name, String deptname) {
		User usr = new User();
		usr.setUsername(name);
		usr.setDepartmentname(deptname);
		userRepository.save(usr);
		return usr;
	}
	
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

}
