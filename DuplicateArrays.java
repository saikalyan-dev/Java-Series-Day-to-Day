import java.util.Arrays;
public class DuplicateArrays {
    
    public static void main(String args[])
    {
        int[] unsort = {1,2,2,4,6,7,7,8};
        
        for (int i = 0; i < unsort.length; i++)
        {
            for (int j = i + 1; j < unsort.length; j++)
            {
                if (unsort[i] == unsort[j])
                {
                    
                    unsort[i] = 0;
                }

            }


        }

        System.out.print(Arrays.toString(unsort));
    }
}
