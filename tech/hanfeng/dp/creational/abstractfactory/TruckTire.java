package tech.hanfeng.dp.creational.abstractfactory;

class TruckTire implements Tire {

    @Override
    public void design() {
      System.out.println("Designing Truck Tire");
    }

    @Override
    public void manufacture() {
       System.out.println("Manufacturing Truck Tire");
    }

}