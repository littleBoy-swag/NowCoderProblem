package nowcoder.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(getRes(str));
        }
    }

    private static String getRes(String str) {
        char[] c = str.toCharArray();
        int[] arr = new int[52];
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                arr[c[i] - 65]++;
            }
            if (c[i] >= 'a' && c[i] <= 'z') {
                arr[c[i] - 65]++;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 52; i++) {
            if (arr[i] != 0) {
                sb.append((char) (i + 65)).append(arr[i]);
            }
        }
        return sb.toString();
    }
}
