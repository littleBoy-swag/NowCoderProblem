package nowcoder.zte;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.next();
            }
            System.out.println(canArrangeWords(arr,n));

        }
    }

    private static int canArrangeWords(String[] arr, int n) {
        if(n==1)
            return 1;
        //TODO

        return 0;
    }


}
