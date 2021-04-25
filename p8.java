//8.Print the average of three numbers entered by user by 
//creating a class named 'Average' having a method to calculate and print the average.

class Average{
int a,b,c;
float ans;

Average(int a1,int b1, int c1)
{
	 this.a=a1;
	 this.b=b1;
	 this.c=c1;
}

void calculate(){
	
	ans = (a+b+c)/3;
	
}

void print()
{
	System.out.println(ans);
}
}

public class p8{
	public static void main(String args[])
	{
		Average avg = new Average(10,11,13);
		avg.calculate();
		avg.print();
		
	}
}

