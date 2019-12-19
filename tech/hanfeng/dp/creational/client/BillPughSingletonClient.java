package tech.hanfeng.dp.creational.client;

import tech.hanfeng.dp.creational.singleton.BillPughSingleton;

public class BillPughSingletonClient {
	
	/*
	 * @output 
	 * 
	 * Before getting the instance: 5
	 * Singleton created!
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Before getting the instance: " + BillPughSingleton.NUM);
		BillPughSingleton singleton = BillPughSingleton.getInstance();
	}
}
