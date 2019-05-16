package leetcode.复习;

import java.util.ArrayList;
import java.util.List;

public class 组合总和III {
	public static void main(String[] args) {
		List<List<Integer>> res=combinationSum3(3, 18);
	}
	public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        if(k==0||n==0) {
        	return res;
        }
        helper(res,list,1,k,n);
        return res;
    		
    }
	public static void helper(List<List<Integer>> res,List<Integer> list,int left,int k,int n) {
		if(list.size()==k) {
			int sum=0;
			for(int x:list) {
				sum+=x;
			}
			if(sum==n) {
				res.add(list);
			}
			return;
		}
		
		for(int i=left;i<n;i++) {
			List<Integer> curlist=new ArrayList<Integer>(list);
			if(i>9) {
				return;
			}
			curlist.add(i);
			helper(res,curlist,i+1,k,n);
		}
	}
}
