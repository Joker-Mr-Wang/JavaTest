package Java_210102;
//���ֲ���
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,15,16};
        int key =15;
       if (ArrSearch(arr1,key)){
           System.out.println("�ҵ���");
        }else{
           System.out.println("û�ҵ�");
       }
    }
    private static boolean ArrSearch(int[] arr1, int i) {
        int first = 0;
        int end =arr1.length-1;
        while (first<=end){
            int mid =(first+end)/2;
            if (i>arr1[mid]){
                first=mid+1;
            }
            else if(i<arr1[mid]){
                end=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
