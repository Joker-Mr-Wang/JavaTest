package Java_201218;

import java.util.Scanner;

//��1��+2��+3��+4��+........+n!�ĺ�
public class FactorialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������n��ֵ");
        int n=scanner.nextInt();
        int res=0;

        for (int i = 1; i <=n; i++) {
            //��׳�Factorial
            int num=Factorial(i);
            res+=num;
        }
        System.out.println(res);
    }
//��׳�
    private static int Factorial(int n) {
        int tmp=1;
        for (int i = 1; i <=n; i++) {
            tmp*=i;
        }
        return tmp;
    }
}
