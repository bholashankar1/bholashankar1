import assignment1.Utility;

public class day1 {

    public static void main(String[] args) {


        int n, h_cnt = 0, t_cnt = 0;
        double heads, tails;
        Utility u = new Utility();


        System.out.print("enter no. of times you want to flip the coin: ");
        n = u.inputInteger();


        for (int j = 0; j < n; j++) {
            double random = Math.random();
            if (random < 0.5)
                t_cnt++;
            else
                h_cnt++;
        }

        heads = h_cnt / (double) n * 100;
        tails = t_cnt / (double) n * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");

    }

}