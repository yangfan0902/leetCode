package leetcode.¸´Ï°;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class È«ÅÅÁĞII {
	static HashSet<List<Integer>> set=new HashSet<>();
	public static void main(String[] args) {
		int[] nums= {1,1,2};
		List<List<Integer>> res=permuteUnique(nums);
	}
	public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        helper(nums,0,list,res);
        return res;
    }
	public static void helper(int[] nums,int left,List<Integer> list,List<List<Integer>> res) {
		if(left==nums.length-1) {
			list.add(nums[left]);
			if(!set.contains(list)) {
				res.add(list);
				set.add(list);
			}
			return;
		}
		for(int i=left;i<nums.length;i++) {
			if(i>left&&nums[i]==nums[left]) {
				continue;
			}
			if(i>left+1&&nums[i]==nums[i-1]) {
				continue;
			}
			swap(nums,i,left);
			List<Integer> curlist=new ArrayList<>(list);
			curlist.add(nums[left]);
			helper(nums,left+1,curlist,res);
			swap(nums,i,left);
		}
		
	}
	public static void swap(int[] arr,int l,int r) {
		int t=arr[l];
		arr[l]=arr[r];
		arr[r]=t;
	}
}
