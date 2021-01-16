package Java_201220;
//实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
public class ArrSum {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,6,15,17};
        int arrSum=sum(arr);
        System.out.println("数组的和为："+arrSum);
    }

    private static int sum(int[] arr) {
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
