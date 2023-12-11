import java.util.Scanner;

public class DigitSum {
    public static int CountDigit(int n)
    {
        int cnt = 0;
        while(n!=0){
            int rem = n%10;
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = CountDigit(n);
        System.out.println(count);
    }
}
