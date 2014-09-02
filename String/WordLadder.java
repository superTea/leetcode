public class Solution {
    /**
     * 
     * @author superTea
     * @date Sup 2, 2014
     * @platform LeetCode OJ
     * Bread first traversal
     */ 
    public int ladderLength(String start, String end, Set<String> dict) {
        if(start.length() == 0 || start == null || end.length() == 0 || start == null || start.length() != end.length()){
            return 0;
        }
        
        LinkedList<String> queue = new LinkedList<String>();
        HashSet<String> visited = new HashSet<String>();
        int level = 1;
        int index = 1;
        int curIndex = 0;
        queue.add(start);
        visited.add(start);
        
        while(!queue.isEmpty()){
            String str = queue.pop();
            index--;
            for(int i = 0; i < str.length(); i++){
                char[] charLists = str.toCharArray();                
                for(char c = 'a'; c < 'z'; c++){
                    charLists[i] = c;
                    
                    String newst = new String(charLists);
                    if(newst.equals(end)){
                        return level + 1;
                    }
                    if(dict.contains(newst) && !visited.contains(newst)){
                        queue.add(newst);
                        visited.add(newst);
                        curIndex++;
                    }
                }
            }
            
            if(index == 0){
                index = curIndex;
                curIndex = 0;
                level++;
            }
        }
        
        return 0;
    }
}