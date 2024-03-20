

public class calculations {

    long factorial(long num)
    {
        if (num<1) {
            return 1;
        }
        return num * factorial(num-1);
    }

    int sumOfDigits(long num)
    {
        long remainder;
        int sum = 0;

        while (num > 0) {
            remainder = num % 10;
            sum += remainder;
            num /= 10;
        }
        return sum;
    }

    int productOfDigits(long num)
    {
        long remainder;
        int product = 1;

        while (num > 0) {
            remainder = num % 10;
            product *= remainder;
            num /= 10;
        }
        return product;
    }

    boolean palindrome(long num)
    {
        long remainder;
        long reverse = 0;
        long temp_num = num;

        while (num > 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        
        if (temp_num == reverse)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args)
    {
        long number = Integer.parseInt(args[0]);

        calculations obj = new calculations();

        System.out.println("Factorial : " + obj.factorial(number));

        System.out.println("Cube : " + (number*number*number));

        System.out.println("Sum of digits : " + obj.sumOfDigits(number));

        System.out.println("Multiplication of digits : " + obj.productOfDigits(number));

        System.out.println("Palindrome? : " + obj.palindrome(number));
    }
}
