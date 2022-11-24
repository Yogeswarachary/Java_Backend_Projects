package com.role_based_login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.role_based_login.entites.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

	Optional<Post> findById(int postId);

}
