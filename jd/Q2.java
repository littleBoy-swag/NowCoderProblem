package nowcoder.jd;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Set<Integer> set = new TreeSet<>();
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int[] arrA = new int[n1];
            for (int i = 0; i < n1; i++) {
                arrA[i] = sc.nextInt();
                set.add(arrA[i]);
            }
            int[] arrB = new int[n2];
            for (int i = 0; i < n2; i++) {
                arrB[i] = sc.nextInt();
                set.add(arrB[i]);
            }

            String str = "";
            for (Integer i : set) {
                str += i + " ";
            }
            str = str.substring(0, str.length() - 1);
            System.out.println(str);


        }

    }
}
