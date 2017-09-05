package nowcoder.nowcoder_practice1;


import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if ((arr[n - 1] - arr[0] <= n) && !anyRepeat(arr)) {//这种情况下有解
                boolean isPrint = false;
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i + 1] - arr[i] == 2) {//此时只需要输出一个数
                        System.out.println(arr[i] + 1);
                        isPrint = true;
                    }
                }
                if (!isPrint) {
                    if (arr[0] == 1) {//如果最小的数是1的话就只要输出右边的数就行
                        System.out.println(arr[n - 1] + 1);
                    } else {
                        System.out.print(arr[0] - 1);
                        System.out.println(" " + (arr[n - 1] + 1));
                    }
                }

            } else {
                System.out.println("mistake");
            }

        }
    }

    private static boolean anyRepeat(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                return true;
        }
        return false;
    }
}
