public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 1st, 2014
     * @platform LeetCode OJ
     * 
     * use EOR which is exclusive or operation
     */ 
    public int singleNumber(int[] A) {
        int num = 0;
        
        for(int a : A){
            num = num ^ a;
        }
        
        return num;
    }
}