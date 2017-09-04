package nowcoder.haoweilai;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            for (int i = s.length - 1; i > 0; i--) {
                System.out.print(s[i] + " ");
            }
            System.out.println(s[0]);
        }
    }
}
