package Java_201213;

import java.util.Scanner;

//输出n*n的乘法口诀表，n由用户输入。
public class MultiplicationFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你所要输出的乘法表的层数：");
        int num = scanner.nextInt();
        //输出乘法口诀表
        printMultiplication(num);
    }

    private static void printMultiplication(int num) {
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.printf("%d*%d=%d ",i,j,i*j);
            }
            System.out.println();
        }
    }
}
