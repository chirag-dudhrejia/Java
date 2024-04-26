package prog1;

public class Statistics
{
    static void average(double arr[])
    {
        double sum = 0.0;
        double avg;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        avg = sum / arr.length;
        System.out.printf("%.2f\n", avg);
    }
}