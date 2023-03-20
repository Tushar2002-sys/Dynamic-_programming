// Problem Link: https://bit.ly/3t62bqQ


// self method using backtracking with dp unique method 





package Dynamic;
import java.util.*;
public class min_subset_diff {
 
    static ArrayList<ArrayList<Integer>> o1;
    public static void main(String args[])
   {
    ArrayList<Integer> p1=new ArrayList<>();
    int up1[]={1,2,3};
    int tsum=0;
    for(int i=0;i<up1.length;i++)
    {
        tsum=tsum+up1[i];
    }
    System.out.println(subset1(p1,up1,tsum));
   }
   
   
   
   static int  subset1(ArrayList<Integer> p1,int up[],int tsum)
   {
    
    
    if(up.length==0)
    { 
     System.out.println(p1);  // all possible permuattion of arary 
     int n=p1.size();
     int s1=0;
     for(int i=0;i<n;i++)
     {
         s1=s1+p1.get(i);
     }
     int diff=Math.abs(tsum-s1-s1);
     
    return diff;
    }
    
    int left=subset1(p1,Arrays.copyOfRange(up,1, up.length),tsum);  // not taken 
    

    p1.add(up[0]);
    int right=subset1(p1,Arrays.copyOfRange(up,1, up.length),tsum);  // taken first index element   
    int lst_idx=p1.size()-1;  // getting last index ;
    p1.remove(lst_idx);  // backtarcking to previous state of arraylist . 
    
    int min_diff=Integer.MAX_VALUE;
    min_diff=Math.min(left,right);
    
    return min_diff;


   }
    
}
