package Java_201213;

import java.util.Scanner;

//   ��һ�����������ڴ浱�д洢ʱ��������1�ĸ�����
public class BinaryFindOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������һ������");
        int num =scanner.nextInt();
        int count=0;
        for (int i = 0; i <32 ; i++) {
            if (((num>>i)&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }

}
