package Promble;
//反转链表的另一种方法
public class Promble16one {
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
		Promble16one test=new Promble16one();
		ListNode resultListNode=test.reverseList(head);
		System.out.println(resultListNode.data);
		}
		public ListNode reverseList(ListNode head){
		if(head==null){
		return null;
		}
		if(head.next==null){
		return head;
		}
		ListNode preListNode=null;
		ListNode nowListNode=head;
		ListNode reversedHead=null;
		while(nowListNode.next!=null){
		ListNode nextListNode=nowListNode.next;
		if(nextListNode==null)
		reversedHead=nextListNode;
		nowListNode.next=preListNode;
		preListNode=nowListNode;
		nowListNode=nextListNode;
		}
		return nowListNode;
	}
}

