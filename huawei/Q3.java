package nowcoder.huawei;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.trim().split(" ");
            System.out.println(s[s.length - 1].length());
        }
    }
}
