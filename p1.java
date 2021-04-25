//1.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

 class Student{
	String name="John";
	int roll_no=2 ;
	
	}
	
public class p1{
	
	public static void main(String args[])
	{
	
		Student s1= new Student();
		System.out.println(s1.name);
		System.out.println(s1.roll_no);
	}
}	
 