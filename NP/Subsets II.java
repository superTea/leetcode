public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 6, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<List<Integer>> subsetsWithDup(int[] num) {
       ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
       returnList.add(new ArrayList<Integer>());
       if(num == null || num.length == 0){
           return returnList;
       }
       Arrays.sort(num);
       int start = 0;
       for(int i = 0; i < num.length; i++){
           int size = returnList.size();
           for(int j = start; j < size; j++){
               ArrayList<Integer> list = new ArrayList<Integer>(returnList.get(j));
               list.add(num[i]);
               returnList.add(list);
               }
           
           if(i < num.length-1 && num[i] == num[i+1]){
               start = size;
           }else{
               start = 0; 
           }
       }
       return returnList;
    }
}