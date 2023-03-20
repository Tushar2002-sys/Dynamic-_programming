package Dynamic;


//      Question link : https://www.codingninjas.com/codestudio/problems/frog-jump_3621012?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos
public class frog_jump {
    



    public static int frogJump_1(int n,int arr[],int dp[])
    {
        if(n==0)
        return 0;

        //int f1=Integer.MAX_VALUE;
        int f2=Integer.MAX_VALUE;

        //int count=0;
        
        int f1=Math.abs(arr[n]-arr[n-1]) ;
             int f11;
          if(dp[n-1]==-1)    // means you need to calculate calling recurssion ;
           {
               f11= frogJump_1(n-1, arr,dp);
               dp[n-1]=f11;      // store in array after calculating 
           }
           else // already calculated 
           {
               f11=dp[n-1];
           }

           f1=f1+f11;

        if(n>1)
         {
             f2=Math.abs(arr[n-2]-arr[n]);
             int f22;
             if(dp[n-2]==-1)  // u need to calculate
             { f22=frogJump_1(n-2, arr, dp);
               dp[n-2]=f22;
             }
             else             // already calculated 
             {
                 f22=dp[n-2];
             }

             f2=f2+f22;
         }
        
        dp[n]=Math.min(f1,f2);
        return dp[n];
    }
    public static int frogJump(int n, int arr[]) {

        // Write your code here..
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=-1;
        }
        return frogJump_1(n-1, arr,dp);
        
    }

}
}
