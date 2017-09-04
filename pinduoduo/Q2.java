package nowcoder.pinduoduo;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            int m = s1.length();
            int n = s2.length();
            int[] res = new int[m + n];
            char[] c1 = new StringBuilder(s1).reverse().toString().toCharArray();
            char[] c2 = new StringBuilder(s2).reverse().toString().toCharArray();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    res[i + j] += (c1[i] - '0') * (c2[j] - '0');
                }
            }
            for (int i = 0; i < m + n - 1; i++) {
                res[i + 1] += res[i] / 10;
                res[i] %= 10;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m + n; i++) {
                sb.append(res[i]);
            }
            String result = sb.toString();
            StringBuilder finalRes = new StringBuilder();
            char[] ch = result.toCharArray();
            if (ch[ch.length - 1] == '0') {
                for (int i = 0; i < result.length() - 1; i++) {
                    finalRes.append(ch[i]);
                }
                System.out.println(finalRes.reverse().toString());
            } else {
                System.out.println(Long.valueOf(sb.reverse().toString()));
            }
        }
    }
}
