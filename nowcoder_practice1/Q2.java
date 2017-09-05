package nowcoder.nowcoder_practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<String> list = new ArrayList<>();//每输入一个单词就把他的所有的循环词加入list中，这样下一个输入的时候就判断
            int count = 0;
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                if (!list.contains(s)) {
                    count++;
                    list.add(s);
                }

                for (int j = 0; j < s.length() - 1; j++) {
                    char last = s.charAt(s.length() - 1);
                    s = s.substring(0, s.length() - 1);
                    s = last + s;
                    list.add(s);
                }

            }
            System.out.println(count);

        }
    }
}
