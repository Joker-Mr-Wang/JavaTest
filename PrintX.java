package Java_201208;
import java.util.Scanner;
//�������룬һ��������2~20������ʾ�����������Ҳ��ʾ��ɡ�X���ķ�б�ߺ���б�ߵĳ��ȡ�

public class PrintX {
        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            while(scanner.hasNextInt()){  //��������
                int num = scanner.nextInt(); //�����numһ���ڴ棬¼���û����������
                if (num >= 2 && num <= 20) { //����num�ķ�ΧΪ2-20
                    for (int i = 0; i < num; i++) { //��������
                        for (int j = 0; j < num; j++) {
                            if (i == j) { //�������������ʱ��ӡ*
                                System.out.printf("*");
                            }
                            else if (j == num - i - 1) { //�ж�*λ�õ�����λ�ù�ϵ
                                System.out.printf("*");
                            }
                            else {    //����������������������ʱ����ӡ�ո�
                                System.out.printf(" ");
                            }
                        }
                        System.out.println();
                    }
                }
            }
        }
    }


