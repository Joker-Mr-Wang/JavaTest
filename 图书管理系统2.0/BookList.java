package Java_210126;

import jdk.nashorn.internal.objects.annotations.Getter;

//通过这个类把多个Book对象放到一起
public class BookList   {
    //100指的是这个数组的最大容量capacity
    private Book[] books = new Book[100];
    //size为书籍数量，就地初始化为0；
    private int size = 0;

    public BookList() {
        books[0] = new Book("三国演义", "罗贯中", 100, "古典小说");
        books[1] = new Book("西游记", "吴承恩", 100, "古典小说");
        books[2] = new Book("红楼梦", "曹雪芹", 100, "古典小说");
        size = 3;
    }
    //Getter方法
    public Book getBook(int index){
            return books[index];
        }

    //Setter方法
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
