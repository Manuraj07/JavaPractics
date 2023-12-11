public class WoodCutting {

    public static int findCount(int []ht,int mid)
    {
        int cnt = 0;
        for(int i=0;i<ht.length;i++){
            if(ht[i]>mid){
                cnt = cnt+(ht[i]-mid);
            }
        }
        return cnt;

    }

    public  static  int matchheight(int []arr,int b){
        int maxi = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi)maxi = arr[i];
        }
        int lo = 0;
        int hi = maxi;
        int  mid = 0;
        while (lo<=hi){
            mid = lo+(hi-lo)/2;
            int wc = findCount(arr,mid);
            if(wc == b || lo == mid){
                return mid;
            }
            else if(wc>b)
            {
                lo = mid;
            }
            else {
                hi = mid;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr  ={20,15,10,17};
        int b = 8;
        System.out.println(matchheight(arr,b));

    }
}
