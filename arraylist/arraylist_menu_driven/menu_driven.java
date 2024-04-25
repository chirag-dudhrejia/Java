import java.util.*;

public class menu_driven {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr_list = new ArrayList<>();
        int option = -1;


        while (option != 0) {
            
            System.out.println("\nChoose task to perform : ");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("0. Exit.");
            option = input.nextInt();

            if (option == 1) {
                System.out.println("\nValue you want to add : ");
                arr_list.add(input.nextInt());
                System.out.println("Added.");
            } 
            else if (option == 2) {
                System.out.println("Value you want to remove : ");
                int to_remove = input.nextInt();

                if (arr_list.contains(to_remove)) {
                    arr_list.remove(Integer.valueOf(to_remove));
                    System.out.println("Removed");
                }
                else {
                    System.out.println("Not Found");
                }
            }
            else if (option == 3) {
                System.out.println("\nArray List : " + arr_list);
            }
            
        }
        input.close();
    }
}
