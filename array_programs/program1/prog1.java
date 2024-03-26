public class prog1 {

    public static void main(String[] args)
    {
        float[] arr = new float [args.length];

        for (int i = 0; i < args.length; i++)
        {
            arr[i] = Float.parseFloat(args[i]);
        }

        float sum = sum(arr);

        float product = product(arr);

        float average = average(arr);

        System.out.println("Sum is : " + sum);
        System.out.println("Product is : " + product);
        System.out.println("Average is : " + average);
    }
    
    public static float average(float[] arr)
    {
        float sum = 0;
        for (float f : arr) {
            sum += f;
        }
        return sum/arr.length;
    }

    public static float sum(float[] arr)
    {
        float sum = 0;
        for (float f : arr) {
            sum += f;
        }
        return sum;
    }

    public static float product(float[] arr)
    {
        float product = 1;
        for (float f : arr) {
            product *= f;
        }
        return product;
    }

}