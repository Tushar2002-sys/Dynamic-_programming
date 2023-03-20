// Problem Link:https://bit.ly/3KQELfy
import java.util.*;
class cherry_pickup3d
{
    public static void main(String arsg[])
    {
        Scanner sn =new Scanner(System.in);
        int r,c;
        r=sn.nextInt();
        c=sn.nextInt();

        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sn.nextInt();
            }
        } 
        
        // start point of second person (0,c-1)  start point of first person (0,0) 
        f1(0,0,c-1,r-1,c-1,arr)
         
    }
    

    public static int f1(int i,int j1,int j2,int r,int c,int arr[][])
    {  
      // we are taking row of both the person as same as both of them will be in same row at any particular time  
      int max_sum=Integer.MIN_VALUE;
      if(j1>c || j2>c || j1<0 || j2<0)      // out of bound condition  
       return Integer.MIN_VALUE; 

       // we are given to count only one the common cells ;
       if(i==r)     // base condition 
       {
        if(j1==j2)
        return arr[i][j1];
        else 
        return arr[i][j1]+arr[i][j2];
       }  
       // possible moves are (j-1,j,j+1) and with each there is 3 possibilities of second person 
       // so better to use loop 
       for(int dj1=-1;dj1<=1;dj1++)
       {
        for(int dj2=-1;dj2<=1;dj2++)
        {  
            int sum=0;
           if(j1==j2) // next call for the same cell ;
           {
            sum=arr[i][j1];
           }
           else 
           {
            sum=arr[i][j1]+arr[i][j2];
           }

           sum+=f1(i,j1+dj1,j2+dj2,r,c,arr);
           max_sum=Math.max(max_sum,sum);
        }
       }
       return max_sum; 
       // for dynamic dp you can just add new array and store max sum in it and print whenver it is not equal to -1     

       
    }

    
}
