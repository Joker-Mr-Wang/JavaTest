package Java_210131;
//�˿�����
public class Card {
    //�����ƵĻ�����Ϣ����ɫ�͵���
    public String huase;
    public String dianshu;

    public Card(String huase,String dianshu){
        this.huase=huase;
        this.dianshu =dianshu;
    }

    @Override
    public String toString(){return "["+this.huase+this.dianshu+"]";}
}
