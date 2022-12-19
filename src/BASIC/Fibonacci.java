package BASIC;


public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        int c;
        for (int i = 0; i <= 10; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}


class FibonacciRecursion {
    static int a = 0, b = 1, c;

    public static void main(String[] args) {
        System.out.print(a + " " + b);
        FibonacciRecursion ob = new FibonacciRecursion();
        ob.printFib(10);
    }

    void printFib(int i) {
        if (i >= 1) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            printFib(i - 1);
        }
    }
}