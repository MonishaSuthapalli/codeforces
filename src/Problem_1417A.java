import java.util.Arrays;
import java.util.Scanner;

public class Problem_1417A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }
            solve(arr,n,k);
        }
    }
    static void solve(int[] arr,int n,int k)
    {
        int count=0;
        Arrays.sort(arr);
        for (int i = 1; i <n ; i++) {

            count=count+((k-arr[i])/arr[0]);
        }
        System.out.println(count);
    }
}
