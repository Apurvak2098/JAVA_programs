//2.Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
 class Student{
 
 public Student(String name, int Roll_no, int Phone_no, String address)
 {
	System.out.println("........Student1 Information.......");
	System.out.println("Name:"+name);
	System.out.println("Roll-No:"+Roll_no);
	System.out.println("Phone Number:"+Phone_no);
	System.out.println("Address:"+address);
 }

 }
 
 public class p2{
 
 public static void main(String args[])
 {
	Student obj=new Student("sham",1,78987678,"pune");
	Student obj1=new Student("john" ,2,67896578,"mumbai");

 }
 }