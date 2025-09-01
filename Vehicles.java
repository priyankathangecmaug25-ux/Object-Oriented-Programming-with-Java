/*
Problem 18: Vehicle Registration – Static Counter
Scenario: Create Vehicle class with regNo, ownerName, vehicleType.
● Static variable: vehicleCount
● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount
● Getter methods for all fields
*/

class Vehicle 
{
    private String regNo;
    private String ownerName;
    private String vehicleType;
    private static int vehicleCount = 0;  // static counter for vehicles

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        vehicleCount++; // increment static counter
        this.regNo = "MH-2025-" + vehicleCount; // auto-generate registration number
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Getter methods
    public String getRegNo()
	{
        return regNo;
    }

    public String getOwnerName() 
	{
        return ownerName;
    }

    public String getVehicleType()
	{
        return vehicleType;
    }

    public static int getVehicleCount() 
	{
        return vehicleCount;
    }
}
public class Vehicles
{
    public static void main(String[] args) 
	{
        Vehicle v1 = new Vehicle("Priya", "Car");
        Vehicle v2 = new Vehicle("Rohan", "Bike");
        Vehicle v3 = new Vehicle("Anjali", "Truck");

        System.out.println("Vehicle 1: " + v1.getRegNo() + " | Owner: " + v1.getOwnerName() + " | Type: " + v1.getVehicleType());
        System.out.println("Vehicle 2: " + v2.getRegNo() + " | Owner: " + v2.getOwnerName() + " | Type: " + v2.getVehicleType());
        System.out.println("Vehicle 3: " + v3.getRegNo() + " | Owner: " + v3.getOwnerName() + " | Type: " + v3.getVehicleType());

        System.out.println("Total Vehicles Registered: " + Vehicle.getVehicleCount());
    }
}
/*
D:\OOPJ Assignment2>javac Vehicles.java

D:\OOPJ Assignment2>java Vehicles
Vehicle 1: MH-2025-1 | Owner: Priya | Type: Car
Vehicle 2: MH-2025-2 | Owner: Rohan | Type: Bike
Vehicle 3: MH-2025-3 | Owner: Anjali | Type: Truck
Total Vehicles Registered: 3
*/