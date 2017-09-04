package nowcoder.GBits;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(numOfPrimeBetweenThem(N, M));
        }
    }

    private static int numOfPrimeBetweenThem(int n, int m) {
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
