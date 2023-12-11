import java.util.Scanner;
public class PrintAllSubstring {
    public static void PrintAll(String str){
        int n = str.length();
        for(int size=1;size<=n;size++)
        {
            for(int i = 0;i<=n-size;i++){
                for(int j = i;j<i+size;j++){
                    System.out.print(str.charAt(j));
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        PrintAll(str);
    }
}
