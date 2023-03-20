//               https://www.codingninjas.com/codestudio/problems/maximum-sum-of-non-adjacent-elements_843261?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos&leftPanelTab=1


import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> arr) {
		// Write your code here.
		int n=arr.size();
		
        
		int dp[]=new int[n];
		for(int i=0;i<n;i++)
		{
			dp[i]=-1;
		}

		return f1(arr,n-1,dp);
		
		//return f1(arr,0,n);
	}

	public static int f1(ArrayList<Integer> arr,int n,int dp[])         // recursion form 
	{   
		if(n==0)
		return arr.get(0);

		if(n<0)
	    return 0; 

		if(dp[n]!=-1)    // already calculated 
		{
			return dp[n];
		}

		int pick=arr.get(n) + f1(arr,n-2,dp);   // alternative is acce[ptable 
		int not_pick= 0 + f1(arr,n-1,dp);

		dp[n]=Math.max(pick,not_pick);

		return dp[n];
		
	} 

    // tabulation form 

    public static void f2(ArrayList<Integer> arr)
    {
        int n=arr.length();

        int dp[]=new int[n];
        dp[0]=arr.get(0); 

        for(int i=1;i<n;i++)
        {
             // int pick=arr.get(i)+dp[i-2];      n-2 can be -ve 
             int pick=arr.get(i);
             if(i>1) 
             pick+=dp[i-2];

             int not_pick=dp[i-1];

             dp[i]=Math.max(pick,not_pick);
        }
        return dp[n];
    }


    public static void f3(ArrayList<Integer> arr)
    {
        int n=arr.length();

       int prev_1=arr.get(0),prev_2=0;

        for(int i=1;i<n;i++)
        {
             // int pick=arr.get(i)+dp[i-2];      n-2 can be -ve 
             int pick=arr.get(i);
             if(i>1) 
             pick+=prev_2;

             int not_pick=prev_1;

             int curr_i=Math.max(pick,not_pick);

             prev_2=prev_1;
             prev_1=curr_i;
        }
        return prev_1;
    }
}