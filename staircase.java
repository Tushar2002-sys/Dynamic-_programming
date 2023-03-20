/*
 * The first and the only line of input contains an integer value, 'n', denoting the total number of steps.
   Output format :
   Print the total possible number of ways.
 */

public class staircase 
{   
   static int f1(int n,int arr[])
    {   
        int a1=0,a2=0,a3=0;
        if(n==0)
        return 1;
        if(n==1 || n==2)
        return n;
        
        
        
        
        
        if(arr[n-1]==-1)
        {
            a1=f1(n-1,arr);
            arr[n-1]=a1;
            
        }else a1=arr[n-1];
        
        if(arr[n-2]==-1)
        {
           a2=f1(n-2,arr);
           arr[n-2]=a2;
        }else 
        a2=arr[n-2];
        
           if(arr[n-3]==-1)
           { a3=f1(n-3,arr);
             arr[n-3]=a3;
           }
           else 
           a3=arr[n-3];
            
        
    
        
        return a1+a2+a3;
    }
	public static void main(String[] args) 
	{
	    Scanner sn=new Scanner(System.in);
	    for(int k=0;k<5;k++){
	    int n=sn.nextInt();
	    int arr[]=new int[n+1];
	    for(int i=0;i<n+1;i++)
	    {
	        arr[i]=-1;
	    }
	    System.out.println(f1(n,arr));
	    }
	}
}

    

