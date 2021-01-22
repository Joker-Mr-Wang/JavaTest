package Java_201208;
import java.util.Scanner;
//多组输入，一个整数（2~20），表示输出的行数，也表示组成“X”的反斜线和正斜线的长度。

public class PrintX {
        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            while(scanner.hasNextInt()){  //多组输入
                int num = scanner.nextInt(); //分配个num一个内存，录入用户的输入输出
                if (num >= 2 && num <= 20) { //定义num的范围为2-20
                    for (int i = 0; i < num; i++) { //遍历数组
                        for (int j = 0; j < num; j++) {
                            if (i == j) { //当行数列数相等时打印*
                                System.out.printf("*");
                            }
                            else if (j == num - i - 1) { //判断*位置的行列位置关系
                                System.out.printf("*");
                            }
                            else {    //当上面两个条件都不满足时，打印空格
                                System.out.printf(" ");
                            }
                        }
                        System.out.println();
                    }
                }
            }
        }
    }


