package Recursion;
import java.util.Scanner;
public class simple {
    public static int print(int n)
    {
        if(n==0){
            return 0;
        }else
            System.out.print(n);
        return print(n-1);
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        //for(int i=0;i<n;i++)
       print(n);
    }
}
