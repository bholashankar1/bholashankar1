package BASIC;

public class Swap {
    public static void main(String[] args) {
        int a=10,b=20;
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("a is " +a);
        System.out.println("b is " +b);
    }
}

class SwapTwo{
    public static void main(String[] args) {
        int a=10,b=20;
        a=a+b;//30
        b=a-b;//10
        a=a-b;//20
        System.out.println("a is " +a);
        System.out.println("b is "+b);
    }
}
