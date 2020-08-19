package Leetcode.LinkList;
import Utils.ListNode;
/**
 *合并2个有序链表成为新的有序链表
 *  Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * solution:https://leetcode.com/problems/merge-two-sorted-lists/discuss/736619/O(n)-solution-wvideo-whiteboard-explanation
 */
public class MergeLinkList {
    //循环
    public static ListNode merge01(ListNode l1,ListNode l2){
        ListNode prehead = new ListNode(0);
        ListNode prev = prehead;
        //如果任意为空
        while(l1!=null && l2!=null){
            if (l1.val < l2.val){
                prehead.next = l1;
                l1 = l1.next;
            }
            else{
                prehead.next = l2;
                l2 = l2.next;
            }
            prehead = prehead.next;
        }
        //三元运算法：expression1 ? expression2 : expression3（true for expression2）
        prehead.next = l1 == null ?l2:l1;
        return prev.next;
    }
    //递归
    public static ListNode merge02(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val){
            l1.next = merge02(l1.next,l2);
            return l1;
        }else {
            l2.next = merge02(l1,l2.next);
            return l2;
        }

    }
    public static void main(String[] args){
        int[] val1 = {1,2,4};
        ListNode l1 = ListNode.createLinkedList(val1);
        int[] val2 = {1,2,3};
        ListNode l2 = ListNode.createLinkedList(val2);
        ListNode l3 = merge01(l1,l2);
        ListNode.printLinkedList(l3);

    }
}
