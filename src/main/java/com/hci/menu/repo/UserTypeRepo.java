package com.hci.menu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hci.menu.model.UserTypeEntity;

@Repository("UserTypeRepo")
public interface UserTypeRepo extends JpaRepository<UserTypeEntity, String>{
	UserTypeEntity findByUserTypeCode(String userTypeCode);
}
