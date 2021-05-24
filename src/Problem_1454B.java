import java.util.*;

public class Problem_1454B {
    static int target=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            solve(n,arr);
        }
    }

    static void solve(int n,int[] arr) {
        SortedMap<Integer,Integer> map=new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i]))
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            else
                map.put(arr[i],1);
        }

        int min=0;
        for (Map.Entry entry : map.entrySet()) {
            if(entry.getValue()==Integer.valueOf(1)) {
                target= (int) entry.getKey();
                break;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println(i+1);
                break;
        }


    }
        if(target==0)
            System.out.println("-1");




    }
}


