import java.util.Scanner;

public class TrailingZero {
    public static int zeroCountlastInFactorial(int n){
        int res = 0;
        int powOf5 = 5;
        while (n>=powOf5) {
            res = res+(n/powOf5);
            powOf5 = powOf5*5;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println(zeroCountlastInFactorial(n));
    }
}
