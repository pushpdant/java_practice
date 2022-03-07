import java.util.*;

public class Random_number{

    public static void main(String args[])
    {
        int array[]=new int[6],i,j;
        int sum=0;
        Random r=new Random();
        
        
        for(i=0;i<6;i++)
        {
            array[i]=r.nextInt(10);
        }

        for(i=0;i<6;i++)
        {
            System.out.println(array[i]);
        }

        for(int num:array)
        {
            sum+=i;
        }
        System.out.println(sum);


        
    }
    
}