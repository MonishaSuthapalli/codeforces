import java.util.Scanner;

public class Problem1517_A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            solve(n);
        }

    }
    static void solve(long n)
    {
        if(n<2050)
        {
            System.out.println("-1");
            return;
        }
        long res=1;
        long count=0;
        String s= String.valueOf(n);
        long len=s.length();
        long mul=2050*(long)Math.pow(10,len-4);
        res=n-mul;
        while(res>0)
        {
            s= String.valueOf(n);
            len=s.length();
            mul=2050*(long)Math.pow(10,len-4);
            res=n-mul;
            n=res;
            count++;

        }
        if(res==0)
        System.out.println(count);
        else
            System.out.println("-1");

    }
}
