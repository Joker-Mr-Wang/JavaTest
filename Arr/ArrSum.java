package Java_201220;
//ʵ��һ������ sum, ������Ϊ����, ����������Ԫ��֮��.
public class ArrSum {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,6,15,17};
        int arrSum=sum(arr);
        System.out.println("����ĺ�Ϊ��"+arrSum);
    }

    private static int sum(int[] arr) {
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
