public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep. 9, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int[] plusOne(int[] digits) {
       if(digits == null || digits.length == 0){
           return null;
       }
       int carry = 1;
       for(int i = digits.length - 1; i >= 0; i--){
           int digit = (digits[i] + carry ) % 10;
           carry = (digits[i] + carry) / 10;
           digits[i] = digit;
           if(carry == 0){
               return digits;
           }
       }
       
       int[] res = new int[digits.length + 1]; //999999+1
       res[0] = 1;
       return res;
    }
}