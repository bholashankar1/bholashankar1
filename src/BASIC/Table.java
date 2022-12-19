package BASIC;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {

        System.out.println("Enter number");
        Scanner r=new Scanner(System.in);
        int t=r.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(t+"*"+i+"="+t*i);
        }
    }
}