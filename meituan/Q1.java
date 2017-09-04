package nowcoder.meituan;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(getKinds(n));
        }
    }

    private static int getKinds(int n) {
        if (n == 1)
            return 1;
        return 2 * getKinds(n - 1);
    }
}
