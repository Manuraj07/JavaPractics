import java.util.Scanner;

public class LinearSerch {
    public  static  int Linerserch(int []arr,int n,int key){
        for(int i=0;i<n;i++)
        {
            if(arr[i] ==key )return i;
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
        int ans = Linerserch(arr,n,key);
        System.out.println("The elements are found at "+ans);

    }
}
