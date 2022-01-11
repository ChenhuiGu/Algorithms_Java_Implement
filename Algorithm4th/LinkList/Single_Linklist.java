package Algorithm4th.LinkList;

public class Single_Linklist {
    private Node head;
    private int size;
    public Single_Linklist(){
        //构造函数，创建对象时赋值
        this.size = 0;
        head = null;
    }
    class Node{
        //泛型
        int item;
        Node next = null;
        public Node(int item){
            //构造函数
            this.item = item;
        }
    }
    public void insertNth(int data,int position){
        Node node = new Node(data);
        //size 确定边界 or head是否为空节点
//        if(head == null) head = node;
        //临时
        Node curr = head;
        //遍历到指定位置
        for(int i= 0;i<position;i++){
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
    }
}
