package Java_210129;
//�ݹ����
//�ݹ��� 1 + 2 + 3 + ... + 10
public class CountNum {
    public static void main(String[] args) {
        int num= 10;
        System.out.println(sum(10));

    }
    private static int sum(int i) {
        if (i==1){
            return 1;
        }
        else {
            return sum(i-1)+i;
        }
    }
}
