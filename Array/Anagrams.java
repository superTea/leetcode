public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 14, 2014
     * @platform LeetCode OJ
     * 
     */ 
     
    public List<String> anagrams(String[] strs) {
        ArrayList<String> list = new ArrayList<String>();
        if(strs == null || strs.length == 0){
            return list;
        }
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        for(int i = 0; i < strs.length; i++){
            char[] charList = strs[i].toCharArray();
            Arrays.sort(charList);
            String str = new String(charList);
            if(!map.containsKey(str)){
                ArrayList<String> l = new ArrayList<String>();
                l.add(strs[i]);
                map.put(str,l);
            }else{
                map.get(str).add(strs[i]);
            }
        }
        
        Iterator iter = map.values().iterator();
        while(iter.hasNext()){
            ArrayList<String> l = (ArrayList<String>)iter.next();
            if(l.size() > 1){
                list.addAll(l);
            }
        }
        
        return list;
    }
}