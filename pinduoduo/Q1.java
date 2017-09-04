package nowcoder.pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            if (arr[arr.length - 2] * arr[arr.length - 3] > arr[0] * arr[1])
                System.out.println(arr[arr.length - 2] * arr[arr.length - 3] * arr[arr.length - 1]);
            else
                System.out.println(arr[arr.length - 1] * arr[0] * arr[1]);

        }
    }
}
