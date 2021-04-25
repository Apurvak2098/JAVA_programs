/*4. Create a class named 'Programming'. While creating an object of the class, 
if nothing is passed to it, then the message "I love programming languages" should be printed. 
If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating the object if we pass "cpp", then "I love cpp" should be printed.*/

class test1 {
     String s;
    String name ;
    public test1(String s)
    {
        name = s;
    }
    public test1(){
        name = "I love programming languages ";
    }
 }





class p14
 {
    public static void main(String[] args) {
        test1 obj = new test1();
        obj.s = "cpp";
        System.out.println("I love " + obj.s);
        System.out.println(obj.name);

    }
}