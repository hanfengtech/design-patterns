package tech.hanfeng.dp.creational.factorymethod;

public class Car implements Vehicle {

	Car() {
		/* constructor is protected.
		   clients need to use the factory method */
	}
	
	@Override
	public void design() {
		System.out.println("Designing Car");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing Car");
	}

}
