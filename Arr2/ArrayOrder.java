package Java_210102;
//给定一个整型数组, 判定数组是否有序（递增）
public class ArrayOrder {
    public static void main(String[] args) {
        int[] arr ={1,61,21,43,66,55,92,24};
        int[] arr1 ={1,2,3,4,5,6};
        order(arr);
        order(arr1);
    }

    private static void order(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                count++;
            }
        }
        if (count!=0){
            System.out.println("数组无序");
        }else{
            System.out.println("数组有序");
        }
    }
}
