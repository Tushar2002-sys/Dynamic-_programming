// https://www.codingninjas.com/codestudio/problems/number-of-subsets_3952532?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos

package Dynamic;
import java.util.*;
public class no_of_subset_withsum_k {
    
        public static int findWays(int num[], int tar) {
            // Write your code here..
            int dp[][]=new int[num.length][tar+1];
            for(int i=0;i<num.length;i++)
            {
                for(int j=1;j<=tar;j++)
                {
                    dp[i][j]=-1;
                }
            }
            return f1(num,tar,num.length-1,dp);
        }
        public static int f1(int arr[],int target,int idx,int dp[][])
        {
            if(target==0)
            return 1;
    
    
            if(idx==0)
            {
                if(target==arr[0])
                return 1;
                else
                return 0;
    
            }
    
            if(dp[idx][target]!=-1)
            return dp[idx][target];
    
            int not_taken=f1(arr,target,idx-1,dp);
            int taken=0;
            if(arr[idx]<=target)  
            {     taken=f1(arr,target-arr[idx],idx-1,dp);
            }
    
            dp[idx][target]=taken+not_taken;
    
            return dp[idx][target];
        }
    }