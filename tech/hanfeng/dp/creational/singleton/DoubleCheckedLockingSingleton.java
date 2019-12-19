package tech.hanfeng.dp.creational.singleton;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance = null;
 
    // private constructor
    private DoubleCheckedLockingSingleton() {
    }
 
    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                // Double check
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
