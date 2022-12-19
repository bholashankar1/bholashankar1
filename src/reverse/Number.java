package reverse;

public class Number
{
    public static void main(String args[])
    {
        int number=100;
        System.out.print("List of even numbers from 1 to "+number+": ");
        for (int i=0; i<=number; i++)
        {
            if (i%2==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}