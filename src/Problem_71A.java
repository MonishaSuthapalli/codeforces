import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Problem_71A {
    static PrintWriter out = new PrintWriter(System.out);
    static FastReader sc=new FastReader();

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
//            int n=sc.nextInt();
//            int[] arr=new int[n];
            String s = new String();
            s = sc.next();
            solve(s);
//
//        }

        }
    }

    static void solve(String s) {
            if(s.length()>10)
            {
               String st= s.substring(0,1)+String.valueOf(s.length()-2)+s.substring(s.length()-1);
                System.out.println(st);
                return;
            }
            else
            {
                System.out.println(s);
            }
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}
