import java.util.Scanner;

public class RotateArray {

    public static void rotate_ones(int []arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }


public static void rotate_k_times(int []arr,int k){
        k = k%arr.length;
        if(k<0){
            k+= arr.length;
        }
        for(int i=1;i<=k;i++){
            rotate_ones(arr);
        }
}





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();


        }

        rotate_ones(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


        int k = sc.nextInt();
        rotate_k_times(arr,k);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }






    }
}
