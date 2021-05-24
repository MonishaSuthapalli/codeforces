import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_4A {
    static PrintWriter out=new PrintWriter(System.out);
    static FastReader sc=new FastReader();
    public static void main(String[] args) {
        int n=sc.nextInt();
//        while(t-->0)
//        {
//            int n=sc.nextInt();
//            int[] arr=new int[n];
        solve(n);
//
//        }

    }

    static int solve(int n)
    {
        if(n%2==0&&n!=2)
            System.out.println("YES");
        else
            System.out.println("NO");
        return 0;
    }




    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }



}