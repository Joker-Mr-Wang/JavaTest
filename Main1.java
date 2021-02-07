package Java_210203;

public class Main1 {
    public  static Node createNode(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return a;
    }

    public  static Node createDummyNode(){
        //dummy是傀儡结点无实际意义
        Node dummy= new Node(0);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        dummy.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return dummy;
    }
    public static void main(String[] args) {
//        Node head =createNode();
//        //1.插入到链表中间
//        //在第一个和第二个节点中插入
//        Node prev =head;
//        Node newNode=new Node(100);
//        //1.把第二节点接到插入元素的后面
//        newNode.next=prev.next;
//        //2.把插入节点放到第一个节点的后面
//        //二者顺序呢不能调换
//        prev.next=newNode;
//        for (Node cur=head;cur!=null;cur=cur.next){
//            System.out.println(cur);
//        }
//        //2.插入到链表头部
//        Node newNode=new Node(101);
//        //把需要插入的元素放到第一个元素的前面;
//        newNode.next=head;
//        //把需要插入的元素放到头结点的后面;
//        head=newNode;
//        for (Node cur=head;cur!=null;cur=cur.next){
//            System.out.println(cur);
//        }

        //带傀儡结点的链表
        Node head =createDummyNode();
//        //一.在1,2中插入一个数字
//        //(1)创建需要加入的结点
//        Node newNode =new Node(100);
//        //(2)获取到被插入元素前一个元素的位置(元素1)
//        Node prev =head.next;
//        //(3)将前一个元素的下一个结点放到插入元素的后面
//        newNode.next=prev.next;
//        //(4)将插入元素放在前一个元素的后面
//        prev.next=newNode;
//        for (Node cur=head.next;cur!=null;cur=cur.next){
//            System.out.println(cur);//[1][100][2][3][4]
//        }
        //插入到头结点后面
        Node newNode1 =new Node(1001);
        Node prev1 =head;
        newNode1.next=prev1.next;
        prev1.next=newNode1;
        for (Node cur=head.next;cur!=null;cur=cur.next){
            System.out.println(cur);//[1001][1][2][3][4]
        }
    }
}
