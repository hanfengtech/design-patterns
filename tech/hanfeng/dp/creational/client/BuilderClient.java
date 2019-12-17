package tech.hanfeng.dp.creational.client;

import tech.hanfeng.dp.creational.builder.*;

public class BuilderClient {

    
    public static void main(final String[] args) {

        HouseBuilder builder = new ConcreteHouseBuilder();
        HouseBuildDirector houseBuildDirector = new HouseBuildDirector(builder);
        System.out.println(houseBuildDirector.construct());

        builder = new WoodenHouseBuilder();
        houseBuildDirector = new HouseBuildDirector(builder);
        System.out.println(houseBuildDirector.construct());
    }
}