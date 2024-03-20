

public class prime {
    public void n_prime(int first_n) {
        if (first_n > 1) {
            System.out.println("First " + first_n + " prime numbers are : ");
            for (int i = 2; first_n > 0; i++) {
                boolean prime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.print(i + " ");
                    first_n--;
                }
            }
        }
        else{
            System.out.println("Invalid input. Should be atleast 1.");
        }
    }

    public static void main(String[] args) {
        int first_n = Integer.parseInt(args[0]);

        prime prime_obj = new prime();

        prime_obj.n_prime(first_n);
    }
}
