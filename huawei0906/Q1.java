package nowcoder.huawei0906;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int[] jiu = new int[m];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (i < m)
                    jiu[i] = arr[i];
            }
            int res = 0;
            while (getBool(jiu)) {
                int min = getMin(jiu);
                res += min;
                for (int i = 0; i < jiu.length; i++) {
                    jiu[i] -= min;
                    if (jiu[i] == 0 && m < arr.length) {
                        jiu[i] = arr[m++];
                    }
                }
            }
            System.out.println(res);
        }
    }

    private static int getMin(int[] jiu) {
        int k = Integer.MAX_VALUE;
        for (int i = 0; i < jiu.length; i++) {
            if (k > jiu[i] && jiu[i] > 0) {
                k = jiu[i];
            }
        }
        return k;
    }

    private static boolean getBool(int[] jiu) {
        for (int i = 0; i < jiu.length; i++) {
            if (jiu[i] > 0)
                return true;
        }
        return false;
    }

}
