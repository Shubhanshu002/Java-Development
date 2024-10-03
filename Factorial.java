package Recursion;
import java.util.Scanner;
public class Factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        int factm1=fact(n-1);
        int fac=n*factm1;
        return fac;

    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=fact(n);
        System.out.println(a);
    }
}
