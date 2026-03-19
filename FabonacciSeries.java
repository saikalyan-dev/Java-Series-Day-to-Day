public class FabonacciSeries
{
    public static void main(String args[])
    {
        int a = 0;
        int b = 1;
        int i;
        System.out.print(a +" ");
        System.out.print(b +" ");
        for (i = 0; i <= 5; i++)
        {
            int c = a + b;
            System.out.print(c +" ");
            a = b;
            b = c;
            
        }
        
    }
}
