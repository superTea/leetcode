public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 6, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<List<Integer>> subsets(int[] S) {
       ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
       returnList.add(new ArrayList<Integer>());
       if(S == null || S.length == 0){
           return returnList;
       }
        Arrays.sort(S);
        for(int i = 0; i < S.length; i++){
            int size = returnList.size();
            for(int j = 0; j < size; j++){
                ArrayList<Integer> list = new ArrayList<Integer>(returnList.get(j));
                list.add(S[i]);
                returnList.add(list);
            }
        }
        
        return returnList;
    }
}