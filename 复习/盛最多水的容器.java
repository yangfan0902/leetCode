package leetcode.��ϰ;

public class ʢ���ˮ������ {
	public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right) {
        	int lheight=height[left];
        	int rheight=height[right];
        	int tem=(right-left)*Math.min(lheight,rheight);
        	max=max>tem?max:tem;
        	if(lheight<rheight) {
        		left++;
        	}
        	else if(lheight>rheight) {
        		right--;
        	}else {
        		right--;
        		left++;
        	}
        }
        return max;
    }
}
