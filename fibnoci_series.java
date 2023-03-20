package Dynamic;
import java.util.*;
public class fibnoci_series {

	public static void main(String[] args) 
	{   
	    Scanner sn=new Scanner(System.in);
        System.out.print("ENtre value of n :");
	    int n=sn.nextInt();
	    
	   
	    for(int i1=0;i1<=n;i1++)
        {
	      int dp[]=new int[n+1];
	      for(int i=0;i<=n;i++)
	      dp[i]=-1;
	    
	     System.out.print(fibnoci1(i1,dp)+"  ");
        } 

	}
	
	static int fibnoci1(int n,int dp[])
	{   
	    if(n==0||n==1)
	    dp[n]=n;     
	    
	    if(dp[n]!=-1)
	    return dp[n]; 
	    
	    dp[n]= fibnoci1(n-1,dp)+fibnoci1(n-2,dp);
	    
	    return dp[n];
	}
}
