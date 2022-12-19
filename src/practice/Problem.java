package practice;

public class Problem {
    public static void main(String[] args) {
        String s = "bholashankar";
        char c ='a';
        int count = 0;
        for (int i=0; i< s.length(); i++)
        {
            if(s.charAt(i) == c)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
