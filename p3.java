//3.Write a program to print the area and perimeter of a triangle having sides of 3, 4 
//and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

class Traingle{
int b,len,height;

void Area(){
	
 double area =(b*height)/2;
 System.out.println(area);

}
void parameter()
{
	double parameter1= (b+len+height)/2;
	System.out.println(parameter1);
	
}

}

public class p3{
	
	public static void main (String args[])
	
	{ Traingle tr= new Traingle();
		tr.b=10;
		tr.height=7;
		tr.len=7;
		tr.Area();
		tr.parameter();

		
		
	}
	
}
