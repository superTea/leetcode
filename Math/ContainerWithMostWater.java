public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 22, 2014
     * @platoform LeetCode OJ
     * 
     */ 
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return Integer.MIN_VALUE;
        }
        
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while (r > l){
            max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        
        return max;
    }
}