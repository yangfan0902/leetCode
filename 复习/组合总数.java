package leetcode.复习;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 组合总数 {
	public static void main(String[] args) {
		int[] candidates= {2,3,5};
		List<List<Integer>> list=combinationSum(candidates, 8);
	}
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res=new LinkedList<List<Integer>>();
		List<Integer> tmp=new LinkedList<Integer>();
		Arrays.sort(candidates);
		find(candidates,target,tmp,res,0);
		return res;
		
	}
	public static void find(int[] candidates,int target,List<Integer> tmp,List<List<Integer>> res,int num) {
		if(target==0) {
			res.add(tmp);
			return;
		}
		if(target<candidates[0]) {
			return;
		}
		for(int i=num;i<candidates.length;i++) {
			List<Integer> list=new LinkedList<Integer>(tmp);
			list.add(candidates[i]);
			find(candidates,target-candidates[i],list,res,i);	
		}
	}
}
