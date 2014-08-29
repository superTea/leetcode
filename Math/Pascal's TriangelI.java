public class Solution {
    /**
     * 
     * @author superTea
     * @date Aug 29, 2014
     * @platform LeetCode OJ
     * 
     */
     
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<Integer>();        
        if(rowIndex < 0){
            return list;
        }
        list.add(1);
        for(int i = 1; i <= rowIndex; i++){
            list.add(1);
            for(int j = i-1; j > 0; j--){
                list.set(j, list.get(j)+list.get(j-1));
            }
        }
        return list;
    }
}