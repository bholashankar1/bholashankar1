package Day3;

public class Element {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Elements of given array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


class LargestElement_array {
    public static void main(String[] args) {
        int[] arr = new int[]{25, 11, 7, 75, 56};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}



class SmallestElement_array {
    public static void main(String[] args) {

        int [] arr = new int [] {25, 11, 7, 75, 56};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}
