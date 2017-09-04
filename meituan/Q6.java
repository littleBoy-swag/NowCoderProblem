package nowcoder.meituan;

import java.util.Scanner;
import java.util.TreeSet;

public class Q6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 8, 9};
        int[] arr2 = {2, 6, 7, 10, 12, 13, 15};
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer i : arr1) {
            set.add(i);
        }
        for (Integer i : arr2) {
            set.add(i);
        }

        int count = 1;
        System.out.print("[");
        for (Integer i : set) {
            if (count == set.size()) {
                System.out.println(i + "]");
                break;
            } else {
                System.out.print(i + ",");
                count++;
            }
        }
    }
}
