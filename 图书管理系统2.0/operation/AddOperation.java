package Java_210126.operation;


import Java_210126.Book;
import Java_210126.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList){
    //����һ����
        Scanner scanner = new Scanner(System.in);
        System.out.println("�����鼮");
        System.out.println("�������µ��鼮���ƣ�");
        String name =scanner.next();
        System.out.println("�������µ��鼮�����ߣ�");
        String anther =scanner.next();
        System.out.println("�������µ��鼮�ļ۸�");
        double price =scanner.nextDouble();
        System.out.println("�������µ��鼮�����");
        String type =scanner.next();
        Book newBook =new Book(name,anther,price,type);
        //�������ĩβ
        int curSize =bookList.getSize();
        bookList.setBook(curSize,newBook);
        bookList.setSize(curSize+1);
        System.out.println("�����ɹ�");
    }

}
