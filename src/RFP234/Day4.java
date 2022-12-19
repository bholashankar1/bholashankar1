package RFP234;

import java.sql.SQLOutput;

class ArrayDemo {
    public static void main(String args[]) {
        int array[] = new int[10];
        for (int count = 0; count < 10; count++) {
            array[count] = count + 1;
        }
        for (int count = 0; count < 10; count++){
            System.out.println("array[" + count + "] = " + array[count]);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        int n;
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }
}



class Star {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        int k = 3;
        for (i = k - 1; i >= 0; i--) {
            for ( j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}


class Star1 {
    public static void main(String[] args)
    {
        int k=4;
        for (int i=k-1; i>=0;i--)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

class Star2
{
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



     class Star3{
    public static void main(String[] args){
        for (int i=1; i<=4; i++)
        {
            for(int j=3; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}



class Star4{
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" ");
            }
            for (int k = 3; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




class Star6{
     public static void main(String[] args)
    {
        for (int i=1; i<=4; i++)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}





//if else

class Star7{
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=4; j>=1; j--)
            {
                if(j>i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}




