package Java_210129;
//��n�Ľ׳�
public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if (num==1){
            return 1;
        }else {
            return num*factorial(num-1);
        }
    }


}
