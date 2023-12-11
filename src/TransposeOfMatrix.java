public class TransposeOfMatrix {
    public static void printMatrix(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static  void transpose1(int [][]arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static int[][] tanspose(int [][]arr){
       int [][]res =new int [arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                res[j][i] = arr[i][j];
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int [][]arr = {
                {1 ,2,3,4},
                {5,6,7,8},
                {8,9,10,11},
                {12,13,14,15}
        };
        printMatrix(arr);
        int [][]ans = tanspose(arr);
        System.out.println();
        printMatrix(ans);

        transpose1(arr);
        System.out.println();
        printMatrix(arr);
    }
}
