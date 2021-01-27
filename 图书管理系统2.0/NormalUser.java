package Java_210126;

import Java_210126.operation.*;

import java.util.Scanner;

//普通用户
public class NormalUser extends User {
    //初始化NormalUser
    public NormalUser(String name) {
        this.name = name;
        this.operations=new IOperation[]{
                //借书，还书
                new BorrowOperation(),new ReturnOperation(),
                //查找，退出
                new FindOperation(), new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("===========================");
        System.out.println("Hello! "+name+"欢迎使用图书管理系统");
        System.out.println("1.借用书籍");
        System.out.println("2.退还书籍");
        System.out.println("3.查找书籍");
        System.out.println("4.退出系统");
        System.out.println("===========================");
        System.out.println("请输入您的选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
