package Java_210102;
//ʵ��һ������ toString,��һ����������ת�����ַ���.
// �������� {1, 2, 3} , ���ص��ַ���Ϊ "[1, 2, 3]", ע�� ���� ��λ�ú�����.
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
