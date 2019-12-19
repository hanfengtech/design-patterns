package tech.hanfeng.dp.creational.client;

import tech.hanfeng.dp.creational.singleton.Singleton;

public class SingletonClient {

	/*
	 * @output
	 * 
	 * Two objects are the same? true
	 * 
	 * java.lang.CloneNotSupportedException
	 * 	at tech.hanfeng.dp.creational.singleton.Singleton.clone(Singleton.java:26)
	 * 	at tech.hanfeng.dp.creational.client.SingletonClient.main(SingletonClient.java:19)
	 */
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println("Two objects are the same? " + (obj1 == obj2));
		
		try {
			Singleton obj3 = (Singleton) obj1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
