package leetcode.复习;

import java.util.Arrays;

public class 下一个排列 {
	public static void main(String[] args) {
		int[] nums= {4,2,0,2,3,2,0};
		nextPermutation(nums);
	}
	public static void nextPermutation(int[] nums) {
		if(nums==null||nums.length<=1) {
			return;
		}
        int n;
        int index=-1;
        int change=-1;
        for(int i=nums.length-1;i>=0;i--) {
        	n=nums[i];
        	for(int j=i;j>=0;j--) {
        		if(nums[j]<n) {
        			if(j>change) {
        				index=i;
                		change=j;
        			}
            	}
        	}
        }
        if(index==-1) {
        	int left=0;
        	int right=nums.length-1;
        	while(left<right) {
        		swap(nums,left,right);
        		left++;
        		right--;
        	}
        }else {
        	swap(nums,change,index);
        	Arrays.sort(nums, change+1, nums.length);
        }
        
    }
	public static void swap(int[] arr,int l,int r) {
		int t=arr[l];
		arr[l]=arr[r];
		arr[r]=t;
	}
}
