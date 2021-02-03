package Java_210202;
//扑克牌类
public class Card {
    //花色
    public String suit;
    //点数
    public String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    //重写tostring方法

    @Override
    public String toString() {
        return "[" + this.suit+this.rank+"]";
    }
}
