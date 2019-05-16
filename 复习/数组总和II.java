package leetcode.复习;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 数组总和II {
	public static void main(String[] args) {
		int[] candidates= {10,1,2,7,6,1,5};
		List<List<Integer>> list=combinationSum2(candidates, 8);
	}
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
			if(i!=num&&candidates[i]==candidates[i-1]) {
				continue;
			}
			List<Integer> list=new LinkedList<Integer>(tmp);
			list.add(candidates[i]);
			find(candidates,target-candidates[i],list,res,i+1);
		}
	}
}
