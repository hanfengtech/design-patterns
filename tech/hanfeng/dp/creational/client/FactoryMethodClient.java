package tech.hanfeng.dp.creational.client;

import java.util.Scanner;

import tech.hanfeng.dp.creational.factorymethod.Vehicle;
import tech.hanfeng.dp.creational.factorymethod.VehicleFactory;
import tech.hanfeng.dp.creational.factorymethod.VehicleTypeNotFoundException;

public class FactoryMethodClient {

	/*
	 * @output
	 * 
	 * >> car
	 * Designing Car
	 * Manufacturing Car
	 * 
	 * >> truck
	 * Designing Truck
	 * Manufacturing Truck
	 * 
	 * >> motorcycle
	 * Designing Motorcycle
	 * Manufacturing Motorcycle
	 * 
	 * >> bike
	 * Invalid vehicle type entered!
	 */
	public static void main(String[] args) {
		System.out.print(">> ");
		Scanner in = new Scanner(System.in);
		String vehicleType = in.nextLine().toLowerCase();
		
		/* Create a factory instance */
		VehicleFactory factory = new VehicleFactory();
		
		try {
			
			/* Create an appropriate vehicle based on input */
			Vehicle vehicle = factory.getVehicle(vehicleType);
		
			/* Design and manufacture the vehicle */
			vehicle.design();
			vehicle.manufacture();
		} catch (VehicleTypeNotFoundException e) {
			System.out.println("Invalid vehicle type entered!");
		}
		
		in.close();
	}
}
