import java.util.Scanner;

public class DigitAllSum {
    public static int Sum(int n){
//        int cnt = 0;
//        while(n!=0){
//            n/=10;
//            cnt++;
//        }
//        return cnt;
        int sum = 0;
        while (n!=0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));

    }
}
