public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 6, 2014
     * @platform LeetCode OJ
     * 
     */
    public List<String[]> solveNQueens(int n) {
       ArrayList<String[]> list = new ArrayList<String[]>();
       if(n == 0){
           return list;
       }
       helper(n, 0, new int[n], list);
       return list;
    }
    
    public void helper(int n, int row, int[] columnForRows, ArrayList<String[]> list){
        if(n == row){
            String[] item = new String[n];
            for(int i = 0; i < n; i++){
                StringBuilder str = new StringBuilder();
                for(int j = 0; j < n; j++){ //column
                    if(columnForRows[i] == j){
                        str.append("Q");
                    }else{
                        str.append(".");
                    }
                }
                item[i] = str.toString();
            }
            list.add(item);
            return;
        }
        
        for(int i = 0; i < n; i++){
            columnForRows[row] = i; 
            if(isValid(row, columnForRows)){
                helper(n, row + 1, columnForRows, list);
            }
        }
    }
    
    public boolean isValid(int row, int[] columnForRows){
        for(int i = 0; i < row; i++){
            if(columnForRows[row] == columnForRows[i] || Math.abs(columnForRows[row] - columnForRows[i]) == row - i){
                return false;
            }
        }
        
        return true;
    }
}