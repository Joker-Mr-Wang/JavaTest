package Java_210129;
//дһ���ݹ鷽��������һ���Ǹ����������������������֮��
public class ReturnNum {
    public static void main(String[] args) {
        int num =123546;
        System.out.println(returnNum(num));
    }

    private static int returnNum(int num) {
        if (num/10==0){
            return num%10;
        }else {
            return num%10+returnNum(num/10);
        }
    }
}
package Java_210129;
//дһ���ݹ鷽��������һ���Ǹ����������������������֮��
public class ReturnNum {
    public static void main(String[] args) {
        int num =123546;
        System.out.println(returnNum(num));
    }

    private static int returnNum(int num) {
        if (num/10==0){
            return num%10;
        }else {
            return num%10+returnNum(num/10);
        }
    }
}
