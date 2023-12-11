import java.util.Scanner;

public class BinarySerch {
    public static int BinSerch(int []arr,int n,int key){

        int lo = 0;
        int hi = n-1;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == key)return mid;
            else if(key>mid){
                lo = mid+1;
            }
            else
            {
                hi = mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int ans = BinSerch(arr,n,key);
        System.out.println(ans);
    }
}
