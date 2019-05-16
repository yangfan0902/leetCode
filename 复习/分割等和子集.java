package leetcode.复习;

public class 分割等和子集 {
	public static void main(String[] args) {
		int[] arr= {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};
		System.out.print(canPartition(arr));
	}
	public static boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums) {
        	sum+=x;
        }
        if(sum%2!=0) {
        	return false;
        }
        sum=sum/2;
        
        int[] arr=new int[sum+1];
        arr[0]=1;
        for(int i=1;i<nums.length;i++) {
        	for(int j=arr.length-1;j>=nums[i];j--) {
        		arr[j]=arr[j]+arr[j-nums[i]];
        	}
        }
        if(arr[arr.length-1]!=0) {
        	return true;
        }
        return false;
    }
}
