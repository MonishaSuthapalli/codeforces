import java.util.Scanner;

public class Problem_1613A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();


            solve(a,b,c);
        }
    }


    static void solve(int a,int b,int c)
    {
        int sum=a+b+c;
        int val=sum/9;
        if(sum%9!=0||a<val||b<val||c<val)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
