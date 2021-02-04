package Java_210201;
//判断存不存在三个连续的奇数
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2,3};
        System.out.println(threeConsecutiveOdds(arr));
    }


    public static boolean threeConsecutiveOdds(int[] arr) {
        //便利数组,找到所有可能的序列并判断
        for (int i = 0 ; i<arr.length-2;i++){
            if (arr[i]%2!=0&&arr[i+1]%2!=0&&arr[i]%2!=0){
                return true;
            }
        }
        return false;
    }
}
