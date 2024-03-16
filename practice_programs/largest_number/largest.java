

public class largest {

    int max_ternary(int n1, int n2, int n3)
    {
        return n1>n2?n1>n3?n1:n3:n2>n3?n2:n3;
    }

    int max(int n1, int n2)
    {
        return n1>n2?n1:n2;
    }

    int max(int n1, int n2, int n3)
    {
        return max(n1, max(n2, n3));
    }

    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        largest obj = new largest();

        System.out.println("Among " + num1 + ", " + num2 + " and " + num3 + " highest is " + obj.max(num1, num2, num3));
    }
}
