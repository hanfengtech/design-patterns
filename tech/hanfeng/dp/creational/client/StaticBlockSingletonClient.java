package tech.hanfeng.dp.creational.client;

import tech.hanfeng.dp.creational.singleton.StaticBlockSingleton;

public class StaticBlockSingletonClient {
	
	/*
	 * @output
	 * 
	 * Singleton created!
	 * Before getting the instance: 5
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Before getting the instance: " + StaticBlockSingleton.NUM);
		StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
	}
}
