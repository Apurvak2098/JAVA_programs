/*3. Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it.
 Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to the Piggie Bank
Create an object of the 'AddAmount' class and display the final amount in the Piggie Bank.*/


class AddAmount
{
    private int amount = 50;

    public AddAmount()
    {
      int amount = 0;
    }

    public AddAmount(int a)
    {
        amount = a+amount;
    }

    public void displayAmount()
    {
        System.out.println(amount);
    }
}

class p13

{
    public static void main(String[] args)
    {
        AddAmount a = new AddAmount();
        AddAmount b = new AddAmount(40);
        a.displayAmount();
        b.displayAmount();
    }
}



