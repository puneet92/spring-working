package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.InventoryDao;
import com.websystique.springmvc.model.Employee;
import com.websystique.springmvc.model.InventorySave;
import com.websystique.springmvc.model.UomMaster;

@Service("inventoryService")
@Transactional
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	private InventoryDao dao;
	
	public void saveInventory(InventorySave inventorysave) {
		dao.saveInventory(inventorysave);
	}
	public List<UomMaster> findAllItems() {
		return dao.findAllItems();
	}
	
}
