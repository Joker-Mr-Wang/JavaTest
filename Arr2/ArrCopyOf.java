package Java_210102;

import java.util.Arrays;

//ʵ��һ������ copyOf, ��һ������������п���, �õ�һ���µ�����.
public class ArrCopyOf {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6};
        int[] arr2 =arrCopyOf(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static int[] arrCopyOf(int[] arr1) {
        //����һ��������
        int[] arr =new int[arr1.length];
        //��������Ԫ��
        for (int i = 0; i < arr.length; i++) {
           arr[i] = arr1[i];

        }
        //��������
        return arr;
    }

}
