// problem link :
// https://www.codingninjas.com/codestudio/problems/unbounded-knapsack_1215029?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos&leftPanelTab=1


import java.util.*;

public class unbounded_knapsack {

    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.
        int dp[][]=new int [n][w+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=w;j++)
            {
                dp[i][j]=-1;
            }
        }
        return f1(n-1,w,profit,weight,dp);
    }

    public static int f1(int idx,int wmax,int p[],int w[],int dp[][])
    {
        if(wmax==0)
        return 0;

        if(idx==0)    // means only one element is present 
        {
            if(wmax%w[0]==0)
            {
                int r=wmax/w[0];
                int k=r*p[0];
                return k;

            }
            else 
            return 0;
        }

        if(dp[idx][wmax]!=-1)
        return dp[idx][wmax];

        int not_taken=0+f1(idx-1,wmax,p,w,dp);
        int taken=0;
        if(w[idx]<=wmax)
        taken=p[idx]+f1(idx,wmax-w[idx],p,w,dp);

        return dp[idx][wmax]=Math.max(taken,not_taken);
    }
}

    

