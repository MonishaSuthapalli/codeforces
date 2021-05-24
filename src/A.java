import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           String s=sc.next();

           solve(s);

        }
    }

     static void solve(String s) {
        int i=0;
        int len=0;
        if(s.length()>2)
            len=(int)Math.sqrt(s.length())+1;
        else
            len=s.length()+1;
       while(i< len)
        {
            String temp= new String();
            temp=s.substring(0, i) + 'a' + s.substring(i);

            StringBuilder real=new StringBuilder(temp);

            String temp2=new String(real.reverse());
            if(temp2.equals(temp))
            {
             i++;
            }
            else
            {
                System.out.println("YES");
                System.out.println(temp);
                break;
            }
            real= null;

        }
       if(i>= len)
           System.out.println("NO");

    }


}