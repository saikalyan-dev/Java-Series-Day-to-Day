
public class SecondLargest 
{   
    public static void main(String args[])
    {
        int[] arr = {10,11,21,33};
        int largest = arr[0];
        int second = arr[1];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                second = largest;
                largest = arr[i];
            }
            
        }
        System.out.println(second);
    }
    

}