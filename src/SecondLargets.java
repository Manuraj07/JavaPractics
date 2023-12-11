import java.util.Scanner;

public class SecondLargets {
    public static int SecondLargestFun(int[]arr,int n){
        int maxi = 0;
        int second_maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>maxi)
            {
                second_maxi = maxi;
                maxi = arr[i];
            }
            else if(arr[i]>second_maxi && maxi!=arr[i])
            {
                second_maxi = arr[i];
            }
        }
        return  second_maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = SecondLargestFun(arr,n);
        System.out.println(ans);
    }
}
