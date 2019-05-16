package leetcode.∏¥œ∞;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ∏¥‘≠IPµÿ÷∑ {
	public static void main(String[] args) {
		String s="2552550113";
		List<String> res=restoreIpAddresses(s);
	}
	public static List<String> restoreIpAddresses(String s) {
		HashSet<List<String>> set=new HashSet<>();
        List<List<String>> res=new ArrayList<List<String>>();
        List<String> list=new ArrayList<String>();
        helper(res,list,0,s,set);
        List<String> finalres=new ArrayList<String>();
        for(List<String> x:res) {
        	String tem="";
        	for(String n:x) {
        		tem=tem+n+".";
        	}
        	finalres.add(tem.substring(0, tem.length()-1));
        } 
        return finalres;
    		
    }
	public static void helper(List<List<String>> res,List<String> list,int left,String s,HashSet<List<String>> set) {
		if(left==s.length()&&list.size()==4) {
			if(!set.contains(list)) {
				res.add(list);
				set.add(list);
			}
			return;
		}
		if(list.size()==4) {
			return;
		}
		for(int i=1;i<=3&&left+i<=s.length();i++) {
			if(s.charAt(left)=='0') {
				List<String> curlist=new ArrayList<String>(list);
				curlist.add("0");
				helper(res,curlist,left+1,s,set);
				continue;
			}
			List<String> curlist=new ArrayList<String>(list);
			String substr=s.substring(left,left+i);
			if(Integer.parseInt(substr)>255) {
				continue;
			}
			curlist.add(substr);
			helper(res,curlist,left+i,s,set);
		}
		
	}
}
