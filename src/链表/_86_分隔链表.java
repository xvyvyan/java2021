package 链表;

/**
 * @author wei junbin
 * @create 2021-09-23 10:25
 */
public class _86_分隔链表 {
    public ListNode partition(ListNode head, int x) {
        if (head==null)return null;
        ListNode lhead=new ListNode(0   );//使用空指针
        ListNode ltail=lhead;
        ListNode rhead=new ListNode(0   );
        ListNode rtail=rhead;
        while (head!=null){
            if (head.val<x){
                ltail=ltail.next=head;
            }else {
                rtail=rtail.next=head;
            }
            head=head.next;

        }
        rtail.next=null;
        ltail.next=rhead.next;


        return lhead.next;





    }
}
