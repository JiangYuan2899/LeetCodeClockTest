package week02;

import week003.TreeNode;
//手动创建链表
public class LinkedCreator {
	
	public static ListNode createSampleListNode(){
		ListNode head =new ListNode(4);
		ListNode one =new ListNode(5);
		ListNode two =new ListNode(1);
		ListNode three =new ListNode(9);
		head.next=one;
		one.next=two;
		two.next=three;
		return three.next;
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("111");
		Thread.sleep(Integer.MAX_VALUE);
	}
}
