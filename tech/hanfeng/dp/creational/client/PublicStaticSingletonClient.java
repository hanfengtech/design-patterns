package tech.hanfeng.dp.creational.client;

import tech.hanfeng.dp.creational.singleton.PublicStaticSingleton;

public class PublicStaticSingletonClient {
	public static void main(String[] args) {
		
		System.out.println("Before getting the instance: " + PublicStaticSingleton.NUM);
		
		PublicStaticSingleton obj1 = PublicStaticSingleton.INSTANCE;
		PublicStaticSingleton obj2 = PublicStaticSingleton.INSTANCE;
		System.out.println("Two objects are the same? " + (obj1 == obj2));
	}
}
