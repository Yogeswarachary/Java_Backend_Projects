package com.role_based_login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.role_based_login.entites.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByUserName(String userName);

}
