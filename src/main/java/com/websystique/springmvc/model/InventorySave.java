package com.websystique.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="saveinventory")
public class InventorySave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "from_inventory")
	private int fromInventory;
	@Column(name = "to_inventory")
	private int toInventory;
	@Column(name = "item_code")
	private String itemCode;
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public int getFromInventory() {
		return fromInventory;
	}
	public void setFromInventory(int fromInventory) {
		this.fromInventory = fromInventory;
	}
	public int getToInventory() {
		return toInventory;
	}
	public void setToInventory(int toInventory) {
		this.toInventory = toInventory;
	}
	//private int toInventory;
	
	

}
