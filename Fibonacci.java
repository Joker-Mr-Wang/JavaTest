package Java_210129;
//�ݹ���쳲��������еĵ� N ��
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("��쳲��������еĵ�N��");
        int n =6;
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
           if (n==1||n==2){
               return 1;
            }
            else{
                return fibonacci(n-1)+fibonacci(n-2);
           }

    }
}
