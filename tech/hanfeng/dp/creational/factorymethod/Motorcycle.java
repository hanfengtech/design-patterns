package tech.hanfeng.dp.creational.factorymethod;

public class Motorcycle implements Vehicle {

	Motorcycle() {
	}
	
	@Override
	public void design() {
		System.out.println("Designing Motorcycle");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing Motorcycle");
	}

}
