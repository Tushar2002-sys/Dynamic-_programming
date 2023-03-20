//Problem link :
// https://www.codingninjas.com/codestudio/problems/subset-sum-equal-to-k_1550954?leftPanelTab=1&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos
//
package Dynamic;
import java.util.*;

public class target_idx {
    public static void main(String args[])
    {  Scanner sn=new Scanner(System.in);
       
        // Write your code here.
        int dp[][]=new int[n][s+1];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=s;j++)
			{
				dp[i][j]=-1;
			}
		}

        return f1(n-1,s,arr,dp);
    }
    public static boolean f1(int idx,int target,int arr[],int dp[][])
    {
        if(target==0)
        return true;

        if(idx==0)
        return (arr[0]==target);
      
        // check dp[] 
        if(dp[idx][target]!=-1)     // value is present in dp
		{
			if(dp[idx][target]==0)  // can be either true or false
			return false;
			else
			return true;
		}
       
       
        boolean not_taken=f1(idx-1,target,arr,dp);

        boolean taken=false;

        if(target>=arr[idx])
        taken=f1(idx-1,target-arr[idx],arr,dp);
        
        

       if(taken==true || not_taken==true)
		{   
			dp[idx][target]=1;
			return true;
		}
		else
		{
			dp[idx][target]=0;
		    return false;
		}
    }

    
}
