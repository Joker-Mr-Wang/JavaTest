package Java_201218;
//��쳲��������еĵ�n�(����ʵ��)
public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3=0;
        int n =10;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 3; i <=n; i++) {
            num3=num2+num1;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }
    }

}
