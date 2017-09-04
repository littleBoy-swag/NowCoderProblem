package nowcoder.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            System.out.println(Function(N));
        }
    }

    private static int Function(int n) {
        int[] arr = {1,5,10,20,50,100};
        int len =arr.length;
        int[][] dp = new int[len][n+1];
        Arrays.fill(dp[0],1);
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= n; j++) {
                int m = j/arr[j];
                for (int k = 0; k <= m; k++) {
                    dp[i][j] = dp[i][j]+dp[i-1][j-k*arr[i]];
                }
            }
        }
        return dp[len-1][n];
    }
}
