package leetcode.¸´Ï°;

import java.util.LinkedList;
import java.util.List;

public class µ¥´Ê²ð·Ö {
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("leet");
		list.add("code");
		String str="leetcode";
		System.out.print(wordBreak(str,list));
	}
	public static boolean wordBreak(String s, List<String> wordDict) {
		boolean[] arr=new boolean[s.length()+1];
		for(int i=1;i<=s.length();i++) {
			for(int j=i-1;j>=0;j--) {
				if(j==0) {
					arr[i]=wordDict.contains(s.substring(j,i));
				}else {
					arr[i]=wordDict.contains(s.substring(j,i))&&arr[j];
				}
				if(arr[i]) {
					break;
				}
			}
		}
		return arr[s.length()];
	}
}
