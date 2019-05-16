package leetcode.¸´Ï°;

public class ×îµÍÆ±¼Û {
	public static void main(String[] args) {
		int[] days= {1,4,6,7,8,20};
		int[] costs= {2,7,15};
		System.out.print(mincostTickets(days, costs));
	}
	public static int mincostTickets(int[] days, int[] costs) {
		int[] arr=new int[366];
		int j=0;
		arr[0]=0;
		for(int i=1;i<arr.length;i++) {
			if(j<days.length&&days[j]==i) {
				j++;
				int dayfee=arr[Math.max(0, i-1)]+costs[0];
				int weekfee=arr[Math.max(0, i-7)]+costs[1];
				int monthfee=arr[Math.max(0, i-30)]+costs[2];
				arr[i]=Math.min(Math.min(dayfee, weekfee),monthfee);
				if(j>=days.length) {
					return arr[i];
				}
			}else {
				arr[i]=arr[i-1];
			}
		}
		return arr[365];
		
	}
}
