/*
Problem 9: School Fee System
Scenario: A school wants to initialize the tuition fee for all students once at program start. Each student has name and class. Use static blocks to set the fee and setters/getters to update/access student information.
Tasks:
1. Create a Student class.
2. Use a static block to initialize tuitionFee to 30000.
3. Create instance variables: name (String) and className (String).
4. Create setters and getters for name and className.
5. Print student details including tuition fee.
Input Example:
Student1: Name="Anjali", Class="10th"
Student2: Name="Vikram", Class="12th"
Expected Output:
School Tuition Fee Initialized: 30000
Student1: Name=Anjali, Class=10th, Tuition Fee=30000
Student2: Name=Vikram, Class=12th, Tuition Fee=30000
*/

class Student
{
     String name;
     String className;
     static int tuitionFee;
	 
	 static void display()
	 {
	    tuitionFee = 30000;
	   System.out.println("School Tuition Fee Initialized: " +tuitionFee);
	 }
	 
	 Student(String name,String className)
	 {
	   this.name=name;
	   this.className=className;
	 }
	 
	 void showDetails()
	 {
	    System.out.println("Name=" +name+ ", class=" +className+ ", Tuition Fee=" +tuitionFee);
	 }
}
class Studentfee
{
      public static void main(String args[])
	  { 
	     //System.out.println("School Tuition Fee Initialized: "+tuitionFee);
		 Student.display();
		 Student s1 = new Student("Anjali","10th");
		 Student s2 = new Student("Vikram", "12th");
		 
	     s1.showDetails();
		 s2.showDetails();
	  
	  }


}