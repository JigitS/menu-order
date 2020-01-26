package com.hci.menu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ModuleService {
	public List<Map<String,Object>> getModuleByUser(Long userId);
}
