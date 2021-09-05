package com.bridgelabz.inventorymanagement;

import com.bridgelabz.datastructures.LinkedList;

public class InventoryManager {

	LinkedList<Inventory> myInventory;
	
	public LinkedList<Inventory> addInventory() {
		InventoryFactory inventoryFactory = new InventoryFactory();
		this.myInventory = inventoryFactory.getInventory();
		return myInventory;
	}
}
