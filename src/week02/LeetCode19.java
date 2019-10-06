package week02;

public class LeetCode19 {
	/*
	 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。 示例：给定一个链表: 1->2->3->4->5, 和 n = 2.
	 * 当删除了倒数第二个节点后，链表变为 1->2->3->5. 1234567890 题解： 思路一：
	 * 找到倒数第n的元素，将n+1的节点.next指向n-1既可。先遍历链表，记录总数count,count-n=n+1,count-n+2=n-1。
	 * 这种方式不可行，给定时ListNode 不是java的LinkedList 无法使用java方法去定位第n个元素。
	 * 思路二：参考题解答案采用双向指针方法，第一个指针和第二个指针差n+1当第一个指针指向空时，第二个指针去指向一个第一个指针
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		// 遍历链表,记录有多少元素
		// ListNode dummy =new ListNode(0);
		// dummy.next=head;
		// int length=0;
		// ListNode first=head;
		// while(first!=null){
		// length++;
		// first = first.next;
		// }
		// int front =length-n;
		// int behand =length-n+2;
		ListNode pointer = new ListNode(0);
		pointer.next = head;
		ListNode first = pointer;
		ListNode second = pointer;
		for (int i = 1; i <= n + 1; i++) {
			first = first.next;
		}
		while (first != null) {
			first = first.next;
			second = second.next;
		}
		second = second.next.next;
		return pointer.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
