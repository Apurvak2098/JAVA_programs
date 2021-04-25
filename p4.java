//4.Write a program to print the area and perimeter of a triangle having sides of 3,4and 5
 //units by creating a class named 'Triangle' with constructor having the three sides 
 //as its parameters.


class Traingle{
 
 int b,len,height;
 Traingle(int b, int len, int height ){
	 
	 this.b=b;
	 this.len=len;
	 this.height=height;
 
 }

void Area(){
 double area =(b*height)/2;
 System.out.println(area);
}
 
 void Parameter(){
	 
 double parameter1= (b+len+height)/2;
System.out.println(parameter1);

}

}

public class p4
{
	
	public static void main (String args[])
	
	{ Traingle tr= new Traingle(2,5,3);
		tr.Area();
		tr.Parameter();
			
	}
	
}
