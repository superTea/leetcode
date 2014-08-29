public class Solution {
    /**
     * 
     * @author superTea
     * @date Aug 28, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        for(int i = 0; i < prices.length -1; i++){
            int diff = prices[i+1]-prices[i];
            if(diff > 0){
                profit += diff;
            }
        }
        
        return profit;
    }
}