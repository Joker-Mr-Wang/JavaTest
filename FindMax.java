package Java_201218;
//���������������������ֵmax2�������дһ����3���������ֵ�ĺ���max3��
//
//? Ҫ����max3��������У�����max2��������ʵ��3���������ֵ����
public class FindMax {
    public static void main(String[] args) {
        int num1=10,num2 = 40,num3=30;
        int maxTwo=max2(num1,num2);
        int maxThree=max3(num1,num2,num3);
        System.out.println("�����������ֵ�ǣ�"+maxTwo);
        System.out.println("�����������ֵ�ǣ�"+maxThree);
    }

    private static int max3(int num1, int num2, int num3) {
        int num=0,max=0;
        //numΪǰ�������еĽϴ�ֵ
        num=(max2(num1,num2));
        //maxΪ�����������ֵ
        max=(max2(num,num3));
        return  max;
    }

    private static int max2(int num1, int num2) {
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
}
