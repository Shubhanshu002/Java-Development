package Recursion;
import java.util.Scanner;
public class Fibonacci {
    public static void fib(int a,int b,int n ){
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.print(c);
        fib(b,c,n-1);
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=0,b=1;
        System.out.print(a);

        System.out.print(b);
        fib(a,b,n-2);
        //System.out.println(a);
    }
}
