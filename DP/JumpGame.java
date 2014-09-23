public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 14, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public boolean canJump(int[] A) {
        if(A == null || A.length == 0){
            return false;
        }
        int num = 0;
        for(int i = 0; i < A.length && i <= num; i++){
            num = Math.max(A[i] + i, num);
        }
        if(num < A.length - 1){
            return false;
        }
        return true;
    }
}