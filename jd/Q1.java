package nowcoder.jd;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 2; i < n; i++) {
                sum += getSum(n, i);
            }
            //不可约减就是求最大公约数
            int r = gcd(sum, n - 2);
            System.out.println(sum / r + "/" + (n - 2) / r);
            sum = 0;
        }
    }

    private static int gcd(int a, int b) {
        int c = a % b;
        int temp = 0;
        if (a < b) {
            temp = b;
            b = a;
            a = temp;
        }
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        return b;
    }

    public static int getSum(int n, int hex) {
        int sum = 0;
        while (n > 0) {
            sum += (n % hex);
            n /= hex;
        }
        return sum;
    }
}
