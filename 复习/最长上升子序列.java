package leetcode.复习;

public class 最长上升子序列 {
	
	public static void main(String[] args) {
		int[] arr= {1,3,6,7,9,4,10,5,6};
		int res=lengthOfLIS(arr);
		System.out.print(res);
 	}
	public static int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int[] dp=new int[nums.length];
        dp[0]=1;
        int max=1;
        for(int i=1;i<nums.length;i++) {
        	boolean flag=true;
        	int tmax=1;
        	for(int j=i-1;j>=0;j--){
        		
        		if(nums[i]>nums[j]){
        			dp[i]=Math.max(tmax, dp[j]+1);
        			tmax=dp[i];
        			flag=false;
        		}
        	}
        	if(flag) {
        		dp[i]=1;
        	}
        	max=max>dp[i]?max:dp[i];
        }
        return max;
    }
}
