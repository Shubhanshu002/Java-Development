import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class sss {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []ar=new int[25];
        for(int i=0;i<n;i++)
        {
            ar[i]=in.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(ar[i]==ar[j])
                {
                    count++;
                }

            }
            if(count>=max)
            {
                max=count;
            }

        }
        System.out.println(max);
    }

}
