package Methods_Functions;
import java.util.Scanner;
public class ClearBit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int pos=in.nextInt();
        int maskbit=1<<pos;
        int not=~(maskbit);
        int newnumber=not & n;
        System.out.println(newnumber);
    }
}
