package nowcoder.nowcoder_practice1;

import java.util.Scanner;
//链接：https://www.nowcoder.com/test/question/done?tid=10616366&qid=78092#summary
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.print(getCount(n,0));
            for (int i = 1; i < 10; i++) {
                System.out.print(" "+getCount(n,i));

            }
            System.out.println();
        }
    }

    private static int getCount(int n, int num) {
        int res = 0;
        for (int i = 1, j = n/i; ;i*=10) {
            int high = j/10;
            if(num==0){
                if(high!=0){
                    high--;
                }else {
                    break;
                }
            }
            res+=high*i;
            int tem = j%10;
            if(tem>num)
                res+=i;
            else if(tem==num)
                res+=n-j*i+1;

        }
        return res;
    }
}
