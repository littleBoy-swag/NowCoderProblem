package nowcoder.nowcoder_practice1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int最大范围为2^32.远远小于10^18.故用long.long的范围为2^64
        long num = sc.nextLong();
        double p;
        boolean flag = false;
        for (long q = 2; q * q <= num; q ++) {
            p = Math.pow((double) num, 1d/q);
            //(long)p == p 判断p经过 Math.pow((double) num, 1d/q)后是否为整数
            if ((long)p == p && isPrimeNumber((long) p)) {
                System.out.println((long) p + " " + q);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("No");
        }
    }

    /**
     * 判断是否为素数
     * @param n 输入long值
     * @return true素数 false 不是素数
     */
    public static boolean isPrimeNumber(long n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i ++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
