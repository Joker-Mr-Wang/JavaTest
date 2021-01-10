package Java_201213;

import static java.lang.Integer.min;
//最大公约数
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        //先输入所求的两个数
        int num1=10 ,num2=25;
        //求最大公约数
        int res=FindGCD(num1,num2);
        System.out.println("最大公约数："+res);
    }

    private static int FindGCD(int num1,int num2) {
//选择两个数中的较小者
        int min = min(num1, num2);
        //找到可以被二者整除的数
        int i=0;
        for (i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                break;//跳出循环
            }
        }
        return i;
      }
    }