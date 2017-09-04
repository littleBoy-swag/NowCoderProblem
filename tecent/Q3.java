package nowcoder.tecent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = getPrimeArrayWithinN(n);
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] + arr[j] == n)
                        count++;
                }
            }
            System.out.println(count);
        }
    }

    private static int[] getPrimeArrayWithinN(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        if (num == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
