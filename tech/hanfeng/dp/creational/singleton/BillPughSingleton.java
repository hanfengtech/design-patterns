package tech.hanfeng.dp.creational.singleton;

public class BillPughSingleton {
	
    public static int NUM = 5;
    private BillPughSingleton() {
    	System.out.println("Singleton created!");
    }
 
    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
 
    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
