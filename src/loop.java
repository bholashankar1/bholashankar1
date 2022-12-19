class loopconcepts {
    public static void main(String[] args) {

        int value = 56;
        for (int i = 2; i <= 56; i++) {
            if (value % i == 0) {
                if (i % 2 == 0) {
                    System.out.println(i + "\t");
                }
            }
        }
    }
}
