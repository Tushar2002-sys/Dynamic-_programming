package Dynamic;

public class min_step 
    
{   
   static int f1(int n,int arr[])
    {   int a1=Integer.MAX_VALUE,a2=Integer.MAX_VALUE,a3=Integer.MAX_VALUE;
        if(n==1)
        return 0;
        
        if(arr[n-1]==-1)
        {
         a1=f1(n-1,arr);
         arr[n-1]=a1;
        }
        else 
        a1=arr[n-1];
        
        
        
        if(n%2==0) 
        {
            if(arr[n/2]==-1)
            {
            a2=f1(n/2,arr);
            arr[n/2]=a2;
            }
            else
            a2=arr[n/2];
        
        }
        
        if(n%3==0)
        {
               if(arr[n/3]==-1)
               {
                a3=f1(n/3,arr);
                arr[n/3]=a3;
               }
               else
               a3=arr[n/3];
        
        }
        
        
        return 1+Math.min(a1, Math.min(a2,a3));
        
    }
	public static void main(String[] args) 
	{
	    Scanner sn=new Scanner(System.in);
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
