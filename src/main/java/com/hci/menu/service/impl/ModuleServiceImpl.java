package com.hci.menu.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hci.menu.model.ModuleEntity;
import com.hci.menu.model.UserEntity;
import com.hci.menu.model.UserTypeDetEntity;
import com.hci.menu.model.UserTypeEntity;
import com.hci.menu.repo.ModuleRepo;
import com.hci.menu.repo.UserRepo;
import com.hci.menu.repo.UserTypeDetRepo;
import com.hci.menu.repo.UserTypeRepo;
import com.hci.menu.service.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService{
	@Autowired
	public UserRepo userRepo;
	
	@Autowired
	public UserTypeRepo userTypeRepo;
	
	@Autowired
	public ModuleRepo moduleRepo;
	
	@Autowired
	public UserTypeDetRepo userTypeDetRepo;
	@Override
	public List<Map<String,Object>> getModuleByUser(Long userId) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> moduleResultList = new ArrayList<Map<String,Object>>(); 
		try {
			UserEntity userData =userRepo.findByUserId(userId);
			UserTypeEntity userTypeData = userTypeRepo.findByUserTypeCode(userData.getUserCode());
			List<UserTypeDetEntity> userTypeDetData = userTypeDetRepo.findByUserTypeId(userTypeData.getUserTypeId());
			List<ModuleEntity> module = moduleRepo.findAll(); 
			
			for (int i = 0; i < userTypeDetData.size(); i++) {
				for (int j = 0; j < module.size(); j++) {
					if (userTypeDetData.get(i).getModuleId().toString().equals(module.get(j).getModuleId().toString())) {
						HashMap<String, Object> moduleResult = new HashMap<String, Object>();
						moduleResult.put("moduleOrder", userTypeDetData.get(i).getModuleOrder());
						moduleResult.put("moduleName", module.get(j).getModuleName());
						moduleResultList.add(moduleResult);
					}
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error : "+e);
		}
		
		return moduleResultList;
	}

}
