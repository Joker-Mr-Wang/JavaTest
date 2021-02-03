package Java_210202;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



//扑克牌游戏
public class PokerGame {
    //里面放置四种花色
    public static final String[] suits ={"♥","♠","♣","♦"};

    public static List<Card> buyPoker(){
        List<Card> poker=new ArrayList<>();
        //处理四种花色
        for (int i=0;i<4;i++){
            //内层控制十三张牌
            for (int j = 2; j <=10 ; j++) {
                //将牌添加到数组中，花色，数字（利用valueof将int转换成string类型）
                poker.add(new Card(suits[i],String.valueOf(j)));
            }
            poker.add(new Card(suits[i],"J"));
            poker.add(new Card(suits[i],"Q"));
            poker.add(new Card(suits[i],"K"));
            poker.add(new Card(suits[i],"A"));
        }
        poker.add(new Card("","JOKER"));
        poker.add(new Card("","joker"));
        return poker;
    }
    //list本身就是可变对象，直接就可以修改,无需返回list<card>
    private static void shuffle(List<Card> poker){
        Random random =new Random();
        //TODO,i?
        for (int i=poker.size()-1;i>0;i--){
            //产生[0,i)的随机数,要和哪个位置的元素进行交换;
            //random.nextInt(int i).输出一个[0,i)的随机值
            int pos =random.nextInt(i);
            swap(poker,i,pos);

        }
    }

    private static void swap(List<Card> poker,int i,int j){
                     Card tmp=poker.get(i);
                     poker.set(i,poker.get(j));
                     poker.set(j,tmp);
    }

    public static void main(String[] arg){
        //1.创建一副扑克牌
        List<Card> poker =buyPoker();
        System.out.println(poker);
        System.out.println(poker.get(0));
        //2.洗牌，从前往后遍历数组，与之前的任意一个交换位置
        shuffle(poker);
        System.out.println(poker);
    }

}
