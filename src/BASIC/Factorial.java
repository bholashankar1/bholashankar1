package BASIC;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int a=5,fact=1;
        for (int i=1; i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println(+fact);

    }
}


class MyClass {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the no. -");
        int no = s.nextInt();
        int fact = 1;
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println(+fact);
    }
}