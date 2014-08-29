public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Aug 28, 2014
     * @platform LeetCode OJ
     * 
     */
     
    public int maxProfit(int[] prices) {
        int local = 0;
        int global = 0;
        
        for(int i = 0; i< prices.length-1; i++){
            local = Math.max(local+prices[i+1]-prices[i],0);
            global = Math.max(local,global);
        }
        
        return global;
    }
}