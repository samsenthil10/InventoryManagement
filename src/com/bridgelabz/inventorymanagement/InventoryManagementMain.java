package com.bridgelabz.inventorymanagement;

import com.bridgelabz.datastructures.LinkedList;

public class InventoryManagementMain {
	
	public static void main(String[] args) {
		
		InventoryManagerIF inventoryInterfaceManager = new InventoryManagerImpl(); 
		System.out.println("----------Welcome to Inventory Data Management----------");
		InventoryManager inventoryManager = new InventoryManager();
		LinkedList<Inventory> myInventory = inventoryManager.addInventory();
		inventoryInterfaceManager.calculateValue(myInventory);
	}
}
