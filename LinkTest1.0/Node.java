package Java_210202;

public class Node {
    //节点值
    public int val;
    //下一个节点
    public Node next =null;

    public Node(int val){
        this.val=val;
    }
    @Override
    public String toString(){
        return "[" +val+"]";
    }
}
