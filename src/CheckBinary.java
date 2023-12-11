import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static String isBinaryTree(String[] strArr) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String pair : strArr) {
            String[] nodes = pair.split(",");
            String child = nodes[0], parent = nodes[1];

            map.merge(parent, 1, Integer::sum);
            map.merge(child, 1, Integer::sum);

            if (map.get(parent) > 2 || (map.get(child) > 1 && !parent.equals("0"))) {
                return "false";
            }
        }

        return map.values().stream().filter(count -> count == 1).count() == 1 ? "true" : "false";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string pairs separated by spaces: ");
        String[] strArr = scanner.nextLine().split(" ");

        System.out.println(isBinaryTree(strArr));
    }
}
