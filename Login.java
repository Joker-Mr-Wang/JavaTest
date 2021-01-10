package Java_201213;

import sun.font.TrueTypeFont;

import java.util.Scanner;

//        编写代码模拟三次密码输入的场景。
//        最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
//        可以重新输 入，最多输入三次。三次均错，则提示退出程序
public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string="w123456";//密码串
            int count =3;
            while(choose(count)){//判断循环是否结束
                //判断密码是否正确
                System.out.println("请输入密码：");
                String next = scanner.next();
                if (string.equals(next)){
                    System.out.println("恭喜你，密码正确");
                   break;
                }
                else{
                    System.out.println("对不起，请重新输入，您还有"+(count-1)+"次机会");
                    count--;
                }
            }

    }
    //当计数器为3时则结束循环；
    private static boolean choose(int count) {
        if (count==0){
            System.out.println("您错误的次数过多，请稍后重试");
            return false;
        }else {
            return true;
        }
    }

}
