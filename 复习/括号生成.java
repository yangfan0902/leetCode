package leetcode.¸´Ï°;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class À¨ºÅÉú³É {
	public static void main(String[] args) {
		Solution s=new Solution();
		List<String> list=s.generateParenthesis(3);
	}
}
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        helper(n, n, "", res);
        return res;
    }
    void helper(int left, int right, String out, List<String> res) {
       if(left<0||right<0||left>right) {
    	   return;
       }
       if(left==right&&left==0) {
    	   res.add(out);
    	   return;
       }
       helper(left-1,right, out+"(", res);
       helper(left,right-1, out+")", res);
       
    }
}
