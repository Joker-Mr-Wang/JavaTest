package Java_201213;

import java.util.Random;
import java.util.Scanner;

//��������Ϸ
public class GuessNumber {
    public static void main(String[] args) {
       //1��������һ��1-100������
        Random random = new Random( );
        //[0,99]+1=[1,100]
        int bound =random.nextInt(100)+1;
       //������Ҫ���������
        Scanner scanner = new Scanner(System.in);
        while (true){//ѭ����ֱ���¶�
            System.out.println("������Ҫ�µ����֣�");
            int num =scanner.nextInt();
           if (num>bound){
               System.out.println("����");
           }else if (num<bound){
               System.out.println("С��");
           }else{
               System.out.println("��¶���");
               break;
           }
        }
    }
}
