package leetcode.¸´Ï°;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ·ÇµÝ¹é±éÀú¶þ²æÊ÷ {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n4.right = n8;
//		intranverse1(n1);
//		System.out.println();
//		intranverse3(n1);
//		System.out.println();
//		pretranverse1(n1);
//		System.out.println();
//		pretranverse2(n1);
//		System.out.println();
//		floortranverse(n1);
		floorPrintTranverse(n1);

	}

	public static void pretranverse(Node root) {
		Stack<Node> stack = new Stack<>();

		while (stack.size() != 0 || root != null) {
			while (root != null) {
				System.out.print(root.val);
				stack.add(root);
				root = root.left;
			}

			if (stack.size() != 0) {
				Node t = stack.pop();
				root = t.right;
			}
		}
	}

	public static void intranverse(Node root) {
		Stack<Node> stack = new Stack<Node>();

		while (stack.size() != 0 || root != null) {
			while (root != null) {
				stack.add(root);
				root = root.left;
			}
			if (stack.size() != 0) {
				Node t = stack.pop();
				System.out.print(t.val);
				root = t.right;
			}
		}
	}

	public static void pretranverse1(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val);
		pretranverse1(root.left);
		pretranverse1(root.right);
	}

	public static void pretranverse2(Node root) {
		Stack<Node> stack = new Stack<>();
		while (stack.size() != 0 || root != null) {
			while (root != null) {
				stack.add(root);
				System.out.print(root.val);
				root = root.left;
			}
			if (stack.size() != 0) {
				Node t = stack.pop();
				root = t.right;
			}
		}
	}

	public static void intranverse1(Node root) {
		if (root == null) {
			return;
		}
		intranverse1(root.left);
		System.out.print(root.val);
		intranverse1(root.right);
	}

	public static void intranverse3(Node root) {
		Stack<Node> stack = new Stack<>();
		while (stack.size() != 0 || root != null) {
			while (root != null) {
				stack.add(root);
				root = root.left;
			}
			if (stack.size() != 0) {
				Node t = stack.pop();
				System.out.print(t.val);
				root = t.right;
			}
		}
	}

	public static void floortranverse(Node root) {
		List<Node> list = new LinkedList<>();
		list.add(root);
		while (list.size() != 0) {
			Node n = list.remove(0);
			System.out.print(n.val);
			if (n.left != null) {
				list.add(n.left);
			}
			if (n.right != null) {
				list.add(n.right);
			}
		}
	}
	
	public static void floorPrintTranverse(Node root) {
		List<Node> list=new LinkedList<>();
		list.add(root);
		while(list.size()!=0) {
			int size=list.size();
			while(size-->0) {
				Node n=list.remove(0);
				System.out.print(n.val+" ");
				if(n.left!=null) {
					list.add(n.left);
				}
				if(n.right!=null) {
					list.add(n.right);
				}
			}
			System.out.println();
		}
	}
}

class Node {
	int val;
	Node left;
	Node right;

	public Node(int val) {
		this.val = val;
	}
}
