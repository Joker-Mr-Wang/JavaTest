package Java_210126.operation;

import Java_210126.Book;
import Java_210126.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //借书
        Scanner scanner = new Scanner(System.in);
        System.out.println("借用书籍");
        System.out.println("请输入要借阅书籍的名称");
        String name =scanner.next();
        int i;
        //找到书籍位置
        for (i = 0; i < bookList.getSize(); i++) {
             if (bookList.getBook(i).getName().contains(name)){
                 break;
             }
        }

        if (i>= bookList.getSize()){
            //没找到
            System.out.println("未找到");
            return;
        }

        Book currentBook =bookList.getBook(i);
        //如果currentBook.isBorrowed（）若为true，则说明书籍被接触
        //if里面的条件为真时才会被执行。
        if (currentBook.isBorrowed()){
            System.out.println("书籍已被借出");
            return;
        }
        //未被借出，则借出熟悉，修改书籍状态，并提示用户。
        currentBook.setBorrowed(true);
        System.out.println("借出成功");
    }
}
