package nowcoder.GBits;

import java.util.Scanner;

/**
 * 给定一个未排序的数列，找到此数列在已排序状态下的两个相邻值的最大差值，少于两个值时返回0。
 * 例如：给定数列 [1,3,2,0,1,6,8] 则 最大差值为3。注意：请尽量使用时间复杂度为O(n)的方案。
 输入描述:

 第一行输入单个整数N作为数列的大小，第二行输入所有数列中的元素M，共N个。0 < N <= 1000000, 0 < M < 2100000000
 */


public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(getMaxGap(arr,n));
        }
    }

    private static int getMaxGap(int[] arr, int n) {

        return 0;
    }
}
