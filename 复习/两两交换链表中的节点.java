package leetcode.复习;

import java.util.LinkedList;
import java.util.List;

public class 两两交换链表中的节点 {
	public static void main(String[] args) {
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		
		n1.next=n2;
		n2.next=n3;
//		n3.next=n4;
		ListNode head=swapPairs(n1);
	}
	public static ListNode swapPairs(ListNode head) {
		if(head==null||head.next==null) {
			return head;
		}
        List<ListNode> list1=new LinkedList<>();
        List<ListNode> list2=new LinkedList<>();
        
        int flag=1;
        while(head!=null) {
        	if(flag%2!=0) {
        		list1.add(head);
        	}else {
        		list2.add(head);
        	}
        	flag++;
        	head=head.next;
        }
        head=list2.remove(0);
        ListNode rear=head;
        int f=1;
        while(list1.size()!=0&&list2.size()!=0) {
        	ListNode cur;
        	if(f%2!=0) {
        		cur=list1.remove(0);
        	}else {
        		cur=list2.remove(0);
        	}
        	rear.next=cur;
        	rear=cur;
        	f++;
        }
        while(list1.size()!=0) {
        	rear.next=list1.remove(0);
        	rear=rear.next;
        }
        while(list2.size()!=0) {
        	rear.next=list2.remove(0);
        	rear=rear.next;
        }
        rear.next=null;
        return head;
        
	}
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }