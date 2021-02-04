package Java_210131;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//�˿�����Ϸ
//ÿ��һ�飨���ţ���ɫ��ͬ���˿��ƾͻ�1�֣�������ߵ���һ�ʤ
//�����ڵ÷���ͬ������������Ŵ���˻�ʤ��
public class PokerGame {
    public static void main(String[] args) {
        //0�˵�
        System.out.println("��ӭʹ���˿�����Ϸ��");
        //1����һ���˿���
        List<Card> poker=buyPoker();
        //TODO ����
        //System.out.println(poker);
        //2�����˿���
        Collections.shuffle(poker);
        //TODO ����
        //System.out.println(poker);
        //3.Ϊÿλ��ҷ��ƣ�ÿ����Ҷ���һ��List<Card>
        //������������ң�ÿ����ҷ������ƣ���poker�ƶ��г�ȡ��
        List<List<Card>> players=player(3,5,poker);
        //4.չʾ����

        for (int i = 0; i <players.size(); i++) {
            //player�б���ÿλ��ҵ�����
            List<Card> player =players.get(i);
            //5����������
            System.out.println("���"+(i+1)+"��������"+player);
        }
        //6�ж�ʤ��
        result(players);


    }

    private static void result(List<List<Card>> players) {
        //����һ�����鴢��ÿλ��ҵĳɼ�
            int[] numResult =new int[players.size()];
            //ÿ�����������ͬ��ɫ������÷�+1��
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
        //ѡ���÷���ߵ����
        int max =0;
        for (int i = 1; i <numResult.length ; i++) {
            if (numResult[max]<=numResult[i]){
                max=i;
            }
        }
        System.out.println("��ʤ���ǣ�"+(max+1)+"����ҡ�\n���ĵ÷���"+numResult[max]+"�֡����������ǣ�"+players.get(max));
    }

    private static List<List<Card>> player(int playerNumber,int CardsNumber,List<Card> poker) {
        List<List<Card>> players=new ArrayList<>();
        //�����ⲿ���������Ҹ���
        for (int i = 0; i <playerNumber ; i++) {
            players.add(new ArrayList<>());
        }
        //����ÿ�˷�5����
        //����������
        for (int i = 0; i <CardsNumber ; i++) {
            //�ڲ���Ʒ��Ƶ���
            for (int j = 0; j <playerNumber ; j++) {
                //1.���ƿ������ȡһ���ƣ���ȡ�������˳鲻�����ƣ�
                //remove�Ƴ��б�ָ��λ�õ�һ��Ԫ�أ�����Ԫ�غ����Ԫ���������ƶ�һλ�����ر��Ƴ���Ԫ�ء�
                Card card =poker.remove(0);
                //2.ÿ���˷ֵĵ�һ����
                List<Card> player =players.get(j);
                player.add(card);
            }
        }
        return players;
    }


    private static List<Card> buyPoker() {
        List<Card> poker =new ArrayList<>();
        String[] huase ={"����","����","��Ƭ","�ݻ�"};
        //�����ƻ�ɫ
        for (int i = 0; i <huase.length ; i++) {
            //�ڲ���Ƶ���
            for (int j = 2; j <=10 ; j++) {
                //poker.add(Card��)��Ҫnewһ��Card�ſ��Ը�ֵ
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
