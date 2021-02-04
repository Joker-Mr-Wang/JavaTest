package Java_210131;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//扑克牌游戏
//每有一组（两张）花色相同的扑克牌就积1分，分数最高的玩家获胜
//若存在得分相同的情况，玩家序号大的人获胜。
public class PokerGame {
    public static void main(String[] args) {
        //0菜单
        System.out.println("欢迎使用扑克牌游戏！");
        //1构建一副扑克牌
        List<Card> poker=buyPoker();
        //TODO 测试
        //System.out.println(poker);
        //2打乱扑克牌
        Collections.shuffle(poker);
        //TODO 测试
        //System.out.println(poker);
        //3.为每位玩家发牌，每个玩家都是一个List<Card>
        //假设有三个玩家，每个玩家发五张牌，从poker牌堆中抽取牌
        List<List<Card>> players=player(3,5,poker);
        //4.展示手牌

        for (int i = 0; i <players.size(); i++) {
            //player中保存每位玩家的手牌
            List<Card> player =players.get(i);
            //5依次输出结果
            System.out.println("玩家"+(i+1)+"的手牌是"+player);
        }
        //6判定胜负
        result(players);


    }

    private static void result(List<List<Card>> players) {
        //创建一个数组储存每位玩家的成绩
            int[] numResult =new int[players.size()];
            //每个玩家若有相同花色的牌则得分+1；
        for (int i = 0; i <players.size() ; i++) {
            int count =0;
            List<Card> player =players.get(i);
            for (int j = 0; j <player.size()-1 ; j++) {
                for (int k = j+1; k <player.size() ; k++) {
                    if (player.get(j).huase.equals(player.get(k).huase)){
                        count++;
                    }
                }
            }
            numResult[i]=count;
        }
        //选出得分最高的玩家
        int max =0;
        for (int i = 1; i <numResult.length ; i++) {
            if (numResult[max]<=numResult[i]){
                max=i;
            }
        }
        System.out.println("获胜的是："+(max+1)+"号玩家。\n他的得分是"+numResult[max]+"分。他的手牌是："+players.get(max));
    }

    private static List<List<Card>> player(int playerNumber,int CardsNumber,List<Card> poker) {
        List<List<Card>> players=new ArrayList<>();
        //根据外部数量添加玩家个数
        for (int i = 0; i <playerNumber ; i++) {
            players.add(new ArrayList<>());
        }
        //假设每人发5张牌
        //外层控制牌数
        for (int i = 0; i <CardsNumber ; i++) {
            //内层控制发牌的人
            for (int j = 0; j <playerNumber ; j++) {
                //1.从牌库里面抽取一张牌（抽取后其他人抽不到此牌）
                //remove移除列表指定位置的一个元素，将该元素后面的元素们往左移动一位。返回被移除的元素。
                Card card =poker.remove(0);
                //2.每个人分的到一张牌
                List<Card> player =players.get(j);
                player.add(card);
            }
        }
        return players;
    }


    private static List<Card> buyPoker() {
        List<Card> poker =new ArrayList<>();
        String[] huase ={"红桃","黑桃","方片","草花"};
        //外层控制花色
        for (int i = 0; i <huase.length ; i++) {
            //内层控制点数
            for (int j = 2; j <=10 ; j++) {
                //poker.add(Card类)需要new一个Card才可以赋值
                poker.add(new Card(huase[i],String.valueOf(j)));
            }
            poker.add(new Card(huase[i],"J"));
            poker.add(new Card(huase[i],"Q"));
            poker.add(new Card(huase[i],"K"));
            poker.add(new Card(huase[i],"A"));
        }
        poker.add(new Card("","JOKER"));
        poker.add(new Card("","joker"));
        return poker;
    }
}
