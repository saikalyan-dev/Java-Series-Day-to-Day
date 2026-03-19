import java.util.Scanner;
public class ArmstrongNumber
{
    public static void main(String args[])
    {
        System.out.println("Enter the Number: ");
        Scanner reader = new Scanner(System.in);
        String num = reader.nextLine();
        int value = 0;
        for (int i = 0; i < num.length(); i++)
        {
            int ch = num.charAt(i) - '0';
            int sum = (int) Math.pow(ch, num.length());
            value = value + sum;
            
        }
        if (value == Integer.parseInt(num))
        {
            System.out.print("Armstrong Number: ");

        }
        else
        {
            System.out.print("Not an Armstrong Number: ");
        }

 
    }
}
