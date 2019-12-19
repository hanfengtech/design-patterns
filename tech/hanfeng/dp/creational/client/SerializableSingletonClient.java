package tech.hanfeng.dp.creational.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import tech.hanfeng.dp.creational.singleton.SerializableSingleton;

public class SerializableSingletonClient {
    static SerializableSingleton instanceOne = SerializableSingleton.getInstance();
 
    /*
     * @output 
     * 
     * 20
     * 20
     * 
     */
    public static void main(String[] args) {
        try {
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                    "filename.ser"));
            out.writeObject(instanceOne);
            out.close();
 
            instanceOne.setI(20);
 
            // Serialize to a file
            ObjectInput in = new ObjectInputStream(new FileInputStream(
                    "filename.ser"));
            SerializableSingleton instanceTwo = (SerializableSingleton) in.readObject();
            in.close();
 
            System.out.println(instanceOne.getI());
            System.out.println(instanceTwo.getI());
 
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
