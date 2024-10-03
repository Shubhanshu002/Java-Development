package Methods_Functions;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1=input.nextInt();
        int n2=input.nextInt();
        int gcd=1;
        while(n1!=n2){
            if(n1>n2)
            {
                n1=n1-n2;
            }
            else{
                n2=n2-n1;
            }
        }
        System.out.println("GCD BY Second method is : "+n2);

    }
}
