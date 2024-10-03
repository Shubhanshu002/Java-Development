package Recursion;
import java.util.Scanner;
public class SumNnatural {
    public static void sumPrint(int i,int n,int sum){
        if(i==n)
        {
            sum+=i;
            System.out.println("Sum is :"+sum);
            return;
        }
        sum+=i;
        sumPrint(i+1,n,sum);
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i=1;
        int sum=0;
        sumPrint(i,n,sum);

    }
}
