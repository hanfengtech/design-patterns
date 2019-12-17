package tech.hanfeng.dp.creational.abstractfactory;

class CarFactory extends Factory {
    
    @Override
    public Engine getEngine() {
        return new CarEngine();
    }

    @Override
    public Tire getTire() {
        return new CarTire();
    }
}