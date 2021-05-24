import java.util.Scanner;

public class Problem_978B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (s.contains("xxx")) {
            while (true) {
                s=s.replaceAll("xxx", "xx");
                if(s.contains("xxx"))
                    continue;
                else
                    break;

            }
            System.out.println(n-s.length());

        }
        else
        {
            System.out.println("0");
        }
    }
}