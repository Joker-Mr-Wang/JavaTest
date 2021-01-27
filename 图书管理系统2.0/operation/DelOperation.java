package Java_210126.operation;

import Java_210126.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
    //删除一本书
        System.out.println("删除书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要删除的书籍名称：");
        String name =scanner.next();
        int i;
        for (i = 0; i <bookList.getSize(); i++) {
            if (name.equals(bookList.getBook(i).getName())){
                break;
            }
        }
        if (i>=bookList.getSize()){
            //没找到书籍
            System.out.println("书籍未找到");
            return;
        }
        //如果匹配到了，则删除元素
        //若删除最后一个元素
        if (i==bookList.getSize()-1){
            bookList.setSize(bookList.getSize()-1);
            return;
        }
        //删除其他位置元素
        //把最后一个元素放到需要删除的位置
        bookList.setBook(i,bookList.getBook(bookList.getSize()-1));
        bookList.setSize(bookList.getSize()-1);
        System.out.println("删除成功");

    }
}
