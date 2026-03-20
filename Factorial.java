import java.util.Scanner;
public class Factorial 
{
    public static void main(String args[])
    {
        System.out.println("Enter the Number: ");
        Scanner reader = new Scanner(System.in );
        int num = reader.nextInt();
        int factor = 1;

        for (int i = 1; i <= num; i++)
        {
           factor = factor * i;

        }
        System.out.print(factor);
        
        
    }
}   
