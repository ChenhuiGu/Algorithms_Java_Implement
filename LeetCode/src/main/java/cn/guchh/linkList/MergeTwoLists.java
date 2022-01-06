package cn.guchh.linkList;

/**
 * @author chenhuigu
 */
public class MergeTwoLists {
    /**
     * 迭代
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists01(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        ListNode curr = preHead;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                curr.next = l2;
                l2 = l2.next;
            }else {
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }
        preHead.next = l1==null?l2:l1;
        return preHead.next;
    }

    public ListNode mergeTwoLists02(ListNode l1, ListNode l2) {
        if(l1 ==null) {
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val > l2.val){
            l2.next = mergeTwoLists02(l1,l2.next);
            return l2;
        }else {
            l1.next = mergeTwoLists02(l1.next,l2);
            return l1;
        }

    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}