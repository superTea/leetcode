public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 1, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int singleNumber(int[] A) {
        int[] digits = new int[32];
        int num = 0;
        for(int i = 0; i < 32; i++){
            for(int j = 0; j < A.length; j++){
                digits[i] += (A[j] >> i) & 1;
            }
        }
        
        for(int i = 0; i < digits.length; i++){
            num += (digits[i] % 3) << i;
        }
        
        return num;
    }
}