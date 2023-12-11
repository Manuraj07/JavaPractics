import java.util.Scanner;

public class PrintAllSubArray {
   public static void printAll(int []arr){
       int n = arr.length;
       for(int size=1;size<=n;size++)
       {
           for(int i = 0;i<=n-size;i++){
               for(int j = i;j<i+size;j++){
                   System.out.print(arr[j]);
               }
               System.out.println();
           }
       }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        printAll(arr);
    }
}
