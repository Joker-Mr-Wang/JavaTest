package Java_210126.operation;

import Java_210126.BookList;

import static java.lang.System.exit;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //退出程序
        System.out.println("退出程序");
        exit(0);
    }
}
