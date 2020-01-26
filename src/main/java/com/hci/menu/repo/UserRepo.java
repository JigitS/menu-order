package com.hci.menu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hci.menu.model.UserEntity;

@Repository("UserRepo")
public interface UserRepo extends JpaRepository<UserEntity, String>{
	UserEntity findByUserId(Long userId);
}
