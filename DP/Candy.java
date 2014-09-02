public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 1, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int candy(int[] ratings) {
        if(ratings == null || ratings.length == 0){
           return 0;
        } 
        
        int[] table = new int[ratings.length];
        table[0] = 1;
        
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                table[i] = table[i-1]+1;
            }else{
                table[i] = 1;
            }
        }
        
        int num = table[ratings.length-1];
        
        for(int j = ratings.length-2; j>=0; j--){
            int cur = 1;
            if(ratings[j] > ratings[j+1]){
                cur = table[j+1]+1;
            }
            num += Math.max(table[j], cur);
            table[j] = cur;
        }
        
        return num;
    }
}