import java.util.Scanner;

public class RemoveDuplicateArray {
    public static int  Remove(int []arr,int n){
//        int []res = new int[n];
//        int k = 0;
//        res[0] = arr[0];
//        for(int i=1;i<n;i++){
//            if(arr[i] !=arr[i-1]){
//                res[k++] = arr[i];
//
//            }
//        }
//        return res;
        int rd = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[rd] !=arr[i]){
                rd++;
                arr[rd] = arr[i];
            }
        }
        return rd+1;
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int rd = Remove(arr,n);
        for(int i=0;i<rd;i++){
//            if(ans[i]!=0)
            System.out.print(arr[i]+" ");
        }

    }
}
