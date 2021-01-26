package Java_210126.operation;

import Java_210126.BookList;

public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //显示书籍列表
        System.out.println("展示书籍");
    }
}
