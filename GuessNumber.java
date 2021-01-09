package Java_201213;

import java.util.Random;
import java.util.Scanner;

//猜数字游戏
public class GuessNumber {
    public static void main(String[] args) {
       //1。先生成一个1-100的整数
        Random random = new Random( );
        //[0,99]+1=[1,100]
        int bound =random.nextInt(100)+1;
       //输入需要输入的数字
        Scanner scanner = new Scanner(System.in);
        while (true){//循环，直到猜对
            System.out.println("请输入要猜的数字：");
            int num =scanner.nextInt();
           if (num>bound){
               System.out.println("大了");
           }else if (num<bound){
               System.out.println("小了");
           }else{
               System.out.println("你猜对了");
               break;
           }
        }
    }
}
