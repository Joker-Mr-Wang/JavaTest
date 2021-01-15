package Java_201218;
//创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//
//? 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
public class FindMax {
    public static void main(String[] args) {
        int num1=10,num2 = 40,num3=30;
        int maxTwo=max2(num1,num2);
        int maxThree=max3(num1,num2,num3);
        System.out.println("两个数的最大值是："+maxTwo);
        System.out.println("三个数的最大值是："+maxThree);
    }

    private static int max3(int num1, int num2, int num3) {
        int num=0,max=0;
        //num为前两个数中的较大值
        num=(max2(num1,num2));
        //max为三个数的最大值
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
