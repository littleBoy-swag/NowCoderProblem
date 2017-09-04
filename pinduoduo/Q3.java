package nowcoder.pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] w = new int[m];
            for (int i = 0; i < m; i++) {
                w[i] = sc.nextInt();
            }
            Arrays.sort(h);
            Arrays.sort(w);
            int wj = 0;
            int count = 0;
            for (int i = 0; i < m && wj < n; i++) {
                if (h[i] >= w[wj]) {
                    count++;
                    wj++;
                }
            }
            System.out.println(count);
        }
    }
}
