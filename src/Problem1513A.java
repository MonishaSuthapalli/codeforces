import java.util.Scanner;

public class Problem1513A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            solve(n,arr);
        }
    }

    static void solve(int n,int[] arr) {

        int res=1;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            int num=arr[i];

            if (Math.ceil((double)Math.sqrt(num)) !=
                    Math.floor((double)Math.sqrt(num))){
                flag=1;
                break;


            }
            else
            {
                res=res*num;
                if (Math.ceil((double)Math.sqrt(num)) !=
                        Math.floor((double)Math.sqrt(num))){
                    flag=1;
                    break;
                }


            }


        }

        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");


    }
    }

