public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 22, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int atoi(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }
        boolean isNeg = false;
        str = str.trim(); // Must have 
        int i = 0;
        if(str.charAt(0) == '-' || str.charAt(0) == '+'){
            i++;
            if(str.charAt(0) == '-'){
                isNeg = true;
            }
        }
        int value = 0;
        while(i < str.length()){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                break;
            }
            int digit = (int)(str.charAt(i) - '0');
            // if overflow
            if(isNeg && value > -((Integer.MIN_VALUE + digit) / 10)){
                return Integer.MIN_VALUE;
            }
            if(!isNeg && value > (Integer.MAX_VALUE - digit) / 10){
                return Integer.MAX_VALUE;
            }
            value  = value * 10 + digit;
            i++;
        }
        
        return isNeg? -value : value;
    }
}