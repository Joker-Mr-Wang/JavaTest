package Java_201220;
//�������ƽ��ֵ
//ʵ��һ������ avg, ������Ϊ����, ������������Ԫ�ص�ƽ��ֵ(ע�ⷽ���ķ���ֵ����).
public class ArrTest {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,6,15,17};
        int numAvg=avg(arr);
        System.out.println("ƽ��ֵΪ��"+numAvg);
    }

    private static int avg(int[] arr) {
        int res =0;
        for (int i : arr) {
            res+=i;
        }
        return (res/arr.length);
    }
}
