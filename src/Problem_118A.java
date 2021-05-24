import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem_118A {

    public static void main(String[] args) throws IOException {
        PrintWriter w = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        s=s.replaceAll("a","");
        s=s.replaceAll("e","");
        s=s.replaceAll("i","");
        s=s.replaceAll("o","");
        s=s.replaceAll("u","");
        s=s.replaceAll("y","");
        char dot='.';
        String res="";
        for(int i=0;i<s.length();i++)
            res=res+dot+s.charAt(i);
        System.out.println(res);

    }

}
