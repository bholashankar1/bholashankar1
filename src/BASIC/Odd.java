package BASIC;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        int n;
        System.out.println("ENTER A NUMBER:");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        if (n % 2 == 0) {
            System.out.println("Number is even");

        } else {
            System.out.println("Number is odd");
        }
    }
}
