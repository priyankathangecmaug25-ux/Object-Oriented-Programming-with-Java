/*
Problem 11: Student Grade Calculator
Scenario: Extend previous problem. Add method calculateGrade() which returns:
● "A" if marks ≥ 80
● "B" if marks ≥ 60
● "C" if marks ≥ 40
● "Fail" otherwise
● Create 2 students, print marks and grades
*/

class Student{

      int rollNO;
	  String name;
	  int marks;
	  
	Student(int rollNO,String name,int marks)
	{
	   this.rollNO=rollNO;
	   this.name=name; 
	   this.marks=marks;
	}
	
	String calculateGrade()
	{ 
	   if(marks>= 80){
	     return "A";
	   }
	   else if (marks >= 60)
	   {
	      return "B";
	   }
	   else if (marks >= 40)
	   {
	      return "C";
	   }
	   else
	   {
	      return "Fail";
	   }
	}
	
	void display()
	{
	   System.out.println("Name: " +name+ ", Marks: " +marks+ ", Grade: " +calculateGrade());
	}

}
class StudentGrade{

        public static void main(String args[])
		{
		   Student s1= new Student(1,"Rahul",85);
		   Student s2 = new Student(2,"Pooja" ,35);
		   
		   s1.display();
		   s2.display();
		
		}
}

/*
D:\OOPJ Assignment2>javac StudentGrade.java

D:\OOPJ Assignment2>java StudentGrade
Name: Rahul, Marks: 85, Grade: A
Name: Pooja, Marks: 35, Grade: Fail
*/