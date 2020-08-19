package Leetcode.LinkList;
import Utils.ListNode;

/**
 * 单链表反转
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * solution:https://leetcode.com/problems/reverse-linked-list/solution/
 */

public class ReverseLinkedList {
    //Recursive
    public ListNode ReverseList1(ListNode head){
        //step1 and step2
        if (head==null||head.next==null) return head;
        //recurse
        ListNode t = ReverseList1(head.next);
        //step3
        head.next.next = head;
        //step4
        head.next = null;
        //return head
        return t;
    }
    public ListNode ReverseList2(ListNode head){
        //Iterative
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args){
        int[] val = {1,2,3,4,5};
        //将数组转换为链表
        ListNode head = ListNode.createLinkedList(val);
        ListNode.printLinkedList(head);
        ReverseLinkedList rll = new ReverseLinkedList();
        //递归法
//        ListNode new_head = rll.ReverseList1(head);
        //迭代法
        ListNode new_head = rll.ReverseList2(head);
        ListNode.printLinkedList(new_head);
    }
}
