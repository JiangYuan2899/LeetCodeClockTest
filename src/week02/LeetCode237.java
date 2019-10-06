package week02;

public class LeetCode237 {
	/**
	 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点�? 
	 * 输入: head = [4,5,1,9], node= 5 输出: [4,1,9] 
	 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
	 *	
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	class Solution {
	    public void deleteNode(ListNode node) {
	        ListNode pointer =new ListNode(0);
	        int i=0;
	        while(pointer.next==node.next){
	        	i++;
	        }
	        for(int j=0;j<i;j++){
	        	pointer=pointer.next;
	        	node.next=pointer;
	        }

	    }
	}
}
