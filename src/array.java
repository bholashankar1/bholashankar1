class TwoDArrayConcept {
    public static void main(String[] args) {
        int[] x = {10, 50};
        System.out.println(x);




        int[][] twoDArray = new int[2][4];
        twoDArray[1][2] = 34;
        twoDArray[0][3] = 64;

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[0].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(i+ "");
        }
    }
}
