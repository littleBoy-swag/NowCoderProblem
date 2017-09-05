package nowcoder.nowcoder_practice1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int L = sc.nextInt();
            for (int i = L; i <= 100; i++) {
                if ((2 * N + i - i * i) % (2 * i) == 0) {//等差数列的求和公式
                    int start = (2 * N + i - i * i) / (2 * i);
                    for (int j = 0; j < i - 1; j++) {
                        System.out.print((start + j) + " ");
                    }
                    System.out.println(start + i - 1);
                    return;
                }
            }
            System.out.println("No");
        }
    }
}
