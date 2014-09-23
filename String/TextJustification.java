public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 11, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<String> fullJustify(String[] words, int L) {
        ArrayList<String> list = new ArrayList<String>();
        if(words == null || words.length == 0){
            return list;
        }
        
        int cur = 0;
        int last  = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].length() + cur + i - last > L){
                StringBuilder str = new StringBuilder();
                int spaceNum = 0;
                int extraNum = 0;
                if(i - last -1 > 0){
                    spaceNum = (L - cur)/(i - last - 1);
                    extraNum = (L - cur)%(i - last - 1);
                }
                for(int j = last; j < i; j++){
                    str.append(words[j]);
                    if(j <i -1){
                        for(int k = 0; k < spaceNum; k++){
                            str.append(" ");
                        }
                        if(extraNum > 0){
                            str.append(" ");
                        }
                        extraNum--;
                    }
                }
                for(int j = str.length(); j < L; j++){
                    str.append(" ");
                }
                list.add(str.toString());
                cur = 0;
                last = i;
            }
            cur += words[i].length();
        }
        StringBuilder str = new StringBuilder();
        for(int i = last; i < words.length; i++){
            str.append(words[i]);
            if(str.length() < L){
                str.append(" ");
            }
        }
        for(int i = str.length(); i < L; i++){
            str.append(" ");
        }
        list.add(str.toString());
        return list;
    }
}