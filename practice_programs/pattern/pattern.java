class pattern
{
    public static void main(String[] args)
    {
        int rows = Integer.parseInt(args[0]);
        for (int i = 0; i<rows; i++)
        {
            for (int j = rows-i; j>0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}