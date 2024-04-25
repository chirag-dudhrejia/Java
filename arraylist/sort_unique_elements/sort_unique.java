import java.util.*;

public class sort_unique {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr_list = new ArrayList<>();
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        n = input.nextInt();

        System.out.println("\nEnter elements.");
        for (int i = 0; i<n; i++)
        {
            int temp = input.nextInt();

            if (!arr_list.contains(temp)) {
                arr_list.add(temp);
            }
        }

        Collections.sort(arr_list);

        System.out.println("\n" + arr_list);
        input.close();
    }
}
