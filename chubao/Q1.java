package nowcoder.chubao;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            String[] origin = new String[N];
            for (int i = 0; i < N; i++) {
                origin[i] = sc.next();
            }
            int M = sc.nextInt();
            String[] ask = new String[M];
            for (int i = 0; i < M; i++) {
                ask[i] = sc.next();
            }
            int[] res = new int[M];
            for (int i = 0; i < M; i++) {
                res[i] = getSubStringCount(ask[i], origin);
            }
            for (int i = 0; i < M; i++) {
                System.out.println(res[i]);
            }

        }
    }

    private static int getSubStringCount(String s, String[] origin) {
        int count = 0;
        for (int i = 0; i < origin.length; i++) {
            if (isSubString(s, origin[i]))
                count++;
        }
        return count;
    }

    private static boolean isSubString(String s, String origin) {
        boolean flag = origin.contains(s);
        return flag;
    }
}
