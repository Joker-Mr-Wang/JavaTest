package Java_210202;

public class Main {

    public static Node createNode(){
        Node a =new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);
        Node d =new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return a;
    }
    public static void main(String[] args) {
        Node head=createNode();
//        //1.遍历链表
//    for (Node cur=head;cur!=null;cur=cur.next){
//        System.out.println(cur.val);
//        //寻找链表的最后一个节点(for版)
//        if (cur.next==null){
//            System.out.println(cur);
//        }
//    }
//
//        //2.寻找链表的最后一个节点(while版)
//        Node cur =head;
//    //若循环结束,这说明到了最后一个元素,则输出cur;
//        //cur可能是一个空指针,所以我们需要提前验证一下,防止出现空指针异常
//        //&&采用短路求值的思想,先对cur进行判断,若为空则不进行后续操作
//        while (cur!=null&&cur.next!=null){
//            cur=cur.next;
//        }
//        System.out.println(cur);
//       //2.1寻找链表的倒数第二个节点(while版)
//        Node cur =head;
//        while (cur!=null&&cur.next!=null&&cur.next.next!=null){
//            cur=cur.next;
//        }
//        System.out.println(cur);
//      //3寻找第n个元素,假设n=3;
//      Node cur=head;
//      int n=3;
//        for (int i = 1; i <n; i++) {
//            cur=cur.next;
//        }
//        System.out.println(cur);

//        //4.输出链表的长度
//        int size=0;
//        for (Node cur=head; cur!=null ; cur=cur.next) {
//            size++;
//        }
//        System.out.println("链表的长度:"+size);
        //5.寻找某个元素是否存在
        int find = 13;
        //循环遍历寻找元素
        Node cur=head;
        for (;cur!=null;cur=cur.next){
            //如果存在,则跳出循环
            if (cur.val==find){
                break;
            }
        }
        //如果输出的不是空指针,这说明之前的循环遍历找到了这个元素.
        if (cur!=null){
            System.out.println("此元素存在");
        }else {
            System.out.println("此元素不存在");
        }

    }
}
