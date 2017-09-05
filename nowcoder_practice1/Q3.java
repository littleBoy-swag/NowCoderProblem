package nowcoder.nowcoder_practice1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();
            int count = 0;
            if (c1.length == c2.length) {
                for (int i = 0; i < c1.length; i++) {
                    if ((c1[i] == 'A' && c2[i] == 'T') || (c1[i] == 'T' && c2[i] == 'A') || (c1[i] == 'C' && c2[i] == 'G') || (c1[i] == 'G' && c2[i] == 'C')) {
                    } else {
                        count++;
                    }
                }
            } else {
                return;
            }
            System.out.println(count);
        }
    }
}
