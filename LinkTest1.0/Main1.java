package Java_210203;

import com.sun.javafx.scene.NodeEventDispatcher;

public class Main1 {
    //不带傀儡节点的链表
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
//带傀儡节点的链表
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
        Node head =createNode();
         //newHead是被修改后的头节点
        //要想修改头结点需要返回值
        Node newHead=remove(head,0);
        print(newHead);
//        int del=2;
//        //按照元素下标进行删除
//        removeNode(head,2);//删除了[3]
//        //按照元素位置进行删除
//        removeNode(head,head.next);//删除了[2]
//Node head =createNode();
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
//        Node head =createDummyNode();
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
//        //插入到头结点后面
//        Node newNode1 =new Node(1001);
//        Node prev1 =head;
//        newNode1.next=prev1.next;
//        prev1.next=newNode1;
//        for (Node cur=head.next;cur!=null;cur=cur.next){
//            System.out.println(cur);//[1001][1][2][3][4]
//        }
    }

    //1.1删除节点(按照位置进行删除),时间复杂度O(n)
    private static void removeNode(Node head,Node del) {
        //寻找到val所对应的位置以及val前一个的位置
        Node prev =head;
        while (prev!=null&&prev.next!=del){
            prev=prev.next;
        }
        //可能存在未找到的情况,则将函数进行返回
        if (prev==null){
            return;
        }
        //找到就处理元素
        prev.next=del.next;
    }
    //1.2删除节点(按照位置进行删除),时间复杂度O(1)
    //这个操作无法删除掉最后一个节点,最后一个节点无法修改
    private static void removeNode1(Node head,Node del) {
        //把删除元素下一个的节点内容全都放入该节点,即可完成删除
        Node delNext=del.next;
        del.val=delNext.val;
        del.next=delNext.next;
    }
//2.删除节点(按照元素的值进行删除),时间复杂度O(n)
    private static void removeNode(Node head,int val) {
        //寻找到val所对应的位置以及val前一个的位置
         Node prev =head;
         while (prev!=null&&prev.next!=null&&prev.next.val==val){
             prev=prev.next;
         }
         //可能存在未找到的情况,则将函数进行返回
        if (prev==null&&prev.next==null){
            return;
        }
        //找到就处理元素
        Node delNode=prev.next;
        prev.next=delNode.next;
    }
//3.删除节点(按照数据位置下标进行删除),时间复杂度O(n)
    private static Node remove(Node head,int index) {
        Node prev=head;
        //链表为空无法删除
        if (head==null){
            return null;
        }
        //删除头结点,需要有返回值,无返回值是无法对head进行有效操作的
         //这里的head只存在于remove方法的栈针,我们需要作用到外面main方法中去.
        if (index==0){
            head=head.next;
            return  head;
        }
        //寻找需要删除的前一个元素
         for (int i = 0; i <index-1; i++) {
             prev=prev.next;
         }
         //进行删除
         Node del=prev.next;
         prev.next=del.next;
         return head;
}
//遍历链表
    private static void print(Node head) {
        for (Node node=head;node!=null;node=node.next){
            System.out.println(node);
        }
    }
}
