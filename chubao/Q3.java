package nowcoder.chubao;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        double time=Double.MAX_VALUE,minDistance=Double.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[][] arr = new int[n][4];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

        }
    }

}
