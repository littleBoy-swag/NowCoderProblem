package nowcoder.haoweilai;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ;
        while (sc.hasNext()) {
            String str = sc.next();
            getLongestNumStr(str);
        }
    }

    public static void getLongestNumStr(String str) {
        char[] ch = str.toCharArray();
        int max = 0, cur = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                cur++;
                max = cur > max ? cur : max;
            } else {
                cur = 0;
            }
        }
        System.out.println(max);
    }
}
