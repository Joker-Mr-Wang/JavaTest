package Java_210126.operation;

import Java_210126.BookList;

import java.util.Arrays;

public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //显示书籍列表
        System.out.println("展示书籍");
        for (int i = 0; i <bookList.getSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
