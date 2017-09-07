package nowcoder.chubao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
            double shortdistance = Double.MAX_VALUE, timer = 0;
            int c =0;
//            int N = sc.nextInt();
//            double[][] dot = new double[N][4];
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < 4; j++) {
//                    dot[i][j] = sc.nextInt();
//                }
//            }
            double[][] dot = {{27,27,0,2},{58,88,-8,-1},{-22,7,1,-1},{-38,-26,5,9}};//8.89 81.00
//            double[][] dot = {{0,0,1,0},{2,0,-1,0}}; // 1.00 0.00
            for (double i = 1.0; i < 100; i += 0.001) {
                c++;
                dot = updateDot(dot, i);
                double distance = getSpecialDot(dot);
                if (distance < shortdistance) {
                    shortdistance = distance;
                    timer = i;
                }
            }
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(timer) + " " + df.format(shortdistance)+" "+c);
//            System.out.println(df.format(timer) + " " + shortdistance);

//        }
    }

    private static double getSpecialDot(double[][] dot) {
        double len = 0;
        for (int i = 0; i < dot.length; i++) {
            for (int j = i + 1; j < dot.length; j++) {
                double sqrt2 = (dot[j][0] - dot[i][0]) * (dot[j][0] - dot[i][0]) + (dot[j][1] - dot[i][1]) * (dot[j][1] - dot[i][1]);
                double temp = Math.sqrt(sqrt2);
                if (temp > len) {
                    len = temp;
                }
            }
        }
        return len;
    }

    private static double[][] updateDot(double[][] dot, double t) {
        for (int i = 0; i < dot.length; i++) {
            dot[i][0] += dot[i][2] * t;
            dot[i][1] += dot[i][3] * t;
        }
        return dot;
    }


}
