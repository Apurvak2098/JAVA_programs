/*2.Create a class named 'Rectangle' with two data members- length and breadth and a function to
calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.*/


class hello{
    int length;
    int breadth;

    public hello()
    { 
        int length = 0;
        int breadth = 0;

    }
 public hello(int length,int breadth)
    {
        this.length = 7;
        this.breadth = 8;
    }
	
    public hello(int length)
    {
        this.length = 4 ;
         breadth = 5;

    }
  
    public void  m1()
    {
        System.out.println(length*breadth);
    }
}
public class p12 {
    public static void main(String[] args) {
        hello obj = new hello();
        hello obj1= new hello(7,8);
        obj1.m1();
        hello obj2 = new hello(4);
        obj2.m1();


    }
}



