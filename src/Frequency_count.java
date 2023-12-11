import java.util.Scanner;

public class Frequency_count {
    public static void Frequency_countInSortedArray(int[] arr, int n) {
        int i = 1;
        int freq = 1;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " -> " + freq);
            freq = 1;
            i++;
        }
        if (i == n || arr[i - 1] != arr[i - 2]) {
            System.out.println(arr[i - 1] + " -> " + freq);
        }
    }

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ss.nextInt();
        }
        Frequency_countInSortedArray(arr, n);
    }
}
