import java.util.Scanner;

public class maxSubArray {
    public static int maxSubArray1(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum>=0){
                sum+=nums[i];
            }
            else
            {
                sum = nums[i];
            }
            if(sum>=maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ss.nextInt();
        }
        int res = maxSubArray1(arr);
        System.out.println(res);
    }
}
