package Dynamic;

import java.util.*;

public class min_sqre {

    static int min_square(int n,int arr[])
    {
         if(n==0)
         return 0;
         //int ans[]=new int[n];
         int min_step=Integer.MAX_VALUE;
         for(int i=1;i*i<n;i++)
         {      int s=i*i;
                int k;
                if(arr[n-s]==-1)
                { // calculate 
                   k=min_square(n-s, arr);     
                   arr[n-s]=k;                                 
                }
                else   // already calculated 
                {
                    k=arr[n-s];
                }             
            

                if(min_step>k)
                    min_step=k;

         }  // all function calling have been made now return min of all the array         
         
         return 1+min_step;
    }
    
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("enter n :");
        int n=sn.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i]=-1;
        }
        System.out.println(min_square(n,arr));
    }
    
}
