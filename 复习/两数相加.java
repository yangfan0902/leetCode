package leetcode.复习;

public class 两数相加 {
	public static void main(String[] args) {
		ListNode l1=new ListNode(5);
		ListNode l2=new ListNode(4);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(5);
		ListNode l5=new ListNode(6);
		ListNode l6=new ListNode(4);
		
//		l1.next=l2;
//		l2.next=l3;
//		l4.next=l5;
//		l5.next=l6; 
		
		ListNode res=addTwoNumbers(l1,l4);
		System.out.print(res);
		
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum=l1.val+l2.val;
    	int addTonext=sum>9?1:0;
    	sum=sum>9?sum-10:sum;
    	ListNode node=new ListNode(sum);
    	ListNode head=new ListNode(0);
    	ListNode rair=head;
    	rair.next=node;
    	rair=rair.next;
		l1=l1.next;
		l2=l2.next;
        while(l1!=null&&l2!=null) {
        	sum=l1.val+l2.val+addTonext;
        	addTonext=sum>9?sum/10:0;
        	sum=sum>9?sum-10*addTonext:sum;
        	ListNode n=new ListNode(sum);
        	rair.next=n;
        	rair=rair.next;
        	l1=l1.next;
        	l2=l2.next;
        }
        while(l1!=null) {
        	sum=sum=l1.val+addTonext;
        	addTonext=sum>9?sum/10:0;
        	sum=sum>9?sum-10*addTonext:sum;
        	ListNode n=new ListNode(sum);
        	rair.next=n;
        	rair=rair.next;
        	l1=l1.next;
        }
        while(l2!=null) {
        	sum=sum=l2.val+addTonext;
        	addTonext=sum>9?sum/10:0;
        	sum=sum>9?sum-10*addTonext:sum;
        	ListNode n=new ListNode(sum);
        	rair.next=n;
        	rair=rair.next;
        	l2=l2.next;
        }
        if(addTonext>0) {
        	ListNode n=new ListNode(addTonext);
        	rair.next=n;
        }
        return head.next;
    }
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
}
