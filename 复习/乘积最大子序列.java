package leetcode.复习;

public class 乘积最大子序列 {
	public int maxProduct(int[] nums) {
        int min=1;
        int max=1;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]<0) {
        		int t=min;
        		min=max;
        		max=t;
        	}
        	if(i==0) {
        		max=nums[0];
        		min=nums[0];
        	}else {
        		max=Math.max(nums[i], max*nums[i]);
            	min=Math.min(nums[i],min*nums[i]);
        	}
        	
        	
        	res=Math.max(res, max);
        }
        return res;
    }
}
