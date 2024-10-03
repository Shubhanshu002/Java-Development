package Methods_Functions;
import java.util.Scanner;
public class Array_Search {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }

        System.out.println("Enter the Number to Find");
        int x=input.nextInt();
        int index=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==x)
            {
                index=i;
            }
        }
        System.out.println("Index Position is : "+index);
    }
}
