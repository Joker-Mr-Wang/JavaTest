package Java_210126;

import Java_210126.operation.*;

import java.util.Scanner;

//��ͨ�û�
public class NormalUser extends User {
    //��ʼ��NormalUser
    public NormalUser(String name) {
        this.name = name;
        this.operations=new IOperation[]{
                //���飬����
                new BorrowOperation(),new ReturnOperation(),
                //���ң��˳�
                new FindOperation(), new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("===========================");
        System.out.println("Hello! "+name+"��ӭʹ��ͼ�����ϵͳ");
        System.out.println("1.�����鼮");
        System.out.println("2.�˻��鼮");
        System.out.println("3.�����鼮");
        System.out.println("4.�˳�ϵͳ");
        System.out.println("===========================");
        System.out.println("����������ѡ��");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
