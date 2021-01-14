package Java_201218;

import java.util.Scanner;

//求1！+2！+3！+4！+........+n!的和
public class FactorialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n的值");
        int n=scanner.nextInt();
        int res=0;

        for (int i = 1; i <=n; i++) {
            //求阶乘Factorial
            int num=Factorial(i);
            res+=num;
        }
        System.out.println(res);
    }
//求阶乘
    private static int Factorial(int n) {
        int tmp=1;
        for (int i = 1; i <=n; i++) {
            tmp*=i;
        }
        return tmp;
    }
}
