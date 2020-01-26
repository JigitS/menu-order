package com.hci.menu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hci.menu.model.UserTypeDetEntity;

@Repository("UserTypeDetailRepo")
public interface UserTypeDetRepo extends JpaRepository<UserTypeDetEntity, String> {
	List<UserTypeDetEntity> findByUserTypeId (Long userTypeId);
}
