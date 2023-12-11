import java.util.Scanner;

public class LCM {

    public static int euclidGCD(int a,int b){
        while (a!=0 && b!=0){
//            System.out.println("a = "+a+" b = "+b);
            if(a>b){
                a = a%b;
            }
            else {
                b = b%a;
            }
        }
//        System.out.println("a = "+a+"b = "+b);
        if(a!=0)return a;
        else return b;
    }
    public static int Lcm_of_twoNumber(int a,int b){
        int res = Math.max(a,b);
        while(true){
            if(res%a == 0 && res%b == 0)break;
            res++;
        }
        return res;
    }

    public static int OptimiseLCM(int a,int b){
        return (a*b)/(euclidGCD(a,b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Lcm_of_twoNumber(a,b));
        System.out.println("........Optimise Code.......");
        System.out.println(OptimiseLCM(a,b));
    }
}
