public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 9, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int sqrt(int x) {
        if(x < 0) return -1;
        if(x == 0) return 0;
        
        int left = 1;
        int right = x / 2 + 1;
        
        while(left <= right){
            int m = (left + right) / 2;
            if(m <= x / m && x/(m + 1) < m + 1){
                return m;
            }
            
            if(x/m < m){
                right =  m - 1;
            }else{
                left = m + 1;
            }
        }
        
        return 0;
    }
}