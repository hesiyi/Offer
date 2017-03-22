package Promble;
//双指针  链表中倒数第k个节点
public class Promble5 {
	public static void main(String[] args) {
		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode third=new ListNode();
		ListNode forth=new ListNode();
		head.next=second;
		second.next=third;
		third.next=forth;
		head.date=1;
		second.date=2;
		third.date=3;
		forth.date=4;
		
		Promble5 promble5=new Promble5();
		ListNode node=promble5.findToTail(head,3);
		System.out.println(node.date);
		
	}
	public static ListNode  findToTail(ListNode head,int k){
		if(head==null||k==0){
			return null;
		}
		ListNode resultNode=null;
		ListNode headListNode=head;
		for(int i=0;i<k-1;i++){
			if(headListNode.next!=null){
			   headListNode=headListNode.next;
			}else{
				return null;
			}
		}
		resultNode=head;
		
		while (headListNode.next!=null) {
			resultNode=resultNode.next;
			headListNode=headListNode.next;
		}
		return resultNode;		
	}

}
