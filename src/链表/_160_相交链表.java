package 链表;

/**
 * @author wei junbin
 * @create 2021-09-23 9:14
 */
public class _160_相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null) return null;
        ListNode curB=headB,curA=headA;
        while (curA!=curB){
          curA=(curA==null)?headB:curA.next;
          curB=(curB==null)?headA:curB.next;
        }
        return curA;
      }
}
