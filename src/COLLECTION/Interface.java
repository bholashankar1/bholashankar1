package COLLECTION;


public class Interface{
    public static void main(String[] args) {
// 1st way to create an object of interface-I1
        I1 i1 = new I1Impl();

        i1.print();
// Anonymous class
        I1 i11 = new I1() {
            @Override
            public void print() {
                System.out.println("Anonymous class print-I1");
            }
        };
        i11.print();

// lambda expression
        I1 i1lambda = () -> System.out.println("Lambda Exp. print-I1");
        i1lambda.print();

        I3 i3 = k-> System.out.println(k);
        i3.print(12);
    }
}


@FunctionalInterface
interface I1 {
    void print();

    static void print3() {
    }

}

//@FunctionalInterface
interface I2 {
    void print();

    void print2();

    static void print3() {
    }
}

class I1Impl implements I1 {
    @Override
    public void print() {
        System.out.println("Separate class print-I1");
    }
}

interface I3 {
    void print(int i);
}