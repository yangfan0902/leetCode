package leetcode.¸´Ï°;

public class Ä¿±êºÍ {
	public int findTargetSumWays(int[] nums, int S) {
		int sum=0;
		for(int x:nums) {
			sum+=x;
		}
		if((sum+S)%2!=0) {
			return 0;
		}
		sum=(sum+S)/2;
		int[] dp=new int[sum+1];
		dp[0]=1;
		for(int i=0;i<nums.length;i++) {
			for(int j=sum;j>=nums[i];j--) {
				dp[j]=dp[j]+dp[j-nums[i]];
			}
		}
		return dp[sum];
	}
}
