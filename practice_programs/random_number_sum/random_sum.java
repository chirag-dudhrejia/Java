import java.math.*;

public class random_sum {
    public static void main(String[] args)
    {
        double sum = 0;

        while (sum<20) {
            sum += Math.random();
        }

        System.out.println(sum);
    }
}
