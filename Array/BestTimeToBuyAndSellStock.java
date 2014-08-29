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
        int profit = 0;
        for(int i = 0; i< prices.length; i++){
            int buy = prices[i];
            for(int j = i; j < prices.length; j++){
                int sell = prices[j];
                if((sell - buy) > profit){
                    profit = sell - buy;
                } 
            }
        }
        return profit;
    }
}