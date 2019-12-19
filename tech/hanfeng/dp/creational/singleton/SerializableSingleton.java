package tech.hanfeng.dp.creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private volatile static SerializableSingleton instance = null;

	public static SerializableSingleton getInstance() {
		if (instance == null) {
			instance = new SerializableSingleton();
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

	private int i = 10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
