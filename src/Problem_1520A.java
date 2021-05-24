import java.util.HashMap;
import java.util.Scanner;

public class Problem_1520A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String st=sc.next();
            solve(n,st);
        }

    }
    public static void solve(int n,String st)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(map.containsKey(ch))
            {
                if(st.charAt(i)!=st.charAt(i-1))
                {
                    System.out.println("NO");
                    return;
                }
            }
            else
            {
                map.put(ch,i);
            }
        }
        System.out.println("YES");

    }
}
