package Java_210126.operation;


import Java_210126.Book;
import Java_210126.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList){
    //新增一本书
        Scanner scanner = new Scanner(System.in);
        System.out.println("新增书籍");
        System.out.println("请输入新的书籍名称：");
        String name =scanner.next();
        System.out.println("请输入新的书籍的作者：");
        String anther =scanner.next();
        System.out.println("请输入新的书籍的价格：");
        double price =scanner.nextDouble();
        System.out.println("请输入新的书籍的类别：");
        String type =scanner.next();
        Book newBook =new Book(name,anther,price,type);
        //把书放入末尾
        int curSize =bookList.getSize();
        bookList.setBook(curSize,newBook);
        bookList.setSize(curSize+1);
        System.out.println("新增成功");
    }

}
