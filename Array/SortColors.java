public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 7, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public void sortColors(int[] A) {
        if(A.length == 0 || A == null){
            return;
        }
        
        int n0 = 0;
        int n1 = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                A[i] = 2;
                A[n1++] = 1;
                A[n0++] = 0;
            }
            else if(A[i] == 1){
                A[i] = 2;
                A[n1++] = 1;
            }
        }
    }
}