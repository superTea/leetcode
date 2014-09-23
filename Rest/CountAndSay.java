public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 17, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public String countAndSay(int n) {
        if(n < 0){
            return "";
        }
        String read = "1";
        for(int i = 2; i<=n; i++){
            StringBuilder str = new StringBuilder();
            int count = 1;
            for(int j = 1; j < read.length(); j++){
                if(read.charAt(j) == read.charAt(j-1)){
                    count++;
                }else{
                    str.append(count);
                    str.append(read.charAt(j-1));
                    count = 1;
                }
            }
            str.append(count);
            str.append(read.charAt(read.length()-1));
            read = str.toString();
        }
        
        return read;
    }
}