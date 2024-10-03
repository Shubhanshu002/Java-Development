package Recursion;
import java.util.Scanner;
public class CalculatePower {
    public static int Calcpow(int x,int n){
        if(x==0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        int xpown=Calcpow(x,n-1);
        int fornN=x*xpown;
        return fornN;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The VAlue of X");
        int x=input.nextInt();

        System.out.println("Enter The VAlue of N");
        int n=input.nextInt();
        int sum=Calcpow(x,n);
        System.out.println("The Sum is "+sum);
    }
}
