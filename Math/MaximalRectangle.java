public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 5, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int maximalRectangle(char[][] matrix) {
       if(matrix.length == 0 || matrix == null || matrix[0].length == 0){
           return 0;
       }
       
       int[] height = new int[matrix[0].length];
       int maxArea = 0;
       for(int i = 0; i < matrix.length; i++){
           for(int j = 0; j < height.length; j++){
               height[j] = matrix[i][j] == '0'? 0 : height[j]+1;
           }
           maxArea = Math.max(findArea(height), maxArea);
       }
       return maxArea;
    }
    
    public int findArea(int[] height){
        if(height.length == 0 || height == null){
            return 0;
        }
        
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int maxArea = 0;
        
        for(int i = 0; i < height.length; i++){
            while(!stack.isEmpty() && height[i] <= height[stack.peek()]){
                int index = stack.pop();
                int curValue = stack.isEmpty()? i * height[index] : (i - stack.peek() - 1) * height[index];
                maxArea = Math.max(curValue, maxArea);
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            int index = stack.pop();
            int curValue = stack.isEmpty()? height.length * height[index] : (height.length - stack.peek() - 1) * height[index];
            maxArea = Math.max(curValue, maxArea);
        }
        
        return maxArea;
    }
}