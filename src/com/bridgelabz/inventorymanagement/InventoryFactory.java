package com.bridgelabz.inventorymanagement;

import java.util.Scanner;

import com.bridgelabz.datastructures.LinkedList;
import com.bridgelabz.datastructures.Node;

public class InventoryFactory {
	
	LinkedList<Inventory> myInventory = new LinkedList<Inventory>();

	public LinkedList<Inventory> getInventory() {
		System.out.println("Enter total number of inventories: ");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();

		for (int index = 0; index < count; index++) {
			System.out.print("Enter the name of Inventory: ");
			String name = scanner.next();
			System.out.print("Enter weight in kg: ");
			double weight = scanner.nextDouble();
			System.out.print("Enter the price per kg: ");
			double price = scanner.nextDouble();
			Inventory newInventory = new Inventory();
			newInventory.setName(name);
			newInventory.setWeight(weight);
			newInventory.setPrice(price);
			Node<Inventory> myStockNode = new Node<Inventory>(newInventory);
			myInventory.appendNode(myStockNode);
		}
		scanner.close();
		return myInventory;
	}
}