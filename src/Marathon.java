import java.util.Scanner;

public class Marathon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int D=sc.nextInt();
            int d=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            solve(D,d,a,b,c);
        }
    }

    static void solve(int D,int d,int a,int b,int c) {
        int max=D*d;
        if(max>=10&&max<21)
            System.out.println(a);
        else if(max>=21&&max<42)
            System.out.println(b);
        else if(max>42)
            System.out.println(c);
        else
            System.out.println(0);
    }


}