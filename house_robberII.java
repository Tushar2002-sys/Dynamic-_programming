import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String arsg[])
    {
        int arr[]={59 ,53, 41, 26, 17, 13, 11};
        System.out.pritnln(houseRobber(arr));
    }

	public static long houseRobber(int[] arr) {
		// Write your code here.		
	    int n=arr.length;
	      
		int dp[]=new int[n];
		for(int i=0;i<n;i++)
		{
			dp[i]=-1;
		}
        boolean taken_last=false;
		return f1(arr,n-1,dp,taken_last);
		
		//return f1(arr,0,n);
	}

	public static int f1(int arr[],int n,int dp[],boolean taken_last)         // recursion form 
	{    

		if(n==0 )  // last one is not taken 
		{
			if(taken_last==true)
	        return 0;
			else 
			return arr[0];
		}

		if(n<0)
	    return 0; 

		if(dp[n]!=-1)    // already calculated 
		{
			return dp[n];
		}
        
		int pick=arr[n] + f1(arr,n-2,dp,true);   // alternative is acce[ptable & 
		int not_pick= 0 + f1(arr,n-1,dp,taken_last);
        
        System.out.println(pick+"               "+not_pick);
		dp[n]=Math.max(pick,not_pick);

		return dp[n];
		
	} 
}