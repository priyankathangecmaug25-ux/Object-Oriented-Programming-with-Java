/*
Problem 10: Student Marks Checker
Scenario: Create a Student class with rollNo, name, and marks.
● Use a parameterized constructor to initialize all fields.
● Create a getter and setter for marks.
● In main, create one student, update marks using setter, and print student details.
*/

class Student 
{
    int rollNO;
	String name;
	double marks;
	
	Student(int rollNO,String name,double marks)
	{
	   this.rollNO=rollNO;
	   this.name=name;
	   this.marks=marks;
	}
	void setMarks(double marks) 
	{
        this.marks = marks;
    }
	void showDetails() 
	 {
        System.out.println("RollNo=" + rollNO + ", Name=" + name + ", Marks=" + marks);
     }
	
}
class StudentMarks
{
    public static void main(String args[])
	{
	   Student s1 = new Student(12,"Rahul",86.49);
	   //System.out.println("Name: " +s1.name+ ", Roll NO: "  +s1.rollNO+ ", Marks: "+s1.marks);
	    s1.setMarks(90);
		s1.showDetails();
	}

}

/*
D:\OOPJ Assignment2>javac StudentMarks.java

D:\OOPJ Assignment2>java StudentMarks
RollNo=12, Name=Rahul, Marks=90.0
*/