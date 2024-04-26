package prog1;
import java.util.*;

public class Prog1 {
    public static void main(String args[])
    {
        // double temp[][] = {
        //     {38, 37, 39, 40, 39, 38, 40},
        //     {37, 36, 40, 40, 38, 37, 41},
        //     {39, 38, 36, 40, 39, 38, 42},
        //     {35, 37, 39, 40, 37, 39, 41}
        // };

        double temp[][] = new double[4][7];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                temp[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < temp.length; i++)
        {
            System.out.print("Average temp of week " + (i+1) + " : ");
            Statistics.average(temp[i]);
        }
        scan.close();
    }
}
