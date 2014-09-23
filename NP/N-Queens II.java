public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 16, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int totalNQueens(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        helper(n, 0 , new int[n], list);
        return list.get(0);
    }
    
    public void helper(int n, int row, int[] columnForRow, ArrayList<Integer> list){
        if(row == n){
            list.set(0, list.get(0)+1);
            return;
        }
        for(int i = 0; i < n; i++){
            columnForRow[row]=i;
            if(check(row, columnForRow)){
               helper(n, row + 1, columnForRow, list);
            }
        }
    }
    
    public boolean check(int row, int[] columnForRow){
        for(int i = 0; i < row; i++){
            if(columnForRow[i] == columnForRow[row] || Math.abs(columnForRow[row] - columnForRow[i]) == row - i){
                return false;
            }
        }
        return true;
    }
}