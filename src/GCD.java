import java.util.Scanner;

public class GCD {
    public static int gcdOfTwoNum(int a,int b){
        int min = 0;
        if(a<b)min = a;
        else min = b;
        for(int i=min ;i>=1;i--)
        {
            if(a%i ==0 && b%i ==0)
                return i;
        }
        return 1;
    }

    public static int euclideGCD(int a,int b){
        while (a!=b){
            if(a>b)a = a-b;
            else b = b-a;
        }
        return a;
    }

    public static int GCDOtherway(int a,int b){
        while (a!=0 && b!=0){
            if(a>b )a = a%b;
            else  b = b%a;
        }
        if(a!=0)
            return a;
        else return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Ans = gcdOfTwoNum(a,b);
        System.out.println(Ans);
        System.out.println(euclideGCD(a,b));
        System.out.println(GCDOtherway(a,b));

    }
}
