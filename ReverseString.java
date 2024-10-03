package Recursion;
import java.util.Scanner;
public class ReverseString {
    public static void  printrev(String str,int idx){
        if(idx==0)
        {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printrev(str,idx-1);

    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int idx=str.length()-1;
    printrev(str,idx);

    }
}
