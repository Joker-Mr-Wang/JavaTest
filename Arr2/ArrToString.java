package Java_210102;
//实现一个方法 toString,把一个整型数组转换成字符串.
// 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
public class ArrToString {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6};
        System.out.println(toString(arr1));
    }

    private static String toString(int[] arr1) {
        String string ="[";
        for (int i = 0; i < arr1.length; i++) {
            string +=arr1[i];
            if (i!=arr1.length-1) {
                string+=",";
            }
        }
        string+="]";
        return string;


            
        }
    }
