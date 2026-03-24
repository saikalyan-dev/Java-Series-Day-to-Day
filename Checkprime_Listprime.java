import java.util.Scanner;
public class Checkprime_Listprime {

    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = reader.nextInt();
        int count = 2;
        if (number <= 1)
        {
            System.out.println("Input error: ");
        }
        else
        {
            while (count < number)
            {
                if (number % count == 0)
                {
                    System.out.println("Its not a prime ");
                    break;
                    
                }
                count++;

            }
            
            
            if (number == count)
            {
                System.out.println("Its a prime: ");
            }
            

        }
        int j;
        for (int i = 0; i < number; i++)
        {
            for (j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    break;
                }

            }
            if (i == j)
            {
                System.out.print(i + " ");
            }
        }
        
       
    }
}