/*
Problem 19: Vehicle Registration – Static Block
Scenario: Add a static block to Vehicle class:
● Print "Welcome to CDAC Vehicle Registration Portal" when class loads
● Verify that the message prints only once when multiple vehicles are created
*/

class Vehicle 
{
    private String regNo;
    private String ownerName;
    private String vehicleType;
    private static int vehicleCount = 0;  // static counter for vehicles

    //Static Block (executes once when class is loaded)
    static 
	{
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    // Constructor
    public Vehicle(String ownerName, String vehicleType) 
	{
        vehicleCount++;             // increment static counter
        this.regNo = "MH-2025-" + vehicleCount;          // auto-generate registration number
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
public class CdackVehicles 
{
    public static void main(String[] args) 
	{
        // Creating multiple vehicles
        Vehicle v1 = new Vehicle("Priya", "Car");
        Vehicle v2 = new Vehicle("Rohan", "Bike");
        Vehicle v3 = new Vehicle("Anjali", "Truck");

        // Display vehicle details
        System.out.println("Vehicle 1: " + v1.getRegNo() + " | Owner: " + v1.getOwnerName() + " | Type: " + v1.getVehicleType());
        System.out.println("Vehicle 2: " + v2.getRegNo() + " | Owner: " + v2.getOwnerName() + " | Type: " + v2.getVehicleType());
        System.out.println("Vehicle 3: " + v3.getRegNo() + " | Owner: " + v3.getOwnerName() + " | Type: " + v3.getVehicleType());

        // Display total registered vehicles
        System.out.println("Total Vehicles Registered: " + Vehicle.getVehicleCount());
    }
}

/*
D:\OOPJ Assignment2>javac CdackVehicles.java

D:\OOPJ Assignment2>java CdackVehicles
Welcome to CDAC Vehicle Registration Portal
Vehicle 1: MH-2025-1 | Owner: Priya | Type: Car
Vehicle 2: MH-2025-2 | Owner: Rohan | Type: Bike
Vehicle 3: MH-2025-3 | Owner: Anjali | Type: Truck
Total Vehicles Registered: 3
*/