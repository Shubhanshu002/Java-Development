package Methods_Functions;
import java.util.Scanner;
public class setbit {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int pos=input.nextInt();
        int bitmask=1<<pos;
        int newnumber=bitmask | n;
        System.out.println(newnumber);
    }
}
