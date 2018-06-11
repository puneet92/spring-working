package com.websystique.springmvc.service;

import java.util.List;


import com.websystique.springmvc.model.InventorySave;
import com.websystique.springmvc.model.UomMaster;

public interface InventoryService {
	void saveInventory(InventorySave inventorysave);
	List<UomMaster> findAllItems();

}
