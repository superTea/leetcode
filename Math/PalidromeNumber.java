public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 22, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int div = 1;
        while(div <= x / 10){
            div *= 10;
        }
        while(x > 0){
            if(x/div != x%10){
                return false;
            }
            x = (x%div)/10;
            div /= 100;
        }
        
        return true;
    }
}