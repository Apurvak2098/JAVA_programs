/*6. Create a class to print an integer and a character using two functions having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n).*/

class DisplayOverloading
{
    public void disp(int n,char c)
    {
         System.out.println(n+ " "+c);
    }
    public void disp(char c, int n)  
    {
         System.out.println(c + " "+n);
    }
}
class p16
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp(10,'a');
       obj.disp('a',10);
   }
}