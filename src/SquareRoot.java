public class SquareRoot {
    public static int Square(int n){
        if(n==1 || n==0)return n;
        int res = 0;
        int lo = 2;
        int hi = n/2;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(mid * mid == n){
                return mid;
            }
            else if(mid * mid <n){
                lo = mid+1;
                res = mid;
            }
            else
            {
                hi = mid-1;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int ans = 23;
        System.out.println(Square(ans));

    }
}
