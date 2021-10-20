package 链表;

/**
 * @author wei junbin
 * @create 2021-09-17 11:16
 * 思路：构建一个新链表；虚拟头节点
 */
public class _203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode newhead = new ListNode(0);//使用虚拟头节点
        ListNode newtail = newhead;
        while (head!=null){
            if (head.val!=val){
                newtail=newtail.next=head;
                ;

            }
            head=head.next;

        }
        newtail.next=null;
        return newhead.next;


    }


}
