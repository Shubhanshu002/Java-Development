package String;
import java.util.Scanner;
public class VowelCount {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i'||ch=='o'||ch=='u')
                count++;

            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                count++;
        }
        System.out.print(count);
    }
}
