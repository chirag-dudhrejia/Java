

public class prog3 {
    public static void main(String[] args)
    {
        int[] arr = new int[args.length];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Minimum Value is : " + min(arr));
        System.out.println("Maximum Value is : " + max(arr));
    }

    public static int min(int[] arr)
    {
        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
    public static int max(int[] arr)
    {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
