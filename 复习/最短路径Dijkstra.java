package leetcode.¸´Ï°;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class ×î¶ÌÂ·¾¶Dijkstra {

}
class Solution {
    public static int networkDelayTime(int[][] times, int N, int K) {
		HashMap<Integer, List<int[]>> map = new HashMap<>();
		for (int[] x : times) {
			int src = x[0];
			int des = x[1];
			int fee = x[2];
			if (!map.containsKey(src)) {
				map.put(src, new LinkedList<int[]>());
			}
			map.get(src).add(new int[] { des, fee });
		}
		HashMap<Integer, Integer> dist = new HashMap<Integer, Integer>();
		HashMap<Integer,int[]> cache=new HashMap<Integer, int[]>();
		for (int i = 1; i <= N; i++) {
			dist.put(i, Integer.MAX_VALUE);
		}
		HashSet<Integer> set = new HashSet<>();
		List<Integer> list = new LinkedList<Integer>();

		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {

			@Override
			public int compare(int[] arg0, int[] arg1) {
				return arg0[1] - arg1[1];
			}
		});
		dist.put(K, 0);
		pq.add(new int[] { K, 0 });
		while (pq.size() != 0) {
			int[] cur = pq.poll();
			if(set.contains(cur[0]))
				continue;
			list.add(cur[0]);
			set.add(cur[0]);
			List<int[]> curList = map.get(cur[0]);
			if (curList == null) {
				continue;
			}
			for (int[] arr : curList) {
				int dest = arr[0];
				int fee = arr[1];
				if (!set.contains(dest)) {
					dist.put(dest,(dist.get(cur[0]) + fee) > dist.get(dest) ? dist.get(dest) : (dist.get(cur[0]) + fee));
						int[] newarr=new int[] {dest, dist.get(dest) };
						pq.offer(newarr);
						cache.put(dest,newarr);
					
					
				}
			}
		}
		Set<Integer> keySet = dist.keySet();
		int max = -1;
		for (int x : keySet) {
			max = max > dist.get(x) ? max : dist.get(x);
		}
		return max<Integer.MAX_VALUE?max:-1;

	}
		
}