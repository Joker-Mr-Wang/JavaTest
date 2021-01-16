package Java_201220;
//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
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
