import java.util.Scanner;

public class MedianOfTwoSorted {

    public static int []MergeSortedArray(int []arr1,int n,int []arr2,int m){

        int i=0;
        int j=0;
        int k = 0;
        int []ans = new int[n+m];
        while (i<n && j<n)
        {
            if(arr1[i]<arr2[j]){
                ans[k++] = arr1[i++];

            }
            else
            {
                ans[k++] = arr2[j++];
            }
        }
        while (i<n)
        {
            ans[k++] = arr1[i++];
        }
        while (j<m)
        {
            ans[k++] = arr2[j++];
        }
        return ans;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int []arr1  = new int[n];
        int []arr2 = new int[m];

        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        int []ans = MergeSortedArray(arr1,n,arr2,m);

//        int sz = ans.length;
        if(ans.length%2==0) {
            int sz = ans.length/2;

            System.out.println((ans[sz/2]+ans[sz-1])/2);
        }
        else {
            int sz = ans.length/2;

            System.out.println(ans[sz]);
        }




    }
}
