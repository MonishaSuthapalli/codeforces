import java.util.*;

public class Problem1512A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            solve(arr);
        }
    }
    static void solve(int[] arr) {
        int[] b=arr.clone();
        Arrays.sort(arr);
        int res = 0, ans = 0;
        if (arr[0] != arr[1])
            res = arr[0];
        else
            res = arr[arr.length - 1];
        for (int i = 0; i < b.length; i++) {

            if (b[i]==res)
                ans = i;

        }

        System.out.println(ans+1);
    }
}
