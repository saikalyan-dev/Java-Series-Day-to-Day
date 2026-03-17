import java.util.Scanner;
class Sum 
{
    public static void main(String args[])
    {
        System.out.println("Enter the number you like: ");
        Scanner sc = new Scanner(System.in);
        int question = sc.nextInt();
        int answer = 0;
        for (int i = 1; i <= question; i++)
        {
            answer += i;

        }
        System.out.println("The sum of N numbers = "+ answer);

    }
}