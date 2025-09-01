/* Problem 1: Counter for Cups
Scenario: You are keeping track of how many cups of tea are prepared in your home.
Requirements:
1. Create a class TeaCup with instance variable: teaType (String).
2. Create a static variable totalCups to count all cups created.
3. Constructor should initialize teaType and increment totalCups.
4. Create getter for teaType.
5. Create a static method showTotalCups() to print total cups.
Input Example:
Cup1: teaType = "Masala Tea"
Cup2: teaType = "Green Tea"
Cup3: teaType = "Ginger Tea"
Expected Output:
Cup1 type: Masala Tea
Cup2 type: Green Tea
Cup3 type: Ginger Tea
Total cups made: 3 */

class TeaCup
{
    String teaType;
	static int totalCups=0;
	
	TeaCup(String teaType)
	{
	   this.teaType=teaType;
	   totalCups++;  
	}
	
	//getter
	String getTeaType()
	{
		return teaType;
	}
	
	static void showTotalCups()
	{
	   System.out.println("Total cups made: "+totalCups);
	}
}
public class Teacups
{
    public static void main(String args[])
	{
	//debugger
	 TeaCup t1=new TeaCup("Masala Tea");
	 TeaCup t2=new TeaCup("Green Tea");
	 TeaCup t3=new TeaCup("Ginger Tea");
	 
	 System.out.println("Cup1 type: "+t1.getTeaType());
	 System.out.println("Cup2 type: "+t2.getTeaType());
	 System.out.println("Cup3 type: "+t3.getTeaType());
	  
	  TeaCup.showTotalCups();
	 
	 
	}


}
