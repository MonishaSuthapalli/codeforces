import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class speedRun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        merge(arr,g);
    }

    static class pair {
        int first;
        char second;

        pair(int first, char second) {
            this.first = first;
            this.second = second;
        }
    }


    static void merge(int[][] v,int g) {

        int ans = 0;
        int count = 0;
        ArrayList<pair> data = new ArrayList<>();


        for (int i = 0; i < v.length; i++) {


            data.add(new pair(v[i][0], 'x'));

            data.add(new pair(v[i][1], 'y'));
        }


        Collections.sort(data, (a, b) -> a.first - b.first);


        for (int i = 0; i < data.size(); i++) {


            if (data.get(i).second == 'x')
                count++;

            if (data.get(i).second == 'y')
                count--;


            ans = Math.max(ans, count);
        }

            if(ans>=g)
                System.out.println("YES");
            else
                System.out.println("NO");

    }
}