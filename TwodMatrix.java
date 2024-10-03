package Methods_Functions;
import java.util.Scanner;
public class TwodMatrix {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        int c=input.nextInt();

        int [][]arr=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter the number to find Index position");
        int x=input.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==x)
                {
                    System.out.println("Index Position is : "+i+" "+j);
                }
            }
        }
    }

}
