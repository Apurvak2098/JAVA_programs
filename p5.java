  
//5.Write a program to print the area of two rectangles having sides (4,5) and (5,8) 
//respectively by creating a class named 'Rectangle' with a method named 'Area'
// which returns the area and length and breadth passed as parameters to its constructor.


class Rectangle{
int b,len;

 Rectangle(int b, int len)
{
	this.b=b;
	this.len=len;
}

double Area(){
	
 double area = b*len;
 return area;

}
double parameter()
{
	double parameter1= 2*(b+len);
	return parameter1;
	
}

}

public class p5{
	
	public static void main (String args[])
	
	{ Rectangle tr= new Rectangle(4,5);
		Rectangle tr1= new Rectangle(5,8);
		double ans,ans1;
		 ans = tr.Area();
		 ans1= tr.parameter();
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println("---------------");
		 ans = tr1.Area();
		ans1= tr1.parameter();
		System.out.println(ans);
		System.out.println(ans1);
		

		
		
	}
	
}
	
