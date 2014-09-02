public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 1, 2014
     * @platform LeetCoe OJ
     * 
     * Better Solution : bottom up
     */ 
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0 || triangle == null){
            return 0;
        }
        
        int[] table = new int[triangle.size()];
        int last = triangle.size()-1;
        //initialize dp table
        for(int i = 0; i < triangle.get(last).size();i++){
            table[i] = triangle.get(last).get(i);
        }
        
        
        for(int i = last - 1; i >= 0; i--){
            for(int j = 0; j < triangle.get(i+1).size()-1; j++){
                table[j] = triangle.get(i).get(j) + Math.min(table[j], table[j+1]);
            }
        }
        
        return table[0];
    }
}