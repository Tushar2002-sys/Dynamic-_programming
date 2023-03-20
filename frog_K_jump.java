import java.util.*;

public class frog_K_jump {
    
    public static int frogJump_k(int n,int arr[],int dp[],int i,int k)
    { 
        if(i==n)
        return 0;
        
        int min=Integer.MAX_VALUE;
        for(int j=i+1;j<k;j++)
        {   if(i+j>n)
            break; 

            int cost=Math.abs(arr[i]-arr[j]) + frogJump_k(n, arr, dp, i+j, k);
            if(cost>min)
            min=cost;
        } 
        return min;


    }


    public static int frog_K_jump_memo(int n ,int arr[],int dp[],int i,int k)
    {
            if(i==n)
            return 0;
            int min=Integer.MAX_VALUE;
            for(int j=i+1;j<n;j++)
            {   
                if(i+j>n)
                break ;

                int cost=0;
                if(dp[i+j]==-1)   // need to calculate  
                {    cost=Math.abs(arr[i]-arr[j]);
                    cost=cost+frog_K_jump_memo(n, arr, dp, i+j, k);   // value calculated  
                    dp[i+j]=cost ;
                }
                else              // already calculated 
                {
                    cost=dp[i+j];
                } 
               min=Math.min(min,cost);
            }
            return min;
    }

    public static int f2(int n,int arr[],int k)
    {   int dp[]=new int[n];
        
        for(int i=0;i<n;i++)
        dp[i]=-1;

        return frogJump_k(n-1, arr,dp,0,k);
    }

    
}
