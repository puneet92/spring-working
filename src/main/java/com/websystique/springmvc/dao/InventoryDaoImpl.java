package com.websystique.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Employee;
import com.websystique.springmvc.model.InventorySave;
import com.websystique.springmvc.model.UomMaster;
@Repository("inventoryDao")
public class InventoryDaoImpl extends AbstractDao<Integer, InventorySave> implements InventoryDao  {
	
	
	
	public void saveInventory(InventorySave inventorysave) {
		persist1(inventorysave);
	}
	@SuppressWarnings("unchecked")
	public List<UomMaster> findAllItems() {
		Criteria criteria = createEntityCriteria();
		return (List<UomMaster>) criteria.list();
	}
}
