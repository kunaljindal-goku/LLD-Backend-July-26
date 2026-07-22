public class Vehicle {

    private int vehicleNo = 100;
    String name;
    int wheels;
    int fuel;

    public Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Vehicle(int vehicleNo, String name, int wheels, int fuel) {
        this.vehicleNo = vehicleNo;
        this.name = name;
        this.wheels = wheels;
        this.fuel = fuel;
    }

    public void startVehicle() {
        System.out.println("Vehicle is starting: "+name);
    }

    public void refillFuel(int fuel) {
        this.fuel += fuel;
        System.out.println("Fuel is refilled upto "+fuel);
    }
}
