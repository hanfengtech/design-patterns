package tech.hanfeng.dp.creational.singleton;

import java.io.Serializable;

/*
 * Serialize, thread and clone save lazy loading and scalable singleton
 * 
 * https://howtodoinjava.com/design-patterns/creational/singleton-design-pattern-in-java/
 * 
 */
public class Singleton implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
 
    private Singleton() {
        // private constructor
    }
 
    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();
    }
 
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
 
    protected Object readResolve() {
        return getInstance();
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
    	throw new CloneNotSupportedException();
    }
}