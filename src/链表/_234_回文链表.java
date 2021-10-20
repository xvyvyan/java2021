package 链表;

/**
 * @param
 * @author wei junbin
 * @create 2021-09-23 19:43
 */
public class _234_回文链表 {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;
        if (head.next.next == null) return head.val == head.next.val;
        ListNode mid = middleNode(head);
        ListNode lhead = head;
        ListNode rhead = reverseList(mid.next);
        while (rhead != null) {
            if (rhead.val != lhead.val) return false;
            rhead = rhead.next;
            lhead = lhead.next;
        }
        reverseList(rhead);
        return true;
    }
    //反转链表
    private ListNode reverseList(ListNode head) {
        ListNode newhead = null;
        while (head != null) {
            ListNode tem = head.next;
            head.next = newhead;
            newhead = head;
            head = tem;
        }
        return newhead;
    }

    //使用快慢指针找到中心节点
    private ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
