package LinkList;

import Algorithm4th.utils.Node;

/**
 * 打印2个升序链表的公共部分
 */

public class PrintCommonPart {

    public static void printMethod(Node head1, Node head2){
        System.out.println("The commom part: ");
        while(head1.next != null && head2.next != null){
            if(head1.value > head2.value){
                head2 = head2.next;
            }else if(head1.value < head2.value){
                head1 = head1.next;
            }else {
                System.out.println(head1.value);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }




}
