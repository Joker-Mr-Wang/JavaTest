package Java_210126.operation;

import Java_210126.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
    //ɾ��һ����
        System.out.println("ɾ���鼮");
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������Ҫɾ�����鼮���ƣ�");
        String name =scanner.next();
        int i;
        for (i = 0; i <bookList.getSize(); i++) {
            if (name.equals(bookList.getBook(i).getName())){
                break;
            }
        }
        if (i>=bookList.getSize()){
            //û�ҵ��鼮
            System.out.println("�鼮δ�ҵ�");
            return;
        }
        //���ƥ�䵽�ˣ���ɾ��Ԫ��
        //��ɾ�����һ��Ԫ��
        if (i==bookList.getSize()-1){
            bookList.setSize(bookList.getSize()-1);
            return;
        }
        //ɾ������λ��Ԫ��
        //�����һ��Ԫ�طŵ���Ҫɾ����λ��
        bookList.setBook(i,bookList.getBook(bookList.getSize()-1));
        bookList.setSize(bookList.getSize()-1);
        System.out.println("ɾ���ɹ�");

    }
}
