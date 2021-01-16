package Java_201220;

import java.util.Arrays;

//实现一个方法 transform,
// 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
// 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
public class ArrChange {
    public static void main(String[] args) {
        int[] arrOld ={1,2,3};
        int[] arrNew =transform(arrOld);
        //字符串形式输出数组
        System.out.println(Arrays.toString(arrOld));
        System.out.println(Arrays.toString(arrNew));
    }

    private static int[] transform(int[] arrOld) {
        //建立一个新数组
        int[] arr = new int[arrOld.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrOld[i]*2;
        }
        return arr;
    }
}
