public class Day3 {
    public static void main(String[] args) {
        int evenCount = 0;
        int number = 1;
        while (evenCount < 50)
            if (number % 2 == 0) {
                int factorCount = 0;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        factorCount++;
                    }
                }
                if (factorCount > 3) {
                    evenCount++;
                    System.out.println(number);
                }
            }
        number++;
    }
}