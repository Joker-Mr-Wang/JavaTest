package Java_201213;

import sun.font.TrueTypeFont;

import java.util.Scanner;

//        ��д����ģ��������������ĳ�����
//        ����������������룬������ȷ����ʾ����¼�ɹ���,�������
//        ���������� �룬����������Ρ����ξ�������ʾ�˳�����
public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string="w123456";//���봮
            int count =3;
            while(choose(count)){//�ж�ѭ���Ƿ����
                //�ж������Ƿ���ȷ
                System.out.println("���������룺");
                String next = scanner.next();
                if (string.equals(next)){
                    System.out.println("��ϲ�㣬������ȷ");
                   break;
                }
                else{
                    System.out.println("�Բ������������룬������"+(count-1)+"�λ���");
                    count--;
                }
            }

    }
    //��������Ϊ3ʱ�����ѭ����
    private static boolean choose(int count) {
        if (count==0){
            System.out.println("������Ĵ������࣬���Ժ�����");
            return false;
        }else {
            return true;
        }
    }

}
