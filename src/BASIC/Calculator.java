package BASIC;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String yn;
        do {
            System.out.println("Enter firt no.: ");
            Scanner s = new Scanner(System.in);
            int no1 = s.nextInt();
            System.out.println("Enter second no.:");
            int no2 = s.nextInt();
            System.out.println("select symbol(+,-,*,/)");
            String sym = s.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Addition is :" + res);
                    break;


                case "-":
                    res = no1 - no2;
                    System.out.println("Subtraction is :" + res);
                    break;

                case "*":
                    res = no1 * no2;
                    System.out.println("Multiplication is :" + res);
                    break;

                case "/":
                    res = no1 / no2;
                    System.out.println("Division is :" + res);
                    break;

                default:
                    System.out.println("invalid symbol");
                    break;
            }
            System.out.println("Do you want continue(press y for yes and n for no)");
            yn = s.next();
        }

        while (yn.equals("y") || yn.equals("Y"));

    }
}
