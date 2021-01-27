package Java_210126;

import Java_210126.operation.*;

import java.util.Scanner;

//����Աϵͳ
public class Admin extends User {
    //��ʼ��admin
    public Admin(String name ) {
        //�ⲿ�������Ա����
        this.name = name;
        //�ڲ�����ù���Ա�ɲ����Ĺ��ܽӿ�
        this.operations = new IOperation[]{
                //����,����
                new FindOperation(), new AddOperation(),
                //ɾ����չʾ
                new DelOperation(),new DisplayOperation(),
                //�˳�
                new ExitOperation()
        };
    }


    @Override
    public int menu() {
        System.out.println("===========================");
        System.out.println("Hello! "+name+"��ӭʹ��ͼ�����ϵͳ");
        System.out.println("1.�����鼮��Ϣ");
        System.out.println("2.����鼮��Ϣ");
        System.out.println("3.ɾ���鼮��Ϣ");
        System.out.println("4.չʾ�鼮�б�");
        System.out.println("5.�˳�");
        System.out.println("===========================");
        System.out.println("����������ѡ��");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
