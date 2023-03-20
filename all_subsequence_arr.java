package Dynamic;
import java.util.*;
public class all_subsequence_arr {

        public static void main(String args[])
        {
            int arr[]={1,2,3,4};
            ArrayList<Integer> a1=new ArrayList<>();
            f1(" ",arr.length-1,arr);

        }

        public static void f1(String ans,int idx,int arr[])
        {   
            
            if(idx==-1)
            {
                System.out.println(ans);
                return ;
            }
            // 2 ways either take or not 
             
            // did't taken             
            f1(ans,idx-1,arr);

            //  taken
            
            f1(ans+""+arr[idx],idx-1,arr);
           
            

        }
    
}

