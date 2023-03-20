package Dynamic;
import java.util.*;

public class staircase_iterative {
    
   static int f1(int n)
    {   
        int a1=0,a2=0,a3=0;
        if(n==0)
        return 1;
        if(n==1 || n==2)
        return n;
        
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        
        for(int i=3;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }
        
        return arr[n];
        
        
    }
	public static void main(String[] args) 
	{
	    Scanner sn=new Scanner(System.in);
	   int  n=sn.nextInt();
	    
	    System.out.println(f1(n));
	    }
	
}

