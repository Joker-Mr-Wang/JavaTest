package Java_210126.operation;

import Java_210126.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
    //����һ����
        System.out.println("�����鼮");
        //������������
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������Ҫ���ҵ�����");
        String name =scanner.next();
        //ѭ�������鼮�б�
        for (int i = 0; i <bookList.getSize(); i++) {
            //contains�ǰ����ַ���,ǰ��������棬ǰ.contains(��)
             if (bookList.getBook(i).getName().contains(name)){
                 System.out.println(bookList.getBook(i));
                 break;
             }
        }
    }
}
