package com.hci.menu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hci.menu.model.ModuleEntity;

@Repository("ModuleRepo")
public interface ModuleRepo extends JpaRepository<ModuleEntity, String> {
	
}
