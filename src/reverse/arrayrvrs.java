 class ArrayPractice01 {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3, 8}, {4,5,6, 3}, {7,8,9, 2}, {1,2,3,4}};
        printArray(arr);
        System.out.println("---------------");
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr.length; j++) {

                int temp = arr[j][i];
                arr[j][i] = arr[j][arr.length - 1 - i];
                arr[j][arr.length - 1 - i] = temp;
            }
        }

        printArray(arr);
    }

    private static void printArray(int[][] arr) {
        for (int[] ar : arr) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}