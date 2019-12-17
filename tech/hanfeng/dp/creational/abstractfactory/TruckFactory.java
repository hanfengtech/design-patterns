package tech.hanfeng.dp.creational.abstractfactory;

class TruckFactory extends Factory {
    
    @Override
    public Engine getEngine() {
        return new TruckEngine();
    }

    @Override
    public Tire getTire() {
        return new TruckTire();
    }
}