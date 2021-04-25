/*9.Print the sum, difference and product of two complex numbers by 
creating a class named 'Complex' with separate methods for each operation 
whose real and imaginary parts are entered by user.*/

class Complex{
int no1,no2;
int ans;

Complex(int n1,int n2){
	this.no1=n1;
	this.no2=n2;
	
}
void Sum()
{
	ans= no1+no2;
	System.out.println( "Sum is: " +ans);
}
void Diff()
{
	if(no1>no2)
	{
	ans= no1-no2;
	}
	else
	{
	ans= no2-no1;	
	}
	System.out.println( "Difference is: " +ans);
}

void Product()
{
	ans= no1*no2;
	System.out.println( "Product is: " +ans);
}
}

public class p9{
	public static void main(String args[])
	{
		
		Complex com= new Complex(3,5);
			com.Sum();
			com.Diff();
			com.Product();
	}
}



