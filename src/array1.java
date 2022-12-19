public class array1 {
    public static void main(String[] args) {
         int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
         printArray(arr);
        System.out.println("--------------");
         for (int i =0; i< arr.length /2; i++){
             for (int  j = 0; j< arr.length -1; i++){
                 int temp = arr[j][arr.length -1 -i];
                 arr[j][arr.length -1 -i]=arr[j][i];
                 arr[j][i]=temp;
             }
         }
         printArray(arr);
    }
    private static void printArray(int[][] arr){
     for (int[] ar: arr){
         for (int i : ar){
             System.out.print(i+" ");
         }
       }
    }
}
