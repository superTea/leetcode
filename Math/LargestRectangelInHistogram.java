public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @Sep 5, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int largestRectangleArea(int[] height) {
        if(height.length == 0 || height == null){
            return 0;
        }
        
        int maxArea = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        for(int i = 0; i < height.length; i++){
            while(!stack.isEmpty() && height[i] <= height[stack.peek()]){
                int index = stack.pop();
                int curValue = stack.isEmpty() ? i * height[index] : (i - stack.peek() - 1) * height[index];
                maxArea = Math.max(curValue, maxArea);
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            int index = stack.pop();
            int curValue = stack.isEmpty() ? height.length * height[index] : (height.length - stack.peek() - 1) * height[index];
            maxArea = Math.max(curValue, maxArea);
        }
        
        return maxArea;
    }
}