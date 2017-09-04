package nowcoder.jd;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
//        System.out.print(12^4);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String num1 = sc.next();
            String num2 = sc.next();
            int n1 = getNum(num1);
            int n2 = getNum(num2);
            System.out.println(n1 ^ n2);
        }
    }

    private static int getNum(String num1) {
        int res = 0;
        char[] c = num1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            res *= 2;
            res += c[i] - '0';
        }
        return res;
    }
}
