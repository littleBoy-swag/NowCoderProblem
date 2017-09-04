package nowcoder.haoweilai;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] num = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                num[i] = Integer.parseInt(s[i]);
            }
            Arrays.sort(num);
            System.out.println(num[num.length / 2]);
        }
    }
}
