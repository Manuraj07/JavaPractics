import java.util.Scanner;

public class NumberLesserOrequalto {
    public  static int Ans(int []arr,int n ,int key) {
        int lo = 0;
        int hi = n - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = (lo+hi)/2;
            if (key == arr[mid]) {
                while (mid+1<n &&arr[mid+1] ==key ){
                    mid++;
                }
                break;
            } else if (key < arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        if(arr[mid]>key){
            return mid;
        }
        else {
            return  mid+1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)arr[i] = sc.nextInt();
        int key = sc.nextInt();
        int ans = Ans(arr,n,key);
        System.out.println(ans);

    }
}
