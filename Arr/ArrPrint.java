package Java_201220;
//ʵ��һ������ printArray, ������Ϊ����, ѭ�����������е�ÿ��Ԫ��, ��ӡÿ��Ԫ�ص�ֵ.
public class ArrPrint {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,6,15,17};
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
