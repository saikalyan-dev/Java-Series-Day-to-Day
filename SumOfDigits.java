import java.util.Scanner;
public class SumOfDigits {
    public static void main(String args[ ])
    {
        System.out.println("Enter Starting Number: ");
        Scanner reader = new Scanner(System.in);
        int start = reader.nextInt();
        System.out.println("Enter Ending Number: ");
        int end = reader.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
