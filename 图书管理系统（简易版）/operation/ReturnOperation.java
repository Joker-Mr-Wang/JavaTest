package Java_210126.operation;

import Java_210126.BookList;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //还书
        System.out.println("归还书籍");
    }
}
