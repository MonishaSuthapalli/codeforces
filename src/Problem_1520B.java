
import java.util.Scanner;

public class Problem_1520B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
           int n=sc.nextInt();

           solve(n);
        }

    }
    public static void solve(int n) {
        if(n<=9)
        {
            System.out.println(n);
            return;
        }

        String str=String.valueOf(n);

        String str1=str.substring(0,1);

        int firstD=Integer.parseInt(str1);
        int res=0;
        int len=str.length();

        String checkLEN = new String(new char[len]).replace("\0", str1);
        int checklen=Integer.parseInt(checkLEN);

        if(n<checklen)
        {
            len=len-1;
            res=(9*len);
        }
        else
            res=(9*len)-(9-firstD);
        System.out.println(res);
    }
}
