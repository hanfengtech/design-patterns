package tech.hanfeng.dp.creational.client;

import java.util.Scanner;

import tech.hanfeng.dp.creational.abstractfactory.*;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vehicleType = in.nextLine().toLowerCase();

        Factory factory;
        try {
            factory = Factory.getFactory(vehicleType);

            Engine engine = factory.getEngine();
            engine.design();
            engine.manufacture();
            engine.test();

            Tire tire = factory.getTire();
            tire.design();
            tire.manufacture();
        } catch (UnknownVehicleException e) {
            System.out.println(e.getMessage());
        }

        in.close();
    }
}