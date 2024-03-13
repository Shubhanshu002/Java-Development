import java.util.Scanner;

public class Calculator{
    public static void main(String [] arguments) {
        int operator,n1,n2;

        System.out.println("1 - ADD \n 2 - SUBTRACT\n 3 - MULTIPLY \n 4 - DIVIDE");
        System.out.println("Choose Operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter First Number : ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        n2 = sc.nextInt();

        int result=0;
        switch (operator) {
            case 1:
                result= n1 + n2;
                break;
            case 2:
                result= n1 - n2;
                 break;

            case 3:
                result= n1 * n2;
                break;

            case 4:
                result= n1 / n2;
                break;    
            default:
            System.out.println("Entered Wrong Operator ");
                break;
        }
        System.out.println("Resukt ia : " + result);
    }
}