package nowcoder.yy;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            //todo
            int low = getLowNum(arr, target, n);
            int high = getHighNum(arr, target, n);

            System.out.println("[" + low + "," + high + "]");

        }
    }

    private static int getHighNum(int[] arr, int target, int n) {
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        int record = -1;
        while (start <= end) {
            if (arr[mid] <= target) {
                if (arr[mid] == target)
                    record = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        if (record == -1)
            return -1;
        return end;
    }

    private static int getLowNum(int[] arr, int target, int n) {
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        int record = -1;
        while (start <= end) {
            if (arr[mid] == target)
                record = mid;
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        if (record == -1)
            return -1;
        return start;
    }
}
