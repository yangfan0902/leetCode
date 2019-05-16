package leetcode.¸´Ï°;

import java.util.ArrayList;
import java.util.List;

public class ×éºÏ {
	public static void main(String[] args) {
		List<List<Integer>> res=combine(4, 3);
	}
	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<Integer>();
        helper(res,list,1,n,k);
        return res;
    }
	public static void helper(List<List<Integer>> res,List<Integer> list,int left,int n,int k) {
		if(list.size()==k) {
			res.add(list);
			return;
		}
		for(int i=left;i<=n;i++) {
			List<Integer> curlist=new ArrayList<>(list);
			curlist.add(i);
			helper(res,curlist,i+1,n,k);
		}
	}
}
