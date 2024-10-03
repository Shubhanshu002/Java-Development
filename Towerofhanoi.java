package Recursion;

public class Towerofhanoi {
    public static void hanoi(int n,String src,String helper,String Dest){
        if(n==1)
        {
            System.out.println("Move disk "+n+" from "+src+" to "+Dest);
            return;
        }
        hanoi(n-1,src,Dest,helper);
        System.out.println("Move disk "+n+" from "+src+" to "+Dest);
        hanoi(n-1,helper,src,Dest);
    }
    public static void main(String[] args ){
    int n=3;
    hanoi(n,"A","B","C");
    }
}
