package Java_201220;

import java.util.Arrays;

//ʵ��һ������ transform,
// ������Ϊ����, ѭ���������е�ÿ��Ԫ�� ���� 2 , �����õ���Ӧ������Ԫ����.
// ���� ԭ����Ϊ {1, 2, 3}, �޸�֮��Ϊ {2, 4, 6}
public class ArrChange {
    public static void main(String[] args) {
        int[] arrOld ={1,2,3};
        int[] arrNew =transform(arrOld);
        //�ַ�����ʽ�������
        System.out.println(Arrays.toString(arrOld));
        System.out.println(Arrays.toString(arrNew));
    }

    private static int[] transform(int[] arrOld) {
        //����һ��������
        int[] arr = new int[arrOld.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrOld[i]*2;
        }
        return arr;
    }
}
