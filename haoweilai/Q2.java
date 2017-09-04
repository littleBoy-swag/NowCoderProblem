package nowcoder.haoweilai;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] num = str.split(" ");
            int k = Integer.parseInt(num[num.length - 1]);
            int[] nums = new int[num.length - 1];
            for (int i = 0; i < num.length - 1; i++) {
                nums[i] = Integer.parseInt(num[i]);
            }
            Arrays.sort(nums);
            for (int i = 0; i < k - 1; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println(nums[k - 1]);
        }
    }
}
