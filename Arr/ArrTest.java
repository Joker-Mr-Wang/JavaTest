package Java_201220;
//求数组的平均值
//实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
public class ArrTest {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,6,15,17};
        int numAvg=avg(arr);
        System.out.println("平均值为："+numAvg);
    }

    private static int avg(int[] arr) {
        int res =0;
        for (int i : arr) {
            res+=i;
        }
        return (res/arr.length);
    }
}
