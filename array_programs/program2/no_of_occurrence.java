import java.util.*;

public class no_of_occurrence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number if elements in an array : ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("\nEnter Elements.");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nWant to search number of occurrence of : ");
        int key = sc.nextInt();

        int occurrence = count(arr, key);

        System.out.println("\nNumber of times " + key + " occurrs : " + occurrence);
    }

    public static int count(int[] arr, int key)
    {
        int count = 0;

        for (int i : arr) {
            if (key == i) {
                count++;
            }
        }
        return count;
    }
}
