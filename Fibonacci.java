package Java_210129;
//递归求斐波那契数列的第 N 项
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("求斐波那契数列的第N项");
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
