/*7.Write a program to print the area of a rectangle by creating 
a class named 'Area' taking the values of its length and breadth as 
parameters of its constructor and having a method named 'returnArea' which 
returns the area of the rectangle. Length and breadth of rectangle are entered 
through keyboard.*/

class Area{
int len,breadth;

Area(int l,int b)
{
	 this.len=l;
	 this.breadth=b;
}

 int returnArea(){
	 int area;
	 area= len*breadth;
	 return area;	 
 }
}
public class p7{
	public static void main(String args[]){
		Area ar= new Area(2,4);
		int ans=ar.returnArea();
		System.out.println(ans);
	}
}


