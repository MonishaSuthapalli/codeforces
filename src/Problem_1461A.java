import java.util.Scanner;

public class Problem_1461A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            solve(n);
        }
    }
    static void solve(int n)
    {
        String s="";
        int add=n/3;
        int add2=n%3;
        while(add!=0)
        {
            s=s+"abc";
            add--;
        }
        if(add2>0)
        {
            s=s+"a";
            add2--;
        }
        if(add2>0)
        {
            s=s+"b";
            add2--;
        }

        System.out.println(s);

    }
}
