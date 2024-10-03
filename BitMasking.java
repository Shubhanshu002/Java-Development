package Methods_Functions;
import java.util.Scanner;
public class BitMasking {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int pos=input.nextInt();
        int bitmask=1<<pos;

        if((bitmask & n)==0){
            System.out.println("Bit was Zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }

}
