package leetcode.¸´Ï°;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ×Ó¼¯ {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		 List<List<Integer>> list=subsets(arr);
	}
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res=new ArrayList<>();
		for(int x:nums) {
			List<Integer> list=new ArrayList<Integer>();
			list.add(x);
			res.add(list);
		}
		
		for(int x:nums) {
			List<List<Integer>> temlist=new ArrayList<>();
			for(List<Integer> list:res) {
				if(list.size()==1&&list.get(0)==x||list.contains(x)) {
					continue;
				}
				List<Integer> newlist=new ArrayList<Integer>(list);
				newlist.add(x);
				temlist.add(newlist);
			}
			res.addAll(temlist);
		}
		HashSet<List<Integer>> set=new HashSet<List<Integer>>();
		for(List<Integer> list:res) {
			list.sort(null);
			set.add(list);
		}
		List<List<Integer>> finalres=new ArrayList<List<Integer>>();
		for(List<Integer> l:set) {
			finalres.add(l);
		}
		finalres.add(new ArrayList<Integer>());
		return finalres;
		
	}
}
