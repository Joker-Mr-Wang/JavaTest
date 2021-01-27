package Java_210126.operation;

import Java_210126.Book;
import Java_210126.BookList;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //还书
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要还的书籍姓名");
        String name = scanner.next();
        int i = 0;
        for (; i <bookList.getSize() ; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)){
                break;
            }
        }
        if (i>=bookList.getSize()){
            System.out.println("书籍未找到");
            return;
        }
        Book currentBook =bookList.getBook(i);
        if (!currentBook.isBorrowed()){
            System.out.println("书籍未被借出");
            return;
        }
        currentBook.setBorrowed(false);
        System.out.println("还书成功");
     }

    }

