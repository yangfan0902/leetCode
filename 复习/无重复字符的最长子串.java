package leetcode.复习;

import java.util.Arrays;
import java.util.HashSet;

public class 无重复字符的最长子串 {
	public static void main(String[] args) {
		String str="www";
		System.out.print(lengthOfLongestSubstring(str));
	}
	public static int lengthOfLongestSubstring(String s) {
		if(s==null||s.length()==0){
            return 0;
        }
        int[] len=new int[s.length()];
        HashSet<Character> set=new HashSet<>();
        set.add(s.charAt(0));
        len[0]=1;
        int left=0;
        for(int i=1;i<s.length();i++) {       	
        	if(set.contains(s.charAt(i))) {
        		int k=0;
        		for(int j=i-1;j>=left;j--) {
        			k++;
        			if(s.charAt(j)==s.charAt(i)) {
        				break;
        			}
        		}
        		len[i]=k;
        		for(int j=left;j<i-k+1;j++) {
        			set.remove(s.charAt(j));
        		}
        		left=i-k+1;
        		set.add(s.charAt(i));
        	}else {
        		len[i]=len[i-1]+1;
        		set.add(s.charAt(i));
        	}
        	
        	
        }
        Arrays.sort(len);
        return len[len.length-1];
    }
}
