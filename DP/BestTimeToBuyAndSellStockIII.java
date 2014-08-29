public class Solution {
    /**
     * 
     * @author superTea
     * @date Aug 29, 2014
     * @platform LeetCoe OJ
     * 
     */
     
    public int maxProfit(int[] prices) {
        int[] local = new int[3];
        int[] global = new int[3];
        
        for(int i = 0; i<prices.length-1; i++){
            int diff = prices[i+1] - prices[i];
            for(int k = 2; k > 0; k--){
                local[k] = Math.max(global[k-1]+Math.max(diff,0),local[k]+diff);
                global[k] = Math.max(local[k],global[k]);
            }
        }
        
        return global[2];
    }
}