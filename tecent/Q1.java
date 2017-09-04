package nowcoder.tecent;

import java.util.Scanner;

public class Q1 {
    public static final int[] factors = {25 * 25 * 25 + 25 * 25 + 25 + 1, 25 * 25 + 25 + 1, 25 + 1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            System.out.println(encode(str));
        }
    }

    public static int encode(String str) {
        char[] c = str.toCharArray();
        int len = str.length();
        int index = len - 1;
        for (int i = 0; i < len; i++) {
            index += factors[i] * (c[i] - 'a');
        }
        return index;
    }

    public static String decode(int index) {
        String res = "";

        return res;
    }

}
