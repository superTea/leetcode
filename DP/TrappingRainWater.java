public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 1, 2014
     * @platform LeetCode
     * 
     */ 
    public int trap(int[] A) {
       if(A.length == 0 || A == null){
           return 0;
       } 
       int max = 0;
       int water = 0;
       int[] table = new int[A.length];
       for(int i = 0; i < A.length; i++){
           table[i] = max;           
           max = Math.max(A[i],max);
       }
       max = 0;
       for(int j = A.length-1; j>=0; j--){
           table[j] = Math.min(max,table[j]);
           max = Math.max(A[j], max);
           water += table[j]-A[j] > 0 ? table[j]-A[j] : 0;
       }
       return water;
    }
}