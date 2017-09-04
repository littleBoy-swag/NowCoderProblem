package nowcoder.jd;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            double[][] dp = new double[n+1][n+1];
            dp[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                dp[i][0] = dp[i - 1][0] * (100.0 - arr[i]) / 100;
                for (int j = 1; j <= i; j++) {
                    dp[i][j] = dp[i - 1][j] * (100.0 - arr[i]) / 100 + dp[i - 1][j - 1] * 1.0 * arr[i] / 100;
                }
            }

            int begin = (3 * n + 4) / 5;
            double res = 0.0;
            for (int i = begin; i <= n; i++) {
                res += dp[n][i];
            }

            System.out.println(String.format("%.5f", res));


        }
    }
}
