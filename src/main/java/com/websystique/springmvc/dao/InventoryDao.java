package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.Employee;
import com.websystique.springmvc.model.InventorySave;
import com.websystique.springmvc.model.UomMaster;

public interface InventoryDao {
	
public 	void saveInventory(InventorySave inventorysave);
List<UomMaster> findAllItems();

}
