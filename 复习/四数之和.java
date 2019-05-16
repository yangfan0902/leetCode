package leetcode.复习;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 四数之和 {
	public static void main(String[] args) {
		int[] nums= {0,0,0,0};
		int target=1;
		List<List<Integer>> list=fourSum(nums,target);
		System.out.print(list);
	}
	
	public static List<List<Integer>> fourSum(int[] nums,int target) {
		List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int j=0;j<nums.length;j++) {
        	if(j>0&&nums[j]==nums[j-1]) {
        		continue;
        	}
        	for(int i=j+1;i<nums.length-2;i++) {
        		if(i>j+1&&nums[i]==nums[i-1]) {
        			continue;
        		}
            	int left=i+1;
            	int right=nums.length-1;
            	while(left<right) {
            		if(nums[left]+nums[right]+nums[i]+nums[j]==target) {
            			List<Integer> list=new ArrayList<Integer>();
            			list.add(nums[j]);
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
            		}else if(nums[left]+nums[right]+nums[i]+nums[j]<target) {
            			while(left<right&&nums[left]==nums[left+1]) {
            				left++;
            			}
            			left++;
            		}else if(nums[left]+nums[right]+nums[i]+nums[j]>target) {
            			while(left<right&&nums[right]==nums[right-1]) {
            				right--;
            			}
            			right--;
            		}
            	}
            	
            }
        }
        
        return res;
    }
}
