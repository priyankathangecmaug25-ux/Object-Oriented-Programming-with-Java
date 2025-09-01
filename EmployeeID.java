/*
Problem 15: Employee Auto-ID Generator
Scenario: Create Employee class with id, name, basicSalary.
● Add static counter starting from 1001 for IDs.
● Default constructor → name = "Unknown", salary = 20000
● Parameterized constructor → accept name and salary
● Getter for all variables
● Create 2 employees and display their IDs, names, salary
*/

class Employee
{
    int id;
	String name;
	double basicSalary;
	static int counter = 1001;
	
	Employee()
	{
	    this.id=counter++;
		this.name="Unknown";
		this.basicSalary=20000;;
	}
	
	
	Employee(String name,double basicSalary)
	{
		this.id=counter++;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	//getter
	int getId()
	{
       return id;
    }

     String getName() 
    {
        return name;
    }

    double getBasicSalary() 
	{
      return basicSalary;
    }
	
	void showDetail()
	{
	   System.out.println("EmployeeID:" +id+ " ,Employee Name:" +name+ " ,Salary:"+basicSalary);
	}
	
}
public class EmployeeID
{
         public static void main(String args[])
		 {
		    Employee e1 = new Employee ();
			Employee e2 = new Employee ("Shital",35000);
			
			e1.showDetail();
			e2.showDetail();

		 }
}

/*
D:\OOPJ Assignment2>javac EmployeeID.java

D:\OOPJ Assignment2>java EmployeeID
EmployeeID:1001 ,Employee Name:Unknown ,Salary:20000.0
EmployeeID:1002 ,Employee Name:Shital ,Salary:35000.0
*/