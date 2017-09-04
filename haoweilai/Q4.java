package nowcoder.haoweilai;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            char[] ch2 = s2.toCharArray();
            for (Character c : ch2) {
                s1 = s1.replace(c + "", "");
            }
            System.out.println(s1);
        }
    }
}
