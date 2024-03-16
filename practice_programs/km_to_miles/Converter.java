

public class Converter {
    public static void main(String[] args)
    {
        float km = Float.parseFloat(args[0]);

        float miles = km / (float)1.609344;

        System.out.println(km + " km = " + miles + " miles.");
    }
}
