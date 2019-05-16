package leetcode.复习;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class 字母大小写全排列 {
	public static void main(String[] args) {
		List<Character> list=new ArrayList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		List<String> res=new ArrayList<>();
		List<Character> li=new ArrayList<Character>();
		StringBuilder b=new StringBuilder();
		
	}
	public List<String> letterCasePermutation(String S) {
		List<String> res=new ArrayList<>();
		StringBuilder b=new StringBuilder();
		HashSet<String> set=new HashSet<String>();
		helper(res,0,set,S);
		return res;
        
    }
	public static void helper(List<String> res,int left,HashSet<String> set,String s) {
		if(left==s.length()) {
			if(!set.contains(s)) {
				res.add(s);
				set.add(s);
			}
			
			return;
		}
		if(s.charAt(left)<'9') {
			helper(res,left+1,set,s);
		}else {
			s=new StringBuffer(s).replace(left, left+1, change(s.charAt(left))+"").toString();
			helper(res,left+1,set,s);
			
			
			s=new StringBuffer(s).replace(left, left+1, change(s.charAt(left))+"").toString();
			helper(res,left+1,set,s);
	
		}
	}
	public static char change(Character c) {
		if(Character.isUpperCase(c)) {
			return Character.toLowerCase(c);
		}
		return Character.toUpperCase(c);
	}
}
