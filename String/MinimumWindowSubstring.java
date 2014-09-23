public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 8, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public String minWindow(String S, String T) {
        if(S == null || T == null || S.length() == 0 || T.length() == 0){
            return null;
        }
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < T.length(); i++){
            if(map.containsKey(T.charAt(i))){
                map.put(T.charAt(i), map.get(T.charAt(i))+1);
            }else{
                map.put(T.charAt(i), 1);
            }
        }
        
        int pre = 0;
        int count = 0;
        String returnWord = "";
        int minLength = S.length() + 1;
        
        for(int i = 0; i < S.length(); i++){
            if(map.containsKey(S.charAt(i))){
                map.put(S.charAt(i), map.get(S.charAt(i))-1);
                if(map.get(S.charAt(i)) >= 0){
                    count++;
                }
                while(count == T.length()){
                    if(map.containsKey(S.charAt(pre))){
                        map.put(S.charAt(pre),map.get(S.charAt(pre))+1);
                        if(map.get(S.charAt(pre)) > 0){
                            if(minLength > i - pre + 1){
                                returnWord = S.substring(pre, i + 1);
                                minLength = i - pre + 1;
                            }
                            count--;
                        }
                    }
                    pre++;
                }
            }
        }
        return returnWord;
    }
}