public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 1, 2014
     * @platform LeetCode OJ
     * //use bruce force mehtod
     */ 
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int total = 0;
        int pointer = -1;
        for(int i = 0; i< gas.length; i++){
            int diff = gas[i] - cost[i];
            sum += diff;
            if(sum < 0){
                pointer = i;
                sum = 0;
            }
            total += diff;
        }
        
        return total >= 0? pointer+1 : -1;
    }
}