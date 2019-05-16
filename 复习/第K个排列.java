package leetcode.¸´Ï°;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class µÚK¸öÅÅÁĞ {
	public static void main(String[] args) {
		String str=getPermutation(3, 5);
		System.out.print(str);
		HashMap map=new HashMap();
			
	}
	public static String getPermutation(int n, int k) {
        int[] arr=new int[n];
        List<String> res=new ArrayList<>();
		List <Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
        	arr[i]=i+1;
        }
        int[] flag=new int[1];
        flag[0]=0;
        helper(arr, 0, list, res,k,flag);
        res.sort(null);
    
        
        return res.get(k-1);
    }
	public static void helper(int[] arr,int left,List<Integer> list,List<String> res,int k,int[] flag){
		if(left==arr.length-1) {
			list.add(arr[left]);
			StringBuilder builder=new StringBuilder();
	        for(int x:list) {
	        	builder=builder.append(x);
	        }
			res.add(builder.toString());
			flag[0]=flag[0]+1;
			return;
		}
		for(int i=left;i<arr.length;i++) {
			swap(arr,i,left);
			List<Integer> curlist=new ArrayList<Integer>(list);
			curlist.add(arr[left]);
			helper(arr,left+1,curlist,res,k,flag);
			swap(arr,i,left);
			if(flag[0]==k+1000) {
				return;
			}
		}
	}
	public static void swap(int[] arr,int i,int j) {
		int k=arr[i];
		arr[i]=arr[j];
		arr[j]=k;
	}
}
