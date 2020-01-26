package com.hci.menu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hci.menu.service.ModuleService;

@RestController
@RequestMapping("/module")
public class ModuleController {
	@Autowired
	public ModuleService moduleServices;
	@RequestMapping(path="/userID/{id}",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Object> getOrderModuleById(
			@PathVariable(name="id")Long id) {
		List<Map<String, Object>> moduleResult = moduleServices.getModuleByUser(id);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("modules", moduleResult);
//		moduleResult.put("modules", value)
		return result;
			
	}
}
