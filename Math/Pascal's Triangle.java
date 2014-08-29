public class Solution {
    /**
     * 
     * @author superTea
     * @date Aug 29, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> list = new ArrayList<List<Integer>>();
       if(numRows<=0){
           return list;
       }
       ArrayList<Integer> line1 = new ArrayList<Integer>();
       line1.add(1);
       list.add(line1);
       for(int i = 2; i <= numRows; i++){
           ArrayList<Integer> line = new ArrayList<Integer>();
           line.add(1);
           for(int j = 1; j < i-1; j++){
               int num = list.get(i-2).get(j-1)+list.get(i-2).get(j);
               line.add(num);
           }
           line.add(1);
           list.add(line);
       }
       
       return list;
    }
}