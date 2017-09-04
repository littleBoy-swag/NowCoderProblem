package nowcoder.meituan;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();

            try {
                long num1 = Long.parseLong(s1);
                long num2 = Long.parseLong(s2);
                System.out.println(num1+num2);
            }catch (Exception e){
                System.out.println("error");
            }
        }
    }
}
