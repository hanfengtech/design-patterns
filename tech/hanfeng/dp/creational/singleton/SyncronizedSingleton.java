package tech.hanfeng.dp.creational.singleton;

public class SyncronizedSingleton {
	 private static SyncronizedSingleton obj; 
	  
	    private SyncronizedSingleton() {} 
	  
	    // Only one thread can execute this at a time 
	    public static synchronized SyncronizedSingleton getInstance() 
	    { 
	        if (obj==null) 
	            obj = new SyncronizedSingleton(); 
	        return obj; 
	    } 
}
