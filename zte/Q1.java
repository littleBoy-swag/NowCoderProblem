package nowcoder.zte;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            isPerfectNum(n);
        }
    }

    private static void isPerfectNum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                list.add(i);
        }
        int count = 0;
        for (Integer num : list
                ) {
            count += num;
        }
        if (count == n) {
            int c = 0;
            for (Integer x :
                    list) {
                c++;
                if (c == list.size())
                    break;
                System.out.print(x + "+");

            }
            System.out.println(list.get(c - 1) + "=" + n);
        }
    }
}
