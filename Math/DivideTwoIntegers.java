public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 18, 2014
     * @platform LeetCode OJ
     * 
     */ 
        public int divide(int dividend, int divisor) {
            if(divisor == 0){
                return Math.MAX_VALUE;
            }
            
            int value = 0;
            if(dividend == Integer.MIN_VALUE){
                value = 1;
                dividend += Math.abs(divisor);
            }
            if(divisor == Integer.MIN_VALUE){
                return value;
            }
            
            boolean isNeg = ((dividend^divisor)>>>31 == 1)? true : false;
            int digit = 0;
            int d1 = Math.abs(dividend);
            int d2 = Math.abs(divisor);
            while(d2 <= (d1 >> 1)){
                divisor << 1;
                digit++;
            }
            while(digit > 0){
                if(d1 >= d2){
                    d1 -= d2;
                    value += 1<<digit;
                }
                d2 >> 1;
                digit --;
            }
            
            return isNeg? -value: value;
    }
}