public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 2, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int longestConsecutive(int[] num) {
        if(num.length == 0 || num == null){
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<Integer>();
        int globalMax = 1;
        
        // put element of num into set
        for(int i = 0; i < num.length; i++){
            set.add(num[i]);
        }
        
        while(!set.isEmpty()){
            Iterator iter = set.iterator();
            int item = (Integer)iter.next();
            int localMax = 1;
            set.remove(item);
            
            int value = item - 1;
            while(set.contains(value)){
                localMax++;
                set.remove(value--);
            }
            
            value = item + 1;
            while(set.contains(value)){
                localMax++;
                set.remove(value++);
            }
            
            if(localMax > globalMax){
                globalMax = localMax;
            }
        }
        
        return globalMax;
    }
}