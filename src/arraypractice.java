class ArrrayPractice {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printArr(arr);

        int rotationCount = 3;

        for (int i = 0; i < rotationCount; i++) {
            int temp1 = arr[0][0];
            int temp2 = 0;
// left to right
            for (int h = 1; h < arr.length; h++) {
                temp2 = arr[0][h];
                arr[0][h] = temp1;
                temp1 = temp2;
            }

// top to bottom
            for (int h = 1; h < arr.length; h++) {
                temp2 = arr[h][arr.length - 1];
                arr[h][arr.length - 1] = temp1;
                temp1 = temp2;
            }

// right to left
            for (int h = arr.length - 2; h >= 0; h--) {
                temp2 = arr[arr.length - 1][h];
                arr[arr.length - 1][h] = temp1;
                temp1 = temp2;
            }

// bottom to top
            for (int h = arr.length - 2; h >= 0; h--) {
                temp2 = arr[h][0];
                arr[h][0] = temp1;
                temp1 = temp2;
            }
            printArr(arr);
        }
    }

    private static void printArr(int[][] arr) {
        System.out.println("-------------");
        for (int[] ar : arr) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
    }
}