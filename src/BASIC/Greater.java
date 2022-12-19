package BASIC;

public class Greater {
    public static void main(String[] args) {
        int a = 10, b = 20;
        if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println(" B is greater");
        }
    }
}

class GreaterThreenumber {
    public static void main(String[] args) {
        int a = 100, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");

        } else {
            System.out.println("c is greater");
        }
    }
}


class LargestNumber {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a > b) {
            if (a > c) {
                System.out.println("a is greater");
            } else {
                System.out.println("c is greater");
            }
        } else if (b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }

    }
}

