package Java_201213;

import static java.lang.Integer.min;
//���Լ��
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        //�����������������
        int num1=10 ,num2=25;
        //�����Լ��
        int res=FindGCD(num1,num2);
        System.out.println("���Լ����"+res);
    }

    private static int FindGCD(int num1,int num2) {
//ѡ���������еĽ�С��
        int min = min(num1, num2);
        //�ҵ����Ա�������������
        int i=0;
        for (i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                break;//����ѭ��
            }
        }
        return i;
      }
    }