import java.util.Scanner;

public class CoderByte {
    public static  String Ans(String str)
    {
        int cnt = 1;
        String st = "";
        int n = str.length();
        for(int i=0;i<n-1;i++)
        {
            if(str.charAt(i)== str.charAt(i+1))
            {
                cnt++;
            }
            else {
                st+= cnt+""+str.charAt(i);
                cnt = 1;
            }
        }
        st+=cnt+""+str.charAt(n-1);
        return st;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = Ans(str);
        System.out.println(ans);


    }
}
