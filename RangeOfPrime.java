import java.util.Scanner;

public class RangeOfPrime {
    /**
     * @param args
     */
    public static void main(String args[])
    {
        System.out.println("Enter the Starting Number: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("Enter the Ending Number: ");
        int end = sc.nextInt();
        int i,j;
        for (i = start; i <= end ; i++)
        {
            if(i <= 1)
            {
                continue;
            }
            for (j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    break;
                }  
            }
            if (i == j)
            {
                System.out.println(i);
            }
        }
    }
    
    
}
