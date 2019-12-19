package tech.hanfeng.dp.creational.singleton;

public class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();
 
    // private constructor
    private EagerSingleton() {
    }
 
    // factory method
    public static EagerSingleton getInstance() {
        return instance;
    }
}
