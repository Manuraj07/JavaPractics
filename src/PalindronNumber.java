import java.util.Scanner;

public class PalindronNumber {
    public static boolean CheckPalindron(int n){
        int temp = n;
        int ans = 0;
        while (n!=0)
        {
            int res = n%10;
            ans = ans*10+res;
            n/=10;
        }
        return temp == ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = CheckPalindron(n);
        System.out.println(b);
    }
}
