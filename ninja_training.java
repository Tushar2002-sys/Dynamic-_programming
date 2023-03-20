//   Problem Link: https://bit.ly/3F4yl8z


import java.util.*;
public class ninjaTraining {
    public static int ninjaTraining_1(int n, int arr[][]) {
       // int n=arr.length;
        int dp[][]=new int[n][4];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<4;j++)
            {
                dp[i][j]=-1;
            }
        }
        return f1(n-1,3,arr,dp);
        
    }
    public static int f1(int days,int last,int arr[][],int dp[][])
    {   int max_point=0;
        if(days==0)
        {
            for(int task=0;task<3;task++)
            {
                if(task!=last)
                {
                   max_point=Math.max(max_point,arr[days][task]);
                }
            }
            dp[days][last]=max_point;
            return dp[days][last];
        }
        if(dp[days][last]!=-1)
        return dp[days][last];

        for(int task=0;task<3;task++)
        {  
            if(task!=last)
            {
                int point=arr[days][task]+f1(days-1,task,arr,dp);
               // idx=task;
                max_point=Math.max(max_point,point);
            }
        }
        dp[days][last]=max_point;
        return dp[days][last];

    }

}