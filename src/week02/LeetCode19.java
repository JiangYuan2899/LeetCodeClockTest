package week02;

public class LeetCode19 {
	/*
	 * ����һ������ɾ������ĵ����� n ���ڵ㣬���ҷ��������ͷ��㡣 ʾ��������һ������: 1->2->3->4->5, �� n = 2.
	 * ��ɾ���˵����ڶ����ڵ�������Ϊ 1->2->3->5. 1234567890 ��⣺ ˼·һ��
	 * �ҵ�������n��Ԫ�أ���n+1�Ľڵ�.nextָ��n-1�ȿɡ��ȱ���������¼����count,count-n=n+1,count-n+2=n-1��
	 * ���ַ�ʽ�����У�����ʱListNode ����java��LinkedList �޷�ʹ��java����ȥ��λ��n��Ԫ�ء�
	 * ˼·�����ο����𰸲���˫��ָ�뷽������һ��ָ��͵ڶ���ָ���n+1����һ��ָ��ָ���ʱ���ڶ���ָ��ȥָ��һ����һ��ָ��
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		// ��������,��¼�ж���Ԫ��
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
