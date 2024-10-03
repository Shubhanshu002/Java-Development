package Sorting;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[]={7,8,3,6,9};

        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++) {

                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        for(int t=0;t<arr.length;t++)
            System.out.print(arr[t]+" ");
    }
}
