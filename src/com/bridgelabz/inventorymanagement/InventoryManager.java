package com.bridgelabz.inventorymanagement;

import com.bridgelabz.datastructures.LinkedList;
import com.bridgelabz.datastructures.Node;

public class InventoryManager {

	LinkedList<Inventory> myInventory;

	public void addInventory() {
		InventoryFactory inventoryFactory = new InventoryFactory();
		this.myInventory = inventoryFactory.getInventory();
	}

	public void calculateValue() {
		
		Node<Inventory> tempNode = (Node<Inventory>) myInventory.head;
		while (tempNode != null) {
			Inventory current = tempNode.getKey();
			double value = (current.getPrice() * current.getWeight());
			System.out.println("Total value for inventory " + current.getName() + " is: " + value);
			tempNode = (Node<Inventory>) tempNode.getNext();
		}
	}
}
