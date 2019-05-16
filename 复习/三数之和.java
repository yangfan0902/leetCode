package leetcode.复习;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {
	public static void main(String[] args) {
		int[] arr= {0,0,0,0};
		List<List<Integer>> list=threeSum(arr);
		System.out.print(list);
	}
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
        	if(i>0&&nums[i]==nums[i-1]) {
        		continue;
        	}
        	int left=i+1;
        	int right=nums.length-1;
        	while(left<right) {
        		if(nums[left]+nums[right]+nums[i]==0) {
        			List<Integer> list=new ArrayList<Integer>();
        			list.add(nums[i]);
        			list.add(nums[left]);
        			list.add(nums[right]);
        			res.add(list);
        			while(left<right&&nums[left]==nums[left+1]) {
        				left++;
        			}
        			while(left<right&&nums[right]==nums[right-1]) {
        				right--;
        			}
        			left++;
        			right--;
        		}else if(nums[left]+nums[right]+nums[i]<0) {
        			while(left<right&&nums[left]==nums[left+1]) {
        				left++;
        			}
        			left++;
        		}else if(nums[left]+nums[right]+nums[i]>0) {
        			while(left<right&&nums[right]==nums[right-1]) {
        				right--;
        			}
        			right--;
        		}
        	}
        	
        }
        return res;
    }
}
