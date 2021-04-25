//1.
//Write a program to print the names of students by creating a Student class. 
//If no name is passed while creating an object of the Student class, then the name should be "Unknown", 
//otherwise the name should be equal to the String value passed while creating the object of the Student class.


class student
{
String name;
public student(String s)
{
name=s;
}
public student()
{
name="unknown";
}
}
class p11
{
	public static void main (String args[])
	{
		student s=new student("abc");
		student a=new student(); 
		System.out.println(s.name);
		System.out.println(a.name);
	}
	
}


