package Java_201220;

import java.util.Arrays;

//����һ�� int ���͵�����, Ԫ�ظ���Ϊ 100, ����ÿ��Ԫ����������Ϊ 1 - 100
public class ArrInit {
    public static void main(String[] args) {
        int[] arr =new int[100];
        for (int i = 0; i < arr.length; i++) {
                 arr[i]=i+1;

        }
        System.out.println(Arrays.toString(arr));
    }
}
