

class fibonacci
{

    public void fib(int first_n)
    {
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.print("First 15 fibonacci numbers : " + a + " ");
        while (0 < first_n--) {
            System.out.print(c + " ");

            c = a + b;
            a = b;
            b = c;
        }
    }


    public static void main(String[] args)
    {
        int first_n = Integer.parseInt(args[0]);

        fibonacci fib_obj = new fibonacci();
        fib_obj.fib(first_n);
    }
}