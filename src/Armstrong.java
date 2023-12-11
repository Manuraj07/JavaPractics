import java.util.Scanner;

public class Armstrong {
    public static int countDigit(int n){
        int cnt = 0;
        while(n!=0){
            n=n%10;
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public static boolean Check(int n){
        int temp = n;
        int ans = 1;
        int len = countDigit(n);
        while(n!=0){
            int rem = n%10;
//            ans+= rem*rem*rem;
            ans+= Math.pow(rem,len);
            n/=10;

        }
        if(temp == ans)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 371 // 153 ->> true
        boolean b = Check(n);
        System.out.println(b);
    }
}
