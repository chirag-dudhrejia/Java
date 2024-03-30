

public class smallest {

    int small(int n1, int n2, int n3)
    {
        return n1>n2?n3>n2?n2:n3:n3>n1?n1:n2;
    }

    int small(int n1, int n2)
    {
        return n1>n2?n2:n1;
    }

    int minimum(int n1, int n2, int n3)
    {
        return small(n1, small(n2, n3));
    }

    public static void main(String[] args)
    {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        smallest obj = new smallest();

        System.out.println("Smallest of " + n1 + ", " + n2 + " and " + n3 + " is " + obj.small(n1, n2, n3));
        System.out.println("Smallest of " + n1 + ", " + n2 + " and " + n3 + " is " + obj.minimum(n1, n2, n3));
    }
}
