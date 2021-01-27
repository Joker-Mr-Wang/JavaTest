package Java_210126.operation;

import Java_210126.Book;
import Java_210126.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //����
        Scanner scanner = new Scanner(System.in);
        System.out.println("�����鼮");
        System.out.println("������Ҫ�����鼮������");
        String name =scanner.next();
        int i;
        //�ҵ��鼮λ��
        for (i = 0; i < bookList.getSize(); i++) {
             if (bookList.getBook(i).getName().contains(name)){
                 break;
             }
        }

        if (i>= bookList.getSize()){
            //û�ҵ�
            System.out.println("δ�ҵ�");
            return;
        }

        Book currentBook =bookList.getBook(i);
        //���currentBook.isBorrowed������Ϊtrue����˵���鼮���Ӵ�
        //if���������Ϊ��ʱ�Żᱻִ�С�
        if (currentBook.isBorrowed()){
            System.out.println("�鼮�ѱ����");
            return;
        }
        //δ�������������Ϥ���޸��鼮״̬������ʾ�û���
        currentBook.setBorrowed(true);
        System.out.println("����ɹ�");
    }
}
