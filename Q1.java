package Methods_Functions;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("GCD is "+gcd);
    }
}
