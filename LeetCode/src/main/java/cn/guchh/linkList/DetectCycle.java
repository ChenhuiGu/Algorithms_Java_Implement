package cn.guchh.linkList;

import java.util.HashSet;

/**
 * 找到环形链表的入环节点
 * @author chenhuigu
 */
public class DetectCycle {
    /**
     * 哈希表,不修改链表
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        HashSet<ListNode> hashSet = new HashSet<>();
        while (pos != null){
            if(!hashSet.contains(pos)){
                hashSet.add(pos);
            }else {
                return pos;
            }
            pos = pos.next;
        }
        return null;
    }

    /**
     * 快慢指针 + 数学推导
     * @param head
     * @return
     */
    public ListNode detectCycle02(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (slow != fast){
            if(fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
