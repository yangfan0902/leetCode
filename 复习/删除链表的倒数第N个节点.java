package leetcode.��ϰ;

public class ɾ������ĵ�����N���ڵ� {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	      ListNode p1=head;
	      ListNode p2=head;
	      while(n>0&&p1!=null) {
	    	  p1=p1.next;
	    	  n--;
	      }
	      if(n==0&&p1==null) {
	    	  return head.next;
	      }
	      if(n>0&&p1==null) {
	    	  return null;
	      }
	      while(p1.next!=null) {
	    	  p1=p1.next;
	    	  p2=p2.next;
	      }
	      p2.next=p2.next.next;
	      return head;
	      
	 }
}
class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	     }
