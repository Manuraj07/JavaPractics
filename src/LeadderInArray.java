import java.util.Scanner;

public class LeadderInArray {
    public static void OptimiseLeaders(int []arr,int n){
        System.out.print(arr[n-1]+" ");
        int curr = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {

            if(arr[i]>curr){
                curr = arr[i];
                System.out.print(curr+" ");
            }
        }
    }
    public static void LeadersArry(int []arr,int n){
        for(int i=0;i<n;i++){
            boolean isLeader = true;
            for(int j = i+1;j<n;j++){
                if(arr[j]>=arr[i]){
                    isLeader = false;
                    break;
                }

            }
            if(isLeader == true){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
         int n = ss.nextInt();
         int []arr = new int[n];
         for(int i=0;i<n;i++){
             arr[i] = ss.nextInt();
         }
        LeadersArry(arr,n);
        System.out.println("-----------Optimise Code -----------");
         OptimiseLeaders(arr,n);
    }
}
