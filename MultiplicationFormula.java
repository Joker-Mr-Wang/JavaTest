package Java_201213;

import java.util.Scanner;

//���n*n�ĳ˷��ھ���n���û����롣
public class MultiplicationFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����������Ҫ����ĳ˷���Ĳ�����");
        int num = scanner.nextInt();
        //����˷��ھ���
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
