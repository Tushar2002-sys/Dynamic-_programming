package Dynamic;

public class _newFibo_dp {

    static int myXOR(int x, int y)
    {
        return (x | y) &
               (~x | ~y);
    }

    static int newfibo_dp(int a,int b,int n,int arr[])
    {
          if(n==0)
          return a;

          if(n==1)
          return b;

          int x=myXOR(a, b);
          newfibo_dp(b, x, n-1, arr);
    }
    
}
