/**
 * 
 */
import java.util.Scanner;

class prime
{
    public static void main(String args [])
    {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 2;
        if (a == 2)
            {
                System.out.println("Prime Number: ");
            }
            else
            {
                 while( count < a)
        {
            
            if (a % count == 0)
            {
                System.out.println("Not a prime Number: ");
                break;
        
            }
            count++;
            if (a == count)
            {
                System.out.println("Prime number: ");
            }
            

            }
       
        
        }
        
    }
}