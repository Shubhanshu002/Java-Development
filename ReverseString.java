package String;
import java.util.Scanner;

public class ReverseString{
    public static void Rev(String str)
    {
        String nstr="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.print(nstr);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Rev(str);
    }
}
