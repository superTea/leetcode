public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 14, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public double pow(double x, int n) {
        if(n == 0){
            return 1.0;
        }
        double half = pow(x, n / 2);
        if(n % 2 == 0){
            return half * half;
        }else if(n > 0){
            return half * half * x;
        }else{
            return half * half / x;
        }
        
        
    }
}