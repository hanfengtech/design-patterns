package tech.hanfeng.dp.creational.singleton;

public class PublicStaticSingleton {

    public static int NUM = 5;
    public static final PublicStaticSingleton INSTANCE = new PublicStaticSingleton();
    
    private PublicStaticSingleton() {
    	System.out.println("Singleton constructor");
    }
}
