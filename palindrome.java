import java.util.Scanner;
public class palindrome {
    
    public static void main(String args[])
    {
        System.out.println("Enter the word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--)
        {
            reverse = reverse + word.charAt(i);
        }
        if (reverse.equals(word))
        {
            System.out.println("Yes Its a palindrome: ");
        }
        else
        {
            System.out.println("Not a palindrome: ");
        }
    }
}
