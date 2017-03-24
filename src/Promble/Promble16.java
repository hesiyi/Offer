package Promble;

import java.util.Stack;

//反转链表 用栈实现
public class Promble16 {
	public static void main(String[] args) {
		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode third=new ListNode();
		ListNode forth=new ListNode();
		head.next=second;
		second.next=third;
		third.next=forth;
		head.data=1;
		second.data=2;
		third.data=3;
		forth.data=4;
		ListNode listNode=reverseList(head);
		System.out.println(listNode.data);
	}

	private static ListNode reverseList(ListNode head) {
		// TODO Auto-generated method stub
		//考虑的情况要全面
		if(head==null)
			return null;
		if(head.next==null)
			return head;
		Stack<ListNode> listNodes=new Stack<>();
		while(head!=null){
			listNodes.push(head);
			head=head.next;
		}
		ListNode head1=listNodes.pop();
		return head1;
	}
}
