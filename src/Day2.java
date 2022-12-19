import java.util.Scanner;

class ProgrammingConstrucgtConcept{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter   a number to check even number");
    int i = scanner.nextInt();

    if (i%2==0){
        System.out.println("Even Number");
    } else {
        System.out.println("Odd Number");
    }
}
}