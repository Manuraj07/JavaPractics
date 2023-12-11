import java.util.Scanner;

public class ReverseArray {

    public static void Reverse(int []arr,int n){
        int []res = new int[n];
        int i=0;
        int j = n-1;
        while (i<=j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
//            swap(arr[i],arr[j]);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i] +" ");

        }
        Reverse(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");

        }

    }
}
