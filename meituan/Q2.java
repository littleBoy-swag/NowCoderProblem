package nowcoder.meituan;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 6};
        int n = 6;
        System.out.println(getLargestArea(arr, n));
    }

    private static int getLargestArea(int[] arr, int n) {
        if (arr == null || n == 0)
            return 0;
        int[] area = new int[n];
        for (int i = 0; i < n; i++) {
            int h = arr[i];
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= h) {
                    count++;
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= h) {
                    count++;
                } else {
                    break;
                }
            }
            area[i] = count * h;
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < area[i])
                max = area[i];
        }
        return max;
    }
}
