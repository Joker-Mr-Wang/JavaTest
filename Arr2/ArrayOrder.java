package Java_210102;
//����һ����������, �ж������Ƿ����򣨵�����
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
            System.out.println("��������");
        }else{
            System.out.println("��������");
        }
    }
}
