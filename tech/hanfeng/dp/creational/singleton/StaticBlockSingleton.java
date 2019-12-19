package tech.hanfeng.dp.creational.singleton;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;
    
    public static int NUM = 5;
    
    static {
        try {
        	System.out.println("Static block initialization");
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Uffff, i was not expecting this!", e);
        }
    }
 
    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
 
    private StaticBlockSingleton() {
    	System.out.println("Singleton created!");
    }
}
