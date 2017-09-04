package nowcoder.baidu;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }

        int count = 0;
        for (Integer x : set) {
            count++;
            if (count == 3) {
                System.out.println(x);
                break;
            }
        }
        if (count < 3) {
            System.out.println(-1);
        }

    }
}
