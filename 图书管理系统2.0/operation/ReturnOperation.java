package Java_210126.operation;

import Java_210126.Book;
import Java_210126.BookList;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //����
        System.out.println("�黹�鼮");
        Scanner scanner = new Scanner(System.in);
        System.out.println("������Ҫ�����鼮����");
        String name = scanner.next();
        int i = 0;
        for (; i <bookList.getSize() ; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)){
                break;
            }
        }
        if (i>=bookList.getSize()){
            System.out.println("�鼮δ�ҵ�");
            return;
        }
        Book currentBook =bookList.getBook(i);
        if (!currentBook.isBorrowed()){
            System.out.println("�鼮δ�����");
            return;
        }
        currentBook.setBorrowed(false);
        System.out.println("����ɹ�");
     }

    }

