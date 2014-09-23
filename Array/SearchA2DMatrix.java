public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 8, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int lowR = 0;
        int highR = matrix.length - 1;
        while(lowR <= highR){
            int midR = (lowR + highR) / 2;
            if(matrix[midR][0] == target){
                return true;
            }
            if(matrix[midR][0] > target){
                highR = midR -1;
            }else{
                lowR = midR + 1;
            }
        }
        if(highR < 0){
            return false;
        }
        int left = 0;
        int right = matrix[0].length - 1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            if(matrix[highR][mid] == target){
                return true;
            }
            if(matrix[highR][mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        
        return false;
    }
}