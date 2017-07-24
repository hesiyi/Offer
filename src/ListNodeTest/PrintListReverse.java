package ListNodeTest;

import java.util.Stack;

/**
 * Created by 49005 on 2017/3/16.
 * 倒序打印一个链表的元素,一般会想到使用栈辅助
 */
public class PrintListReverse {
    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        ListNode listNode1=new ListNode();
        ListNode listNode2=new ListNode();
        listNode.date=1;
        listNode1.date=2;
        listNode2.date=3;
        listNode.next=listNode1;
        listNode1.next=listNode2;
        printList(listNode);

    }
    public static void printList(ListNode listNode){
        Stack<ListNode> stack=new Stack<>();
        //放进栈里
        while (listNode!=null){
            stack.push(listNode);
            listNode=listNode.next;
        }
        //打印栈里面的元素
        while(!stack.isEmpty()){
            System.out.println(stack.pop().date);
        }
    }

}
