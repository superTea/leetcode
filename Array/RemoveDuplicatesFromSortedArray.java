public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Aug 28, 2014
     * @platform LeetCode OJ
     * 
     *Similar to Remove Element
     */ 
    public int removeDuplicates(int[] A) {
        if(A == null || A.length == 0){
            return 0;
        }
        
        int index = 1;
        for(int i = 1; i<A.length; i++){
            if(A[i] != A[i-1]){
                A[index++] = A[i];
            }
        }
        
        return index;
    }
}