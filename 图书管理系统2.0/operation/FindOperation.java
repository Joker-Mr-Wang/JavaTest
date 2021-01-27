package Java_210126.operation;

import Java_210126.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
    //查找一本书
        System.out.println("查找书籍");
        //输入书名查找
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要查找的书名");
        String name =scanner.next();
        //循环遍历书籍列表
        for (int i = 0; i <bookList.getSize(); i++) {
            //contains是包含字符串,前面包含后面，前.contains(后)
             if (bookList.getBook(i).getName().contains(name)){
                 System.out.println(bookList.getBook(i));
                 break;
             }
        }
    }
}
