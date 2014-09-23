public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 22, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<String> letterCombinations(String digits) {
        ArrayList<String> returnList = new ArrayList<String>();
        returnList.add("");
        if(digits == null || digits.length() == 0){
            return returnList;
        }
        for(int i = 0; i < digits.length(); i++){
            String letters = getLetter(digits.charAt(i));
            ArrayList<String> newList = new ArrayList<String>();
            for(int j = 0; j < returnList.size(); j++){
                for(int k = 0; k < letters.length(); k++){
                    newList.add(returnList.get(j) + Character.toString(letters.charAt(k)));
                }
            }
            returnList = newList;
        }
        return returnList;
    }
    
    public String getLetter(Character cha){
        switch(cha){
            case '9':
                return "wxyz";
            case '8':
                return "tuv";
            case '7':
                return "pqrs";
            case '6':
                return "mno";
            case '5':
                return "jkl";
            case '4':
                return "ghi";
            case '3':
                return "def";
            case '2':
                return "abc";
            default:
                return "";
        }
    }
}