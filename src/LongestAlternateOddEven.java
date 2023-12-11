import java.util.Scanner;

public class LongestAlternateOddEven {

    public static int OptimiseCodeLongestOddEven(int []arr,int n)
    {
        int count = 1;
        int maxcount = 1;
        for(int i=1;i<n;i++){
            if(arr[i]%2 == 0 && arr[i-1]%2 !=0  || arr[i]%2!=0 && arr[i-1]%2==0){
                count++;
                maxcount = Math.max(count,maxcount);

            }
            else
            {
                count = 1;
            }
        }
        return maxcount;
    }
    public static  int LongestOdd_eve(int []arr,int n)
    {
        int maxcount = 0;
        for(int i=0;i<n;i++){
            int cnt = 1;
            for(int j=i+1;j<n;j++){
                if(arr[j]%2 == 0 && arr[j-1]%2 !=0  || arr[j]%2!=0 && arr[j-1]%2==0){
                    cnt++;

                }
            }
            maxcount = Math.max(maxcount,cnt);
        }
        return maxcount;
    }
public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ss.nextInt();
        }
        int res = LongestOdd_eve(arr,n);
    System.out.println(res);
    int res1 = OptimiseCodeLongestOddEven(arr,n);
    System.out.println(res1);
    }
}
