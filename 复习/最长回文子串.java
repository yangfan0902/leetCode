package leetcode.复习;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class 最长回文子串 {
	public static void main(String[] args) {
		String s="abadd";
		ConcurrentHashMap h;
		HashMap<String,String> m = new HashMap<String, String>();
		TreeMap<String,String> map=new TreeMap<String, String>();
		Object obj;
		System.out.print(longestPalindrome(s));
	}
	public static String longestPalindrome(String s) {
		if(s==null||s.length()==0) {
			return "";
		}
        int max=1;
        String res=s.substring(0,1);
        for(int i=0;i<s.length();i++) {
        	int left=i;
        	int right=i;
        	while(left-1>=0&&s.charAt(i)==s.charAt(left-1)) {
        		left--;
        	}
        	while(right+1<s.length()&&s.charAt(i)==s.charAt(right+1)) {
        		right++;
        	}
        	while(left-1>=0&&right+1<s.length()) {
        		if(s.charAt(left-1)==s.charAt(right+1)) {
        			left--;
        			right++;
        		}else {
        			break;
        		}
        	}
        	if(max<right-left+1) {
        		max=right-left+1;
        		res=s.substring(left,right+1);
        	}
        }
        return res;
    }
}
