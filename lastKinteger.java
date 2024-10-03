package String;
import java.util.Scanner;
public class lastKinteger {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();
        int j=arr.length-k;
        for(;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
