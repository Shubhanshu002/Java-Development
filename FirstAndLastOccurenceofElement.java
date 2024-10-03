package Recursion;
import java.util.Scanner;
public class FirstAndLastOccurenceofElement {
    public static int first=-1;
    public static int last=-1;
    public static void occur(String str,int idx,char element)
    {
        if(idx==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current=str.charAt(idx);
        if(current==element)
        {
            if(first==-1)
            {
                first=idx;
            }
            else
                last=idx;
        }
        occur(str,idx+1,element);
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    char element='a';
    //int idx=str.length()-1;
    occur(str,0,element);
    }
}
