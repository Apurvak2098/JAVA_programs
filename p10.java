/*10.Write a program that would print the information (name, year of joining, salary, 
address) of three employees by creating a class named 'Employee'. The output should
 be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat */

class Employee{
	String name,YearofJoin,Address;
	int Salary;
	
Employee( String nm,String yoj, int sal,String add)
{
this.name= nm;
this.YearofJoin=yoj;
this.Salary=sal;
this.Address=add;
}
void Print()
{
	System.out.println(name+ "    "    +YearofJoin+   "      "    +Salary+    "       " + Address);
}


}	

public class p10{
	public static void main(String args[])
	{
		System.out.print("  name  ");
		System.out.print("  Year of Joining ");
		System.out.print("  salary ");
		System.out.print("  Address    \n");
		Employee e1= new Employee("Robert","1994",20000,"64C- WallsStreat");
		e1.Print(); 
		Employee e2= new Employee("Sam","2000",20000,"68C- WallsStreat");
		e2.Print();
		Employee e3= new Employee("John","1999",20000,"64C- WallsStreat");
		e3.Print();
	}
}
	