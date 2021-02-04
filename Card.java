package Java_210131;
//扑克牌类
public class Card {
    //构建牌的基本信息：花色和点数
    public String huase;
    public String dianshu;

    public Card(String huase,String dianshu){
        this.huase=huase;
        this.dianshu =dianshu;
    }

    @Override
    public String toString(){return "["+this.huase+this.dianshu+"]";}
}
