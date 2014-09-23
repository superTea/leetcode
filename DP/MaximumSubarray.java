public class Solution {

    /**

     *
 
    *
 
    * @author superTea
     
     * @date Sep 14, 2014
     
     * @platform LeetCode OJ
     
     * 
     
     */
     
    
     public int maxSubArray(int[] A) {

        if(A == null || A.length == 0){

            return 0;
        
	}

        int local = A[0];

        int global = A[0];

        for(int i = 1; i < A.length; i++){

            local = Math.max(A[i], local + A[i]);

            global = Math.max(local, global);

        }

        
return global;

    }

}