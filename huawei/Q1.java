package nowcoder.huawei;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int res = 1;
            for (int i = 0; i < m; i++) {
                res *= m;
            }
            System.out.println(res - m + 1);
        }
    }
}
