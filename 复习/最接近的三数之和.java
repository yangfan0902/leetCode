package leetcode.复习;

import java.util.Arrays;

public class 最接近的三数之和 {
	public static void main(String[] args) {
		int nums[]= {-3,-2,-5,3,-4};
		int target=-1;
		System.out.print(threeSumClosest(nums,target));
	}
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		long res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++) {
        	int left=i+1;
        	int right=nums.length-1;
        	while(left<right) {
        		if(left<right&&nums[i]+nums[left]+nums[right]==target) {
        			return target;
        		}
        		if(left<right&&nums[i]+nums[left]+nums[right]<target) {
        			int n=target-(nums[i]+nums[left]+nums[right]);
        			if(Math.abs(target-res)>Math.abs(n)) {
        				res=nums[i]+nums[left]+nums[right];
        			}
        			while(left<right&&nums[left]==nums[left+1]) {
        				left++;
        			}
        			left++;
        		}
        		if(left<right&&nums[i]+nums[left]+nums[right]>target) {
        			int n=target-(nums[i]+nums[left]+nums[right]);
        			if(Math.abs(target-res)>Math.abs(n)) {
        				res=nums[i]+nums[left]+nums[right];
        			}
        			while(left<right&&nums[right]==nums[right-1]) {
        				right--;
        			}
        			right--;
        		}
        	}
        }
		return (int) res;
    }
}
