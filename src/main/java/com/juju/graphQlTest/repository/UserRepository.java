package com.juju.graphQlTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juju.graphQlTest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
