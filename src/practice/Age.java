package practice;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("how old are you ");
        Scanner stringScanner = new Scanner(System.in);
        String age= stringScanner.next();
        System.out.println(age+ " good age to be!");
    }
}
