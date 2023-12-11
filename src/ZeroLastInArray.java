import java.util.Scanner;

public class ZeroLastInArray {


    public static void ZeroLast(int []arr,int n){

        int nz = 0;
        int z = 0;
        while (nz<n && z<n){

            if(arr[nz]!=0){
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz+=1;
                z+=1;
            }
            else {
                z+=1;
            }

        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");



        }




    }










    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        ZeroLast(arr,n);
    }
}
