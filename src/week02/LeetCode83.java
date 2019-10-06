package week02;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LeetCode83 {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode current=head;
            while(head!=null&&head.next!=null){
                if(head.val==head.next.val){
                    head.next=head.next.next;
                }else{
                    head=head.next;
                }

            }
        return current;
    }
}
