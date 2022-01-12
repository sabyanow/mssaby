package com.edu.skeleton.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.skeleton.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
//	List<User> findByNameContaining(String name);

}
