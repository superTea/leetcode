public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 9, 2014
     * @platform LeetCode OJ
     * 
     * use Fibonacci
     */ 
    public int climbStairs(int n) {
        int num1 = 1;
        int num2 = 2;
        
        if(n == num1){
            return num1;
        }
        
        if(n == num2){
            return num2;
        }
        
        for(int i = 3; i <= n; i++){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        
        return num2;
    }
}