package Java_210102;
//����һ����������, ʵ��ð������(��������)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={1,61,21,43,66,55,92,24};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {//�����һ�����ڵڶ������򽻻�˳��
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
