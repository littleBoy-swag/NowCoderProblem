package nowcoder.nowcoder_practice1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            int has = sc.nextInt();
            int[] hasWeight = new int[has];
            for (int i = 0; i < has; i++) {
                hasWeight[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = min; i <= max; i++) {
                boolean canEat = false;
                for (int j = 0; j < has; j++) {
                    if ((10 * i >= hasWeight[j] && 2 * i <= hasWeight[j]) || (i >= hasWeight[j] * 2 && i <= hasWeight[j] * 10)) {
                        canEat = true;
                        break;
                    }
                }
                if (!canEat) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
