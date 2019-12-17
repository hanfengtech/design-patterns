package tech.hanfeng.dp.creational.abstractfactory;

class CarTire implements Tire {

    @Override
    public void design() {
      System.out.println("Designing Car Tire");
    }

    @Override
    public void manufacture() {
       System.out.println("Manufacturing Car Tire");
    }

}