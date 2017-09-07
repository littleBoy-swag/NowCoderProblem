package nowcoder.yy;

import java.util.HashSet;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String sub = str.substring(1, str.length() - 1);
            String[] arr = sub.split(",");
            System.out.println(getMaxCount(arr));
        }
    }

    private static int getMaxCount(String[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int input = Integer.valueOf(arr[i]);
            set.add(input);
            if (input < min) {
                min = input;
            }
            if (input > max) {
                max = input;
            }
        }
        int count = 1;
        int maxCount = 1;
        for (int i = min + 1; i <= max; i++) {
            if (set.contains(i)) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
