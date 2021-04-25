//5. Create a class named 'PrintNumber' to print various numbers of different datatypes by creating 
//different functions with the same name 'printn' having a parameter for each datatype.


class PrintNumber

{
	public void printn(String a)
	{
		System.out.println("value of String:" +a);
    }
	public void printn(char a)
	{
		System.out.println("value of char:" +a);
    }
    public void printn(int a)
	{
		System.out.println("value of int:" +a);
    }
   
    public void printn(double a)
	{
	   System.out.println("value of double:" +a);
    }
	
	public void printn(long a)
	{
       System.out.println("value of long:" +a);
    }
	public void printn(boolean a)
	{
	    System.out.println("value of boolean:" +a);
    }
	
}
	
class print1
{
	public static void main(String[] args) 
	{
	PrintNumber a = new PrintNumber ();
    a.printn("printn");
	a.printn('A');
	a.printn(15);
    a.printn(19.23);
    a.printn(1542163164);
    a.printn(true);
	}
}




/*
class PrintNumber
{
	public String printn(String a)
	{
        System.out.println(a);
        return a;
    }
	public char printn(char b)
	{
        System.out.println(b);
        return b;
    }
    public int printn(int a)
	{
        System.out.println(a);
        return a;
    }
   
    public double printn(double a)
	{
        System.out.println(a);
        return a;
       
    }
	
	public long printn(long a)
	{
        System.out.println(a);
        return a;
    }
	public boolean printn(boolean a)
	{
        System.out.println(a);
        return a;
    }
}
	
class p15
{
	public static void main(String[] args) 
	{
	PrintNumber a = new PrintNumber ();

             
              a.print("printn");
	a.print("A");
	a.print(15);
              a.print(19.23);
              a.print(1542163164);
              a.print(1);
	}
}
*/