package Dynamic;

public class equal_sum_subset {
    
    public static boolean canPartition(int[] arr, int n) {
		// Write your code here.
		int s=0;
		
		for(int i=0;i<arr.length;i++)
		{
			s=s+arr[i];
		}
		if(s%2==1)  // id sum is even 
		return false ;
		s=s/2;

		int dp[][]=new int[n][s+1];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=s;j++)
			{
				dp[i][j]=-1;
			}
		}

		return f1(arr,s,n-1,dp);
	}

	public static boolean f1(int arr[],int target,int idx,int dp[][])
	{   
		if(target==0)
		return true; 

		if(idx==0)
		return (arr[0]==target);
        


		if(dp[idx][target]!=-1)     // value is present in dp
		{
			if(dp[idx][target]==0)  // can be either true or false
			return false;
			else
			return true;
		}
        
		// taken 
		boolean taken=false; 

		if(target>=arr[idx])
		{
			taken=f1(arr,target-arr[idx],idx-1,dp);
		}
		 

		// not taken 
		boolean not_taken=f1(arr,target,idx-1,dp);

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