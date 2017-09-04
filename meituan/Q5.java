package nowcoder.meituan;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();//abcdefg
            String s2 = sc.next();//gcdemf
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            int max = 0;
            String res = "";
            for (int i = 0; i < c1.length; i++) {
                int m = 0;
                int k = i;
                String s = "";
                while (m < c2.length) {
                    if (c1[k] == c2[m]) {
                        s += c1[k];
                        m++;
                        k++;
                    } else {
                        if (m > max) {
                            max = m;
                            res = s;
                            continue;
                        }
                        continue;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
