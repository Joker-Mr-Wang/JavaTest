package Java_201218;



//��ͬһ�����ж�����������
// Ҫ�󲻽��������������������ֵ��
// ������������С�������ֵ��
// �Լ�����С����һ�������Ĵ�С��ϵ
public class maxOverload {
    public static void main(String[] args) {
        int num1=5,num2=3,num3=7;
        double num4=2.5,num5=16.0;
        int max1=max0(num1,num2);
        double max2=max0(num4,num5);
        double max3=max0(num4,num5,num3);
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }
    private static double max0(double num1, double num2,int num3) {
      double num=num1;
      if (num<num2){
          num=num2;
      }
      if (num<num3){
          num=num3;
        }
        return num;
    }
    private static double max0(double num1, double num2) {
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
    private static int max0(int num1, int num2) {
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
}
