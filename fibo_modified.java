package Dynamic;
import java.math.BigInteger;
import java.util.*;
public class fibo_modified {

    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter a, b, and n");
        int a=sn.nextInt();
        int b=sn.nextInt();
        int n=sn.nextInt();
        BigInteger a1=BigInteger.valueOf(a);
        BigInteger a2=BigInteger.valueOf(b);
        System.out.print(f2(a1,a2,n));
    }

    static BigInteger f2(BigInteger a,BigInteger b ,int n)
    {
        if(n==0)
        return a;

        if(n==1);
        return b;
        
        BigInteger a1=null,a2=null;
        a1=a;
        a2=b;
        BigInteger c=null;
        for(int i=2;i<=n;i++)
        {
            c=a1.add(a2.pow(2));
            a1=a2;
            a2=c;           
        }

        return c;

    }
    
}
