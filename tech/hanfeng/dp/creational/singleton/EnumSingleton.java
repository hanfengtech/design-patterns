package tech.hanfeng.dp.creational.singleton;

/*
 * enum are always best choice for implementing singleton design pattern in java
 * 
 * Pros:
 * 1) simplest
 * 2) fixed all serializing, syncronizing, reflection problems by language itself 
 * 3) guaranteed there is only one in the JVM
 * 
 * 
 * Cons:
 *  1) enums do not support lazy loading.
 *  2) Though it’s very very rare but if you changed your mind and now want to convert your singleton to multi-ton, 
 *     enum would not allow this.
 *  3) Cannot inherit an enum
 *  4) Hard to garbage collect.  Lead to memory leak.
 *  
 */
public enum EnumSingleton
{
    INSTANCE;
    // instance vars, constructor
      
    EnumSingleton(){
    	// initialing stuff
    }
 
    // factory method - static getter
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
    
	private int i = 10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
