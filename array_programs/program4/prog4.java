

import java.util.Arrays;

public class prog4 {
    public static void main(String[] args)
    {
        int[] arr = new int[args.length];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(args[i]);
        }

        int[] result = oddfirst(arr);

        System.out.print("Output : " + Arrays.toString(result));
    }

    public static int[] oddfirst(int[] arr)
    {
        int[] result = new int[arr.length];
        int j = 0, k = arr.length-1;

        for (int i : arr) {
            if (i % 2 == 0) {
                result[k--] = i;
            }
            else{
                result[j++] = i;
            }
        }
        return result;
    }
}
