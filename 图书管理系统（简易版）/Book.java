package Java_210126;
//Book 类表示一本书的信息

import java.util.SplittableRandom;

public class Book {
    //原则上，能用private，就用private
    private String name;//书名
    private String anther;//作者
    private double price;//价格
    private String type;//类别
    private boolean isBorrowed = false;//是否借出

    //使用构造方法对这个成员进行初始化


    public Book(String name, String anther, double price, String type) {
        this.name = name;
        this.anther = anther;
        this.price = price;
        this.type = type;
    }
}
