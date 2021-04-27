/*8. Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values to name as "unknown", age as '0' 
and address as "not available". It has two functions with the same name 'setInfo'. 
First function has two parameters for name and age and assigns the same whereas the 
second function takes has three parameters which are assigned to name, age and address
 respectively. Print the name, age and address of 10 students.
Hint - Use array of objects*/


class student {
String name,address;
int age;
student(){
	this.name="unknown";
	this.age=0;
	this.address="not available";
}
void print()
{
	System.out.println("name: " +name);
	System.out.println("age: " +age);
	System.out.println("address: " +address);
}

void setinfo(String name1,int age1)
{
	this.name=name1;
	this.age=age1;
	
}

void setinfo(String name1,int age1,String address1)
{
	this.name=name1;
	this.age=age1;
	this.address=address1;
}

}
public class p18
{
	public static void main(String args[])
	{
		student[] s1=new student[3];
		s1[0]=new student();
		s1[0].setinfo("apurva",22,"pune");
		s1[0].print();
		s1[1]=new student();
		s1[1].setinfo("anushree",11,"mumbai");
		s1[1].print();
		s1[2]=new student();
		s1[2].setinfo("riya",13,"nagpur");
		s1[2].print();
		
	}
		
}