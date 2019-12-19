package tech.hanfeng.dp.creational.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import tech.hanfeng.dp.creational.singleton.EnumSingleton;

public class EnumSingletonClient {
	
	/*
	 * @output
	 * 
	 * Two objects are the same? true
	 * 20
	 * 20
	 * 
	 */
	public static void main(String[] args) {
		EnumSingleton obj1 = EnumSingleton.getInstance();
		EnumSingleton obj2 = EnumSingleton.getInstance();
		System.out.println("Two objects are the same? " + (obj1 == obj2));
	
        try {
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                    "filename.ser"));
            out.writeObject(obj1);
            out.close();
 
            obj1.setI(20);
 
            // Serialize to a file
            ObjectInput in = new ObjectInputStream(new FileInputStream(
                    "filename.ser"));
            EnumSingleton obj3 = (EnumSingleton) in.readObject();
            in.close();
 
            System.out.println(obj1.getI());
            System.out.println(obj3.getI());
 
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
}
