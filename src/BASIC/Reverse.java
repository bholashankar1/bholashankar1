package BASIC;

import java.util.Scanner;

public class Reverse{
    public static void main(String[] args)
    {
        int rem,rev=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number to reverse");
        int no=s.nextInt();
        while(no!=0)
        {
            rem =no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println(+rev);
    }
}



class ReverseString{
    public static void main(String[] args)
    {
        String name="bhola";
        int leng=name.length();
        String rev=" ";

        for(int i=leng-1; i>=0; i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}