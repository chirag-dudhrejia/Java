

public class TotalChars {
    public static void main(String[] args)
    {
        int charCount = 0;
        for (int i = 0; i<args.length; i++)
        {
            charCount += args[i].length();
        }

        System.out.println("Total characters : " + charCount);
    }   
}
