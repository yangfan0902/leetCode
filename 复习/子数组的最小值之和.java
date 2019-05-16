package leetcode.复习;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class 子数组的最小值之和 {
	public static void main(String[] args) {
		int[] A= {3,1,2,4};
		System.out.print(sumSubarrayMins(A));
	}
	
	public static int sumSubarrayMins(int[] A) {
		long res=0;
		int len=1;
		for(;len<=A.length;len++) {
			List<Integer> list=new LinkedList<>();
			list.add(0);
			for(int i=1;i<len;i++) {
				while(list.size()>0&&A[list.get(list.size()-1)]>A[i]) {
					list.remove(list.size()-1);
				}
				list.add(i);
			}
			res=res+A[list.get(0)];
			for(int j=len;j<A.length;j++) {
				while(list.size()>0&&(j-list.get(0))>=len) {
					list.remove(0);
				}
				while(list.size()>0&&A[list.get(list.size()-1)]>A[j]) {
					list.remove(list.size()-1);
				}
				list.add(j);
				
				res=res+A[list.get(0)];
			}
		}
		return (int) (res%(Math.pow(10, 9)+7));
    }
}
