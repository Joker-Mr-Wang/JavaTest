package Java_210126.operation;


import Java_210126.BookList;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList){
    //新增一本书
        System.out.println("新增书籍");
    }

}
