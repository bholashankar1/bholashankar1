package BASIC;
import java.util.Scanner;

public class Unit {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a name:");
        String name =s.next();
        System.out.println("Enter a age:");
        int age=s.nextInt();
        System.out.println("Enter gender:");
        char gender=s.next().charAt(0);
        System.out.println("Enter your phone number:");
        long phone=s.nextLong();
        System.out.println("-----------------------");
        System.out.println("enter your name:" +name);
        System.out.println("enter your age:" +age);
        System.out.println("enter your gender:" +gender);
        System.out.println("enter your number:" +phone);
        }
    }


