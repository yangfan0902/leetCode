package leetcode.¸´Ï°;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class È«ÅÅÁĞ {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		List<List<Integer>> res=permute(nums);
	}
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        helper(nums,0,list,res);
        return res;
        
    }
	public static void helper(int[] nums,int left,List<Integer> list,List<List<Integer>> res) {
		if(left==nums.length-1) {
			list.add(nums[left]);
			res.add(list);
			return;
		}
		else {
			for(int i=left;i<nums.length;i++) {
				swap(nums,left,i);
				List<Integer> curlist=new ArrayList<>(list);
				curlist.add(nums[left]);
				helper(nums,left+1,curlist,res);
				swap(nums,left,i);
			}
		}
		
	}
	public static void swap(int[] arr,int l,int r) {
		int t=arr[l];
		arr[l]=arr[r];
		arr[r]=t;
	}
}
