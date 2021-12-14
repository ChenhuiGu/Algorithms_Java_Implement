package Algorithm4th.Test;

import Algorithm4th.LinkList.PrintCommonPart;
import Algorithm4th.utils.Node;
import org.junit.Test;

public class PrintCommonPartTest {

    @Test
    public void printMethodTest(){
        Node head1 = new Node(1);
        Node node2 = new Node(22);
        Node node3 = new Node(32);
        Node node4 = new Node(42);
        Node node5 = new Node(52);
        Node node6 = new Node(62);
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;
        Node head2 = new Node(1);
        Node node22 = new Node(2);
        Node node23 = new Node(33);
        Node node24 = new Node(42);
        Node node25 = new Node(52);
        Node node26 = new Node(6);
        head2.next = node22;
        node22.next = node23;
        node23.next = node24;
        node24.next = node25;
        node25.next = node26;
        node26.next = null;
        PrintCommonPart.printMethod(head1,head2);
    }
}
