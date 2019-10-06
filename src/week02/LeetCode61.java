package week02;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LeetCode61 {
	public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        ListNode tmp=head;
        int len =0;
        while(tmp!=null){
            tmp=tmp.next;
            len++;
        }
        k=k%len;
        if(k==0){
            return head;
        }
        ListNode node=head;
        tmp=head;
        while(k>0){
            k--;
            tmp=tmp.next;
        }
        while(tmp.next!=null){
            head=head.next;
            tmp=tmp.next;
        }
        ListNode res = head.next;
        head.next = null;
        tmp.next = node;
        return res; 
    }
}
