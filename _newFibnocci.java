package Dynamic;

import java.util.*;

  
//  using iterative recurssion it is solved 
// advanage :  linear time complexity and less space complexity comparative to dynamic recurssive method . 



public class _newFibnocci {
    /* package codechef; // don't place package name! */

    static int myXOR(int x, int y)
    {
        return (x | y) &
               (~x | ~y);
    }

    static int new_fibo(int a,int b,int n)
    {
        int arr[]=new int[n+1];
		arr[0]=a;
		arr[1]=b;
		for(int i=2;i<=n;i++)
		{
		    int c=myXOR(arr[i-1], arr[i-2]);
		    arr[i]=c;
		}
		return arr[n];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
        Scanner sn=new Scanner(System.in);
        int len=sn.nextInt();
        while(len>0)
        {len--;
        int a=sn.nextInt();    // enter first no. of series 
        int b=sn.nextInt();    // enter second no of series
        int n= sn.nextInt();   // nth element whose value you have to find 
		System.out.println(new_fibo(a,b,n));
        }
		
	}
}

    

