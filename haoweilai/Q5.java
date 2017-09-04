package nowcoder.haoweilai;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    private static LinkedList<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            getAdd(m, n);

        }
    }

    public static void getAdd(int m, int n) {
        if (m < 1 || n < 1)
            return;
        if (m >= n) {
            list.add(n);
            getAdd(m - n, n - 1);
            list.pop();
            getAdd(m, n - 1);
        } else {
            System.out.print(m);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(" " + list.get(i));
            }
            System.out.println();
        }


    }

}
