public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 7, 2014
     * @platform LeetCode OJ
     * 
     * use counting sort
     */ 
    public void sortColors(int[] A) {
        if(A.length == 0 || A == null){
            return;
        }
        
        int[] res = new int[A.length];
        int[] count = new int[3];
        for(int i = 0; i < A.length; i++){
            count[A[i]]++;
        }
        
        for(int i = 1; i < 3; i++){
            count[i] = count[i] + count[i-1];
        }
        
        for(int i = A.length-1; i >= 0; i--){
            res[count[A[i]]-1] = A[i];
            count[A[i]]--;
        }
        
        for(int i = 0; i < A.length; i++){
            A[i] = res[i];
        }
    }
}