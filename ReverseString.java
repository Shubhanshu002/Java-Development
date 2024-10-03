package Methods_Functions;
import java.util.Scanner;
public class ReverseString {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str;
        str=in.next();

        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length()/2;i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontchar = sb.charAt(front);
            char Backchar = sb.charAt(back);

            sb.setCharAt(front, Backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}
