package Java_210126;
//Book ���ʾһ�������Ϣ

import java.util.SplittableRandom;

public class Book {
    //ԭ���ϣ�����private������private
    private String name;//����
    private String anther;//����
    private double price;//�۸�
    private String type;//���
    private boolean isBorrowed = false;//�Ƿ���

    //ʹ�ù��췽���������Ա���г�ʼ��


    public Book(String name, String anther, double price, String type) {
        this.name = name;
        this.anther = anther;
        this.price = price;
        this.type = type;
    }
}
