package Java_210126;

import Java_210126.operation.*;

import java.util.Scanner;

//管理员系统
public class Admin extends User {
    //初始化admin
    public Admin(String name ) {
        //外部输入管理员姓名
        this.name = name;
        //内部定义好管理员可操作的功能接口
        this.operations = new IOperation[]{
                //查找,增加
                new FindOperation(), new AddOperation(),
                //删除，展示
                new DelOperation(),new DisplayOperation(),
                //退出
                new ExitOperation()
        };
    }


    @Override
    public int menu() {
        System.out.println("===========================");
        System.out.println("Hello! "+name+"欢迎使用图书管理系统");
        System.out.println("1.查找书籍信息");
        System.out.println("2.添加书籍信息");
        System.out.println("3.删除书籍信息");
        System.out.println("4.展示书籍列表");
        System.out.println("5.退出");
        System.out.println("===========================");
        System.out.println("请输入您的选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
