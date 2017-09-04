package nowcoder.baidu;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int res = 0;
                int last = arr[0];
                for (int j = 1; j < n - 1; j++) {
                    if (i == j)
                        continue;
                    res += Math.abs(arr[j] - last);
                    last = arr[j];
                }
                res += Math.abs(arr[n - 1] - last);
                ans = Math.min(res, ans);
            }
            System.out.println(ans);
        }

    }
}
