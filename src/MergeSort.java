import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {


    public static void mergeArr(int []arr,int low,int mid,int high)
    {
        ArrayList<Integer>vec = new ArrayList<Integer>();
        int left = low;
        int right = mid+1;
//        vector<int>vec;

        while (left<=mid && right<=high)
        {
            if(arr[left] < arr[right]){

                vec.add(arr[left]);
                left++;
            }
            else{
                vec.add(arr[right]);
                right++;

            }

        }
        while (left<=mid)
        {
            vec.add(arr[left++]);
        }


        while (right<=high)
        {
            vec.add(arr[right++]);
        }

        for(int i=low;i<=high;i++)
        {
            arr[i] = vec.get(arr[i-low]);
        }

    }
    public static void ms(int []arr,int low,int high)
    {
        if(low >= high)return;
        int mid = low+(high-low)/2;
        ms(arr,low,mid);
        ms(arr,mid+1,high);
        mergeArr(arr,low,mid,high);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = n-1;
        ms(arr,low,high);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


}
