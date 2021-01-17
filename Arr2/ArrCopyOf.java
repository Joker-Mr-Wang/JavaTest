package Java_210102;

import java.util.Arrays;

//实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
public class ArrCopyOf {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6};
        int[] arr2 =arrCopyOf(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static int[] arrCopyOf(int[] arr1) {
        //创建一个新数组
        int[] arr =new int[arr1.length];
        //拷贝数组元素
        for (int i = 0; i < arr.length; i++) {
           arr[i] = arr1[i];

        }
        //返回数组
        return arr;
    }

}
