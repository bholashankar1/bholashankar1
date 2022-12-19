package BASIC;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int year;
        System.out.println("ENTER YEAR TO CHECK:");
        Scanner r = new Scanner(System.in);
        year = r.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {


                if (year % 400 == 0) {
                    System.out.println("is leap year" + year);
                } else {
                    System.out.println("is not leap year" + year);
                }

            } else {
                System.out.println("is leap year" + year);
            }

        } else {
            System.out.println("is  not leap year" + year);
        }
    }
}
