import java.util.Scanner;

public class Problem_1454A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i+1;
            }

            solve(n,arr);
        }
    }

    static void solve(int n,int[] arr) {
        for(int i=1;i<n;i++)
        System.out.println(arr[i]);
        System.out.println(arr[0]);
    }


}