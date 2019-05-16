package leetcode.¸´Ï°;

public class µ¥´ÊËÑË÷ {
	public static void main(String[] args) {
		char[][] board= {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
				};
		System.out.print(exist(board, "ABFE"));
	}
	public static boolean exist(char[][] board, String word) {
		boolean[][] marked=new boolean[board.length][board[0].length];
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(word.charAt(0)==board[i][j]) {
					if(helper(board,marked,i,j,0,word)) {
						return true;
					}
				}
			}
		}
		return false;
    }
	public static boolean helper(char[][] board,boolean[][] marked,int i,int j,int left,String word) {
		if(i<board.length&&i>=0&&j>=0&&j<board[0].length) {
			if(left==word.length()-1&&!marked[i][j]&&board[i][j]==word.charAt(left)) {
				return true;
			}
			
			if(board[i][j]!=word.charAt(left)||marked[i][j]) {
				return false;
			}
			
			marked[i][j]=true;
			boolean res=helper(board,marked,i+1,j,left+1,word)||
						helper(board,marked,i-1,j,left+1,word)||
						helper(board,marked,i,j+1,left+1,word)||
						helper(board,marked,i,j-1,left+1,word);
			marked[i][j]=false;
			return res;
			
		}
		return false;
	}
}
