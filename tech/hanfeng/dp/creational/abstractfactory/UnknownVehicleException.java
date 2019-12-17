package tech.hanfeng.dp.creational.abstractfactory;

public class UnknownVehicleException extends Exception {
    private static final long serialVersionUID = 1L;

    public UnknownVehicleException() {
       
    }

    public String getMessage() {
        return "Unknown Vehicle　Exception!";
    }
}