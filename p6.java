/*6.Write a program to print the area of a rectangle by creating a class 
named 'Area' having two methods. First method named as 'setDim' takes 
length and breadth of rectangle as parameters and the second method named 
as 'getArea' returns the area of the rectangle. 
Length and breadth of rectangle are entered through keyboard.*/

class Area{
int len,breadth;

void setDim(int l,int b){
this.len=l;
this.breadth=b;
}

int getArea()
{
  int area;
  area= len*breadth;
 return area;
}
}
public class p6{

public static void main(String args[])
{
	Area ar= new Area();
	ar.setDim(2,4);
	int ans=ar.getArea();	
	System.out.print(ans);

}

}

