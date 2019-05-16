package leetcode.复习;

public class 最长回文子序列 {
	public int longestPalindromeSubseq(String s) {
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++) {
        	for(int j=0;j<dp[0].length;j++) {
        		if(i==j) {
        			dp[i][j]=1;
        		}
        	}
        }
        
        for(int i=s.length()-1;i>=0;i--) {
        	for(int j=i+1;j<s.length();j++) {
        		if(s.charAt(i)==s.charAt(j)) {
        			dp[i][j]=dp[i+1][j-1]+2;
        		}else {
        			dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
        		}
        	}
        	
        }
        
        return dp[0][s.length()-1];
    }
}
