package Java_210126;

import jdk.nashorn.internal.objects.annotations.Getter;

//ͨ�������Ѷ��Book����ŵ�һ��
public class BookList   {
    //100ָ�������������������capacity
    private Book[] books = new Book[100];
    //sizeΪ�鼮�������͵س�ʼ��Ϊ0��
    private int size = 0;

    public BookList() {
        books[0] = new Book("��������", "�޹���", 100, "�ŵ�С˵");
        books[1] = new Book("���μ�", "��ж�", 100, "�ŵ�С˵");
        books[2] = new Book("��¥��", "��ѩ��", 100, "�ŵ�С˵");
        size = 3;
    }
    //Getter����
    public Book getBook(int index){
            return books[index];
        }

    //Setter����
    public void setBook(int index,Book book){
        this.books[index]=book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
