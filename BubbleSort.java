package Java_210102;
//给定一个整型数组, 实现冒泡排序(升序排序)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={1,61,21,43,66,55,92,24};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {//如果第一个大于第二个，则交换顺序
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
              }
            }
        for (int i1 : arr) {
            System.out.println(i1);
        }
    }
}
